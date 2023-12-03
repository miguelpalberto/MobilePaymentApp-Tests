Feature: View List of Transactions
as a vcard mobile application user I want to access my transactions
so that I can view a list of my transactions

Background:
			Given I open the app
			And I see the vcard creation page
	    And I fill the password with password
	    And I fill the pin with pin

Scenario: There are transactions
    	And I fill the phone with phone that has transactions and balance
	    And I click on the create button
      And I see a modal to enter my pin
		  And I enter my pin
		  And I click on the enter button
      Then I see the dashboard page  
			When I click on the Show More button
			Then I see the list of my transactions
			And I close the app

Scenario: There are no transactions
    	And I fill the phone with phone that has no transactions and no balance and no contacts
	    And I click on the create button
      And I see a modal to enter my pin
		  And I enter my pin
		  And I click on the enter button
      Then I see the dashboard page  
			And I do not see the Show More button
			And I close the app