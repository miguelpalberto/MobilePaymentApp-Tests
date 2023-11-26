Feature: TP18 Display last transaction on dashboard
	As a user I want to go to the dashboard
	So that I can see my last transaction
	
	Background:
			Given I am in the vcard creation page 
	    And I fill the password with password
	    And I fill the pin with pin
	
	  Scenario: There are transactions 
		 Given I made or received transactions previously
		 And I fill the phone with phone that has transactions and balance
		 And I click on the create button
		 
		 And I see a modal to enter my pin
		 And I enter my pin
		 And I click on the enter button
		 
		 When I look at the Last Transaction panel
		 Then I see my last transaction on the dashboard  

	  Scenario: There are no transactions yet 
		 Given I did not make or receive any transaction previously
		 And I fill the phone with phone that has no transactions and no balance
		 And I click on the create button
		 
		 And I see a modal to enter my pin
		 And I enter my pin
		 And I click on the enter button

		 When I look at the Last Transaction panel
		 Then I see the transaction area displaying the text “No transactions yet”
		 
