Feature: View user details in details view
As a user I want to go to a personal details view
So that I can see my personal vcard details

Background:
			Given I am in the vcard creation page 
			And I fill the phone with phone
	    And I fill the password with password
	    And I fill the pin with pin
	    And I click on the create button
			And I see a modal to enter my pin
			And I enter my pin
			And I click on the enter button

Scenario: View my personal user details
    Given I click on the user profile
    Then I should be on the user profile page
		And I see my personal details view