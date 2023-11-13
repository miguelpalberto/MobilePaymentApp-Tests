Feature: View List of Transactions
as a vcard mobile application user I want to access my transactions
so that I can view a list of my transactions


Scenario: There are transactions
			Given I am in the vcard creation page 
	  	And I have funds in my account
    	When I fill the phone _with "900000002"
	    And I fill the password with password
	    And I fill the pin with pin
	    And I click on the create button
			And I see a modal to enter my pin
			And I enter my pin 
			And I click on the confirm button
			And I click on the List of transactions button
			Then I should see the list of my transactions
			And I close the browser

Scenario: There are no transactions
	Given I am in the vcard creation page 
	  	And I have funds in my account
    	When I fill the phone _with "900000002"
	    And I fill the password with password
	    And I fill the pin with pin
	    And I click on the create button
			And I see a modal to enter my pin
			And I enter my pin 
			And I click on the confirm button
			And I click on the List of transactions button
			Then I should see Transactions Page with the text 'No transactions yet'