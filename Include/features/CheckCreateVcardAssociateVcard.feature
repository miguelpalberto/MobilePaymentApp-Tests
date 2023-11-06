Feature: create a vcard/ associate vcard
    as a vcard mobile application user I want to create/associate a vcard
    so that I can access the system
	
	Scenario: create a vcard/ associate vcard
    Given I am in the vcard creation page 
    And I dont have any vcard associated
    When I fill the phone with phone
    And I fill the password with password
    And I fill the pin with pin
    And I click on the create button
    Then I should see a message confirming the vcard create
    And I should see the dashboard page    
    
  Scenario: phone number is invalid
	    Given I am in the vcard creation page 
	    And I dont have any vcard associated
	    When I fill the phone with a invalid phone
	    And I fill the password with password
	    And I fill the pin with pin
	    And I click on the create button
	    Then I should see a error message
	    And I should see the vcard creation page

	Scenario: vcard exist and password is incorrect
	    Given I am in the vcard creation page 
	    And I have a vcard associated
	    When I fill the phone with phone
	    And I fill the password with incorrect password
	    And I fill the pin with pin
	    And I click on the create button
	    Then I should see a error message
	    And I should see the vcard creation page
	
	Scenario: vcard exist and pin is incorrect
	    Given I am in the vcard creation page 
	    And I have a vcard associated
	    When I fill the phone with phone
	    And I fill the password with password
	    And I fill the pin with a incorrect pin
	    And I click on the create button
	    Then I should see a error message
	    And I should see the vcard creation page
	
	Scenario: vcard doesnt exist and password is invalid
	    Given I am in the vcard creation page 
	    And I dont have any vcard associated
	    When I fill the phone with phone
	    And I fill the password with an invalid password
	    And I fill the pin with pin
	    And I click on the create button
	    Then I should see a error message
	    And I should see the vcard creation page

	Scenario: vcard doesnt exist and pin is invalid
	    Given I am in the vcard creation page 
	    And I dont have any vcard associated
	    When I fill the phone with phone
	    And I fill the password with password
	    And I fill the pin with an invalid pin
	    And I click on the create button
	    Then I should see a error message
	    And I should see the vcard creation page
    