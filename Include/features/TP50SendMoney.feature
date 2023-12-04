Feature: Send Money
As a user I want to be able to perform a debit transaction to a vCard
So that I can send money to a vCard
   
Background:
	Given I open the app
	And I see the vcard creation page
	And I fill the phone with phone that has transactions and balance
  And I fill the password with password
  And I fill the pin with pin
  And I click on the create button
  And I see a modal to enter my pin
  And I enter my pin
  And I click on the enter button
  Then I see the dashboard page
  And I click on the send money button
	    
	Scenario: I send money to a number that is a vCard in my contact list
		Then I choose a contact linked to a vCard
		And I fill the amount with "1"
		And I fill the confirmation code with my pin
		Then I should see the send button not disabled
		When I press the save button
		Then I should see the transaction success message
		And I press continue button
		And I close the app
		
	Scenario: I send money to a number that is a vCard is entered manually
		Then I press the Add New Contact button
		And I fill phone number with a phone that is a vcard
		And I press the Add button Contact
		And I fill the confirmation code with my pin
		And I fill the amount with "1"
		Then I should see the send button not disabled
		When I press the save button
		Then I should see the transaction success message
		And I press continue button
		And I close the app
		
	Scenario: I try to send money with the amount being empty or 0
		And I choose a contact linked to a vCard
		And I fill the amount with "0"
		Then I should see an error message below the amount that contains "The amount must greater than 0"
		And I see the save button disabled
		And I close the app
		
	Scenario: I try to send money with the an amount greater than the available balance
		And I choose a contact linked to a vCard
		And I fill the amount with "9999999999"
		Then I should see an error message below the amount that contains "You don't have enough balance to send this amount"
		And I see the save button disabled
		And I close the app
      
	Scenario: I try to send money but I don't provide my confirmation code
		And I choose a contact linked to a vCard
		And I fill the amount with "1"
		Then I should see an error message below the confirmation code that contains "You must enter a your confirmation code"
		And I see the save button disabled
		And I close the app
		
	Scenario: I try to send money but my confirmation code is incorrect
		Then I choose a contact linked to a vCard
		And I fill the amount with "1"
		And I fill the confirmation code with an incorrect pin
		Then I should see the send button not disabled
		When I press the save button
		Then I should see an error message below the confirmation code that contains "The confirmation code is incorrect"
		And I close the app