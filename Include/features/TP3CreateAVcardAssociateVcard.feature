Feature: Create a vcard/ associate vcard
    as a vcard mobile application user I want to create/associate a vcard
    so that I can access the system
	
	Scenario: Create a vcard/ associate vcard
    Given I am in the vcard creation page 
    And I dont have any vcard associated
    When I fill the phone with phone
    And I fill the password with password
    And I fill the pin with pin
    And I click on the create button
    
     And I see a modal to enter my pin
		 And I enter my pin
		 And I click on the enter button
		 
    Then I should see the dashboard page    
    And I close the browser
    
  Scenario: Phone number is invalid
	    Given I am in the vcard creation page 
	    And I dont have any vcard associated
	    When I fill the phone with an invalid phone
	    And I fill the password with password
	    And I fill the pin with pin
	    And I click on the create button
	    Then I should see an error message telling me the phone number is invalid
	    And I should see the vcard creation page
	    And I close the browser

	Scenario: Vcard exists and password is incorrect
	    Given I am in the vcard creation page 
	    And I have a vcard associated
	    When I fill the phone with phone
	    And I fill the password with an incorrect password
	    And I fill the pin with pin
	    And I click on the create button
	    Then I should see an error message telling me the credentials are incorrect
	    And I should see the vcard creation page
	    And I close the browser
	
	Scenario: Vcard exists and pin is incorrect
	    Given I am in the vcard creation page 
	    And I have a vcard associated
	    When I fill the phone with phone
	    And I fill the password with password
	    And I fill the pin with an incorrect pin
	    And I click on the create button
	    Then I should see an error message telling me the credentials are incorrect
	    And I should see the vcard creation page
	    And I close the browser
	
	Scenario: Vcard doesnt exist and password is invalid
	    Given I am in the vcard creation page 
	    And I dont have any vcard associated
	    When I fill the phone with phone
	    And I leave the password field empty
	    And I fill the pin with pin
	    And I click on the create button
	    Then I should see an error message telling me the password field is empty
	    And I should see the vcard creation page
	    And I close the browser

	Scenario: vcard doesnt exist and pin is invalid
	    Given I am in the vcard creation page 
	    And I dont have any vcard associated
	    When I fill the phone with phone
	    And I fill the password with password
	    And I fill the pin with an invalid pin
	    And I click on the create button
	    Then I should see an error message telling me the pin is invalid
	    And I should see the vcard creation page
	    And I close the browser
    