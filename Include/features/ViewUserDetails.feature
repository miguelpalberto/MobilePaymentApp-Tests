Feature: View user details in details view
As a user I want to go to a personal details view
So that I can see my personal vcard details


Scenario: View my personal user details
    Given I am in the vcard creation page
    When I fill the phone _with "900000001"
	    And I fill the password with password
	    And I fill the pin with pin
	    And I click on the create button
			And I see a modal to enter my pin
			And I enter my pin
			And I click on the confirm button
      And I click on display user details button
Then I see my personal details view