Feature: display piggy bank vault balance in dashboard
  as a vcard mobile application user I want to see my piggy bank balance in the dashboard
  so that I know how much I have saved
  
Background:
			Given I open the app
			And I see the vcard creation page
	    And I fill the password with password
	    And I fill the pin with pin

Scenario: Piggy Bank Vault balance is greater than 0
    	And I fill the phone with phone that has transactions and balance
	    And I click on the create button
      And I see a modal to enter my pin
		  And I enter my pin
		  And I click on the enter button
      Then I see the dashboard page  
      And I see the Piggy Bank Vault balance
			And I close the app

Scenario: There are no transactions
    	And I fill the phone with phone that has no transactions and no balance and no contacts
	    And I click on the create button
      And I see a modal to enter my pin
		  And I enter my pin
		  And I click on the enter button
      Then I see the dashboard page  
      And I see the text No Balance
			And I close the app