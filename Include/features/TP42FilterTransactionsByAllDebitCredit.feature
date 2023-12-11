Feature: Filter Transactions by Date Range
  As a vcard mobile application user I want to access my Transactions
  So that I can filter them all/debit or credit transactions

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

  Scenario: I filter my transactions by debit
    When I select the filter button
    And I select Debit Only in the select box
    And I click on the apply button
    Then I should see all my debit transactions

  Scenario: I filter my transactions by credit
   	When I select the filter button
    And I select Credit Only in the select box
    And I click on the apply button
    Then I should see all my credit transactions