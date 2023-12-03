Feature: Edit user details
As a user I want to go to a personal details view
So that I can edit my personal information


	Background: I am at the User Page
		Given I open the app
		And I see the vcard creation page
    And I fill the phone with phone that has transactions and balance
    And I fill the password with password
    And I fill the pin with pin
    And I click on the create button
    And I see a modal to enter my pin
    And I enter my pin
    And I click on the enter button
    
    And I click on the user profile
    And I am on the user profile page
    
    Scenario: Editing personal details successfully
    	And I click on the Edit button
			When I change my name
			And I change my email
			And I click on Save button
			Then I see a modal confirming my profile changes
			And I dismiss the confirming modal
			And I close the app
			
		Scenario: Editing personal details fails
    	And I click on the Edit button
			When I change my name
			And I change my email with a mistake
			And I click on Save button
			Then I see an error modal for unsuccessful profile changes
    	And I dismiss the error modal
    	And I close the app