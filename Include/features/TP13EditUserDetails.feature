Feature: Edit user details
As a user I want to go to a personal details view
So that I can edit my personal information


	Background: I am at the User Page
    Given I am in the vcard creation page
    When I fill the phone _with "900000001"
    And I fill the password with password
    And I fill the pin with pin
    And I click on the create button
    And I see a modal to enter my pin
    And I enter my pin
    And I click on the confirm button
    
    And I click on the user profile image
    Then I should be on the user profile page
    
    Scenario: Editing personal details successfully
    	Given I click on the Edit button
			When I change my name
			And I change my email
			And I click on Save button
			Then I should see a modal confirming my profile changes
			And I dismiss the confirming modal
			
		Scenario: Editing personal details fails
    	Given I click on the Edit button
			When I change my name
			And I change my email with a mistake
			And I click on Save button
			Then I should see an error modal for unsuccessful profile changes
    	And I dismiss the error modal