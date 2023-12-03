Feature: Create a vcard/ associate vcard
    as a vcard mobile application user I want to create/associate a vcard
    so that I can access the system
    Background:			
    Given I open the app
		And I see the vcard creation page
	
	Scenario: Create a vcard/ associate vcard
    And I dont have any vcard associated
    When I fill the phone with phone that has transactions and balance
    And I fill the password with password
    And I fill the pin with pin
    And I click on the create button
    
     And I see a modal to enter my pin
		 And I enter my pin
		 And I click on the enter button
		 
    Then I see the dashboard page    
    And I close the app
    
  Scenario: Phone number is invalid
	    And I dont have any vcard associated
	    When I fill the phone with an invalid phone
	    And I fill the password with password
	    And I fill the pin with pin
	    And I click on the create button
	    Then I see an error message telling me the phone number is invalid
	    And I see the vcard creation page
	    And I close the app

	Scenario: Vcard exists and password is incorrect
	    And I have a vcard associated
	    When I fill the phone with phone that has transactions and balance
	    And I fill the password with an incorrect password
	    And I fill the pin with pin
	    And I click on the create button
	    Then I see an error message telling me the credentials are incorrect
	    And I see the vcard creation page
	    And I close the app
	
	Scenario: Vcard exists and pin is incorrect
	    And I have a vcard associated
	    When I fill the phone with phone that has transactions and balance
	    And I fill the password with password
	    And I fill the pin with an incorrect pin
	    And I click on the create button
	    Then I see an error message telling me the credentials are incorrect
	    And I see the vcard creation page
	    And I close the app
	
	Scenario: Vcard doesnt exist and password is invalid
	    And I dont have any vcard associated
	    When I fill the phone with phone that has transactions and balance
	    And I leave the password field empty
	    And I fill the pin with pin
	    And I click on the create button
	    Then I see an error message telling me the password field is empty
	    And I see the vcard creation page
	    And I close the app

	Scenario: vcard doesnt exist and pin is invalid
	    And I dont have any vcard associated
	    When I fill the phone with phone that has transactions and balance
	    And I fill the password with password
	    And I fill the pin with an invalid pin
	    And I click on the create button
	    Then I see an error message telling me the pin is invalid
	    And I see the vcard creation page
	    And I close the app
    