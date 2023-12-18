Feature: auto save money in piggy bank
As I user I want to be able to save money automatically to my piggy bank in every transaction
So that I can increase my savings passively

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

Scenario: Create transaction with enabled auto-saving to piggy bank
		And I click on the send money button
    And I see my phone contacts list
    And I choose a contact linked to a vCard
    And I fill the amount with "1"
		And I see the send button not disabled
		When I press the send button
		And I fill the confirmation code with my pin
		And I press confirm
		Then I see the transaction success message
    And I see the message with the value saved in piggy bank balance
    And I press continue button
		And I close the app

Scenario: Create transaction with disabled auto-saving to piggy bank
    And I click on the settings button
    And I see the settings page
		And I disable the auto-saving option
		And I press back
		And I see the dashboard page
		And I click on the send money button
    And I see my phone contacts list
    And I choose a contact linked to a vCard
    And I fill the amount with "1"
    And I see the send button not disabled
    When I press the send button
		And I fill the confirmation code with my pin
		And I press confirm
		Then I see the transaction success message
    And I dont see the message with the value saved in piggy bank balance
    And I press continue button
		And I close the app