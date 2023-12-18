Feature: dismiss vcard in details view
As a user I want to go to a personal details view
So that I can dismiss my vcard and delete my account

Background:
   Given I open the app
		And I see the vcard creation page
  	And I fill the phone with phone that has no balance
    And I fill the password with password
    And I fill the pin with pin
    And I click on the create button
    And I see a modal to enter my pin
	  And I enter my pin
	  And I click on the enter button
    And I click on the profile page button
    

Scenario: dismiss vcard 
    Given I am in the profile page
    When I click on the dismiss vcard button
    Then I see a modal to confirm the dismissal
    And I click on the confirm button
    And I see the login page
    And I close the app
    

Scenario: dismiss vcard and cancel
    Given I am in the profile page
    When I click on the dismiss vcard button
    Then I see a modal to confirm the dismissal
    And I click on the cancel button
    And I see the profile page
    And I close the app

Scenario: delete my account but i enter the wrong password
    Given I am in the profile page
    When I click on the delete my account button
    Then I see a modal to confirm the deletion
    And I enter my password in the modal
    And I enter a wrong pin
    And I click on the confirm button
    And I see an error message in the modal
    And I close the app

Scenario: delete my account
    Given I am in the profile page
    When I click on the delete my account button
    Then I see a modal to confirm the deletion
    And I enter my password in the modal
    And I enter a valid pin in the modal
    And I click on the confirm button
    And I close the app
