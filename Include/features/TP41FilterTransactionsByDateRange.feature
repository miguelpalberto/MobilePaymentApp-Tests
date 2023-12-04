Feature: Filter Transactions by Date Range
  As a vcard mobile application user I want to filter my transactions by a date range
  So that I can see my transactions of a specific period of time

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

  Scenario: I filter my transactions by date range
      When I click on Filters button
      And I see the Filters modal
      And I click on Start Date
      And I see the Calendar modal
      And I choose a year
      And I choose a month
      And I choose a day
      And I choose an hour
      And I press OK for the calendar 
      
      And I click on End Date
      And I see the Calendar modal
      And I choose a year
      And I choose a month
      And I choose a day
      And I choose an hour
      And I press OK for the calendar
      And I press Confirm for the Filters 
      
      Then I see the transactions filtered by the date rage selected
      And I close the app
      
   Scenario: I filter my transactions by a date range that doesnt have transactions
      When I click on Filters button
      And I see the Filters modal
      And I click on Start Date
      And I see the Calendar modal
      And I choose a month
      And I choose a day
      And I press OK for the calendar 
      
      And I click on End Date
      And I see the Calendar modal
      And I choose the same month as before
      And I choose a day
      And I press OK for the calendar
      And I press Confirm for the Filters 
      
      Then I see there are no transactions after the filter
      And I close the app
   
   Scenario: I reset the filter of my transactions
         When I click on Filters button
		      And I see the Filters modal
		      And I click on End Date
		      And I see the Calendar modal
		      And I choose a month
		      And I choose a day
		      And I press OK for the calendar 
		      And I press Confirm for the Filters 
		      
		      And I click on Filters button
		      And I press Reset for the Filters 
		      
		      Then I see there are no filters being aplied
		      And I close the app
