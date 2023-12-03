Feature: Filter Transactions by Date Range
  As a vcard mobile application user I want to access my Transactions
  So that I can sort them by most recent or highest amount

  Background: 
  	Given I open the app
		And I see the vcard creation page
    And I see the vcard creation page
    And I fill the phone with phone that has transactions and balance
    And I fill the password with password
    And I fill the pin with pin
    And I click on the create button
    And I see a modal to enter my pin
    And I enter my pin
    And I click on the enter button
    And I see the dashboard page
    And I click on the Show More button
    And I see the list of my transactions

  Scenario: I sort my transactions by decrescent amount

    When I select the Sort By Amount button
    And I select the Decrescent button
    Then I see my transactions sorted by decrescent amount
    And I close the app

  Scenario: I sort my transactions by ascendent date
    When I select the Sort By Date button
    And I select the Ascendent button
    Then I see my transactions sorted by ascendent date
    And I close the app