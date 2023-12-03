Feature: View balance in the dashboard
As a user I want to go to the dashboard
So that I can see my vcard balance

Background:
			Given I open the app
			And I see the vcard creation page
	    And I fill the password with password
	    And I fill the pin with pin
	
	Scenario: View balance in the dashboard
	  	And I have funds on my account
    	When I fill the phone with phone that has transactions and balance
	    And I click on the create button
			And I see a modal to enter my pin
			And I enter my pin 
			And I click on the enter button
			Then I see my balance on the dashboard
			And I close the app
	
	
	Scenario: No funds
		And I dont have any funds on my account
   	 When I fill the phone with phone that has no transactions and no balance and no contacts
	    And I click on the create button
			And I see a modal to enter my pin
			And I enter my pin 
			And I click on the enter button
			Then I see the text No Funds on the dashboard
			And I close the app