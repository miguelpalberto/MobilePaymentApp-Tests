Feature: Add new contact
  As a user I want to add a new contact
  So that I can send money to that contact

  Background: 
    Given I open the app
		And I see the vcard creation page
    And I see the vcard creation page
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
    And I click the Add New Contact button

	Scenario: Add a new contact and save it
  	And I fill the phone with phone
    And I fill the name with name
    And I check the checkbox to save in my contacts
    And I press confirm button
    Then I should see the Send Money page
    And I click on the go back button
    Then I should see the contacts list
    And I should see the contact name
    And I should see the contact phone
    And I close the app

  Scenario: Add a new contact
    And I fill the phone with phone
    And I fill the name with name
    And I press confirm button
    Then I should see the Send Money page
    And I should see the send to contact name
    And I click on the go back button
    Then I should see the contacts list
    And I should not see the contact name
    And I should not see the contact phone
    And I close the app

  Scenario: Add a new contact but it's invalid phone
    And I fill the phone with invalid phone
    Then I should see the invalid phone error
    And I close the app

  Scenario: Add a new contact but it's not a vcard
    And I fill the phone with phone that has no vcard
    And I press confirm button
    Then I should see the invalid vcard error
    And I close the app