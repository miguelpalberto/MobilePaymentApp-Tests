Feature: access phone contacts list
  As a user I want to go my contacts list
  So that I can select a phone number to send money

  Background: 
		Given I open the app
		And I see the vcard creation page
    And I fill the password with password
    And I fill the pin with pin

  Scenario: access phone contacts list with contacts
    And I fill the phone with phone that has transactions and balance
    And I fill the password with password
    And I fill the pin with pin
    And I click on the create button
    And I see a modal to enter my pin
    And I enter my pin
    And I click on the enter button
    And I see the dashboard page
    When I click on the send money button
    Then I see my phone contacts list
    And I close the app
