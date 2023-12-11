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

Scenario: Add transaction with enabled auto-saving to piggy bank in transaction
		When I click on the send money button
    Then I see my phone contacts list
    And I choose a contact linked to a vCard
    And I fill the amount with "0.50"
		Then I should see the send button not disabled
		And I fill the confirmation code with my pin
		When I press the save button
		Then I should see the transaction success message
    And I see the value saved in piggy bank balance

Scenario: Add transaction with disabled auto-saving piggy bank
    And I click on the settings button
    Then I see the settings page
		And I disable the auto-saving option
		And I click on the go back button
		And I see the dashboard page
		When I click on the send money button
    Then I see my phone contacts list
    And I choose a contact linked to a vCard
    And I fill the amount with "0.50"
		Then I should see the send button not disabled
		When I press the save button
		And I fill the confirmation code with my pin
		Then I should see the transaction success message
    And I don't see the value saved in piggy bank balance