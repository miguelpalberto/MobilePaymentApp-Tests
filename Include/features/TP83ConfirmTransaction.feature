Feature: Confirm transaction
As a user I want to confirm my transaction
so that I can send money to my contacts

  Background: 
    Given I open the app
    And I see the vcard creation page
    And I fill the phone with phone that has transactions and balance
    And I fill the password with password
    And I fill the pin with pin
    And I click on the create button
    And I see a modal to enter my pin
    And I enter my pin
    And I click on the enter button
    And I see the dashboard page
    And I click on the send money button
    And I choose a contact linked to a vCard
    And I fill the amount with "1"
    And I see the send button not disabled
    And I press the send button

  Scenario: I confirm my transaction
    And I see a modal to confirm my transaction
    When I enter my confirmation code as "123"
    And I click on the confirm transaction button
    Then I should see a success message
    And I click on the continue button
    And I close the app
    
  Scenario: I enter no confirmation code
    And I see a modal to confirm my transaction
    When I enter my confirmation code as ""
    Then I should see the error message "You must enter your confirmation code" 
    And I close the app
    
  Scenario: My confirmation code is wrong
    And I see a modal to confirm my transaction
    When I enter my confirmation code as "XXX"
    And I click on the confirm transaction button
    Then I should see the error message "The confirmation code is incorrect"
    And I close the app

  Scenario: I cancel my transaction
    And I see a modal to confirm my transaction
    When I click on the cancel transaction button
    Then I should see my contacts page
    And I close the app
