Feature: TP18 Display last transaction on dashboard
	As a user I want to go to the dashboard
	So that I can see my last transaction
	
	  Scenario: There are transactions 
	  Given I am in the vcard creation page
		 And I dont have any vcard associated
		 And I fill the phone _with "999999998"
		 And I fill the password with password
		 And I fill the pin with pin
		 And I click on the create button
		 
		 And I see a modal to enter my pin
		 And I enter my pin
		 And I click on the confirm button
		 
		 When I look at the Last Transaction panel
		 Then I see my last transaction on the dashboard  

	  Scenario: There are no transactions yet 
		Given I am in the vcard creation page
		 And I dont have any vcard associated
		 And I fill the phone _with "999999999"
		 And I fill the password with password
		 And I fill the pin with pin
		 And I click on the create button
		 
		 And I see a modal to enter my pin
		 And I enter my pin
		 And I click on the confirm button

		 When I look at the Last Transaction panel
		 Then I see the transaction area displaying the text “No transactions yet”