#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: As a vcard mobile application user 
I want to see my notifications 
so that I can see what is happening on my account

  Background:
    Given I open the app
     And I see the vcard creation page
	    And I fill the password with password
	    And I fill the pin with pin
	    
	 Scenario: I see all notifications
	    And I fill the phone with phone that has transactions and balance
	    And I click on the create button
      And I see a modal to enter my pin
		  And I enter my pin
		  And I click on the enter button
		  
	    When I click on the notifications button
	    Then I see all notifications

  Scenario: I see no notifications
  	  And I fill the phone with phone that has no transactions and no balance and no contacts
	    And I click on the create button
      And I see a modal to enter my pin
		  And I enter my pin
		  And I click on the enter button
		  
	    When I click on the notifications button
	    Then I see no notifications

  Scenario: I dismiss a notification
  	    And I fill the phone with phone that has transactions and balance
	    And I click on the create button
      And I see a modal to enter my pin
		  And I enter my pin
		  And I click on the enter button
		  
	    When I click on the notifications button
	    Then I see all notifications
	    When I click on the dismiss button
	    Then the notification is dismissed

  Scenario: I dismiss all notifications
  	  And I fill the phone with phone that has transactions and balance
	    And I click on the create button
      And I see a modal to enter my pin
		  And I enter my pin
		  And I click on the enter button
		  
	    When I click on the notifications button
	    Then I see all notifications
	    When I click on the dismiss all button
	    Then all notifications are dismissed