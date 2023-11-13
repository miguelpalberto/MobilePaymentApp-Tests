Feature: View balance in the dashboard
As a user I want to go to the dashboard
So that I can see my vcard balance
	
	Scenario: View balance in the dashboard
	  Given I am in the vcard creation page 
	  	And I have funds in my account
    When I fill the phone _with "900000002"
	    And I fill the password with password
	    And I fill the pin with pin
	    And I click on the create button
			And I see a modal to enter my pin
			And I enter my pin 
			And I click on the confirm button
		Then I see my balance on the dashboard
			And I close the browser
	
	
	Scenario: No funds
		Given I am in the vcard creation page
	  	And I have no funds in my account
    When I fill the phone _with "900000001"
	    And I fill the password with password
	    And I fill the pin with pin
	    And I click on the create button
			And I see a modal to enter my pin
			And I enter my pin 
			And I click on the confirm button
		Then I see the text "no funds" on the dashboard
			And I close the browser