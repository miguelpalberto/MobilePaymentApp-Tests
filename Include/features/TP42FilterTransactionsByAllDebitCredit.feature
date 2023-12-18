Feature: Filter Transactions by Date Range
  As a vcard mobile application user I want to filter my Transactions by type
  So that I can see them better by all/debit or credit

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
		  And I click on the show more transactions

  Scenario: I filter my transactions by all
    When I select the filter button
    And I select All in the select box
    And I click on the apply button
    Then I should see all my transactions
    And I close the app

  Scenario: I filter my transactions by debit
    When I select the filter button
    And I select Debit Only in the select box
    And I click on the apply button
    Then I should see all my debit transactions
    And I close the app
    
  Scenario: I filter my transactions by credit
   	When I select the filter button
    And I select Credit Only in the select box
    And I click on the apply button
    Then I should see all my credit transactions
    And I close the app
    
Scenario: I filter my transactions by debit and I dont have debit transactions      
    When I select the filter button
    And I select Debit Only in the select box
    And I click on the apply button
    Then I should see no transactions and a message that says "No transactions found"
    And I close the app


Scenario: I filter my transactions by credit and I dont have credit transactions         
   	When I select the filter button
    And I select Credit Only in the select box
    And I click on the apply button
   Then I should see no transactions and a message that says "No transactions found"
    And I close the app