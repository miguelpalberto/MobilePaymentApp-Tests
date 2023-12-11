Feature: dismiss vcard in details view
As a user I want to go to a personal details view
So that I can dismiss my vcard


Scenario: dismiss vcard with valid pin
   Given I open the app
			And I see the vcard creation page
    	And I fill the phone with phone that has transactions and balance
	    And I fill the password with password
	    And I fill the pin with pin
	    And I click on the create button
      And I see a modal to enter my pin
		  And I enter my pin
		  And I click on the enter button


Scenario: dismiss vcard with invalid pin
    Given I am in the vcard creation page
    When I fill the phone _with "900000001"
    And I fill the password with password
    And I fill the pin with pin
    And I click on the create button
    And I see a modal to enter my pin
    And I enter my pin
    And I click on the confirm button
    And I click on the settings
    And I click on the “dismiss vcard” button
    And I see a modal to confirm the dismissal with the pin
    And I enter an incorrect pin
    Then I see an error message