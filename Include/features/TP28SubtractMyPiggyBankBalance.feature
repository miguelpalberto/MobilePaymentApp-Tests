Feature: Subtract From Piggy Bank Vault
   As a vcard mobile application user I want to access my Piggy Bank Vault
   So that I can subtract balance from Piggy Bank into my available balance
   
   Background:
			Given I am in the vcard creation page 
    	And I fill the phone with phone that has transactions and balance
	    And I fill the password with password
	    And I fill the pin with pin
	    And I click on the create button
      And I see a modal to enter my pin
		  And I enter my pin
		  And I click on the enter button
      Then I should see the dashboard page
      And I click the Piggy Bank Vault button
	    
   Scenario: I am storing money in my Piggy Bank Vault
      And I fill the amount with the "1"
      Then I should see the Apply button
      When I click the Apply button
      Then I should see a modal with a success message in my Piggy Bank Vault page
      And I close the modal in my Piggy Bank Vault Page
			And I close the browser
      
   Scenario: I am withdrawing money from my Piggy Bank Vault
   		And I switch the operation from storing to withdrawal
      And I fill the amount with the "1"
      Then I should see the Apply button
      When I click the Apply button
      Then I should see a modal with a success message in my Piggy Bank Vault page
      And I close the modal in my Piggy Bank Vault Page
			And I close the browser
      
    Scenario: I try to store more money than I have in my Total Balance in to my Piggy Bank Vault
      And I fill the amount with the "999999999"
      Then I should see the Apply button
      When I click the Apply button
      Then I see an error message
      And I verify that the error message is "Cannot store more money than the Total Balance in the Piggy Bank Vault"
			And I close the browser
      
    Scenario: I try to withdraw more money than I have in my Piggy Bank Vault in to my Total Balance 
   		And I switch the operation from storing to withdrawal
      And I fill the amount with the "999999999"
      Then I should see the Apply button
      When I click the Apply button
      Then I see an error message
      And I verify that the error message is "The amount being withdrawn is greater than the current Piggy Bank Vault balance"
			And I close the browser
      
    Scenario: I try to store no money in to Piggy Bank Vault
      And I fill the amount with the "0"
      Then I should not see the Apply button
			And I close the browser
      
    Scenario: I try to withdraw no money from my Piggy Bank Vault
   		And I switch the operation from storing to withdrawal
      And I fill the amount with the "0"
      Then I should not see the Apply button
			And I close the browser
      