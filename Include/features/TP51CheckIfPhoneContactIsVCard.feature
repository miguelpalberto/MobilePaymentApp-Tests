Feature: Check if phone contact is a vCard user
As a user I want to be able to check the contacts that are vCard users
So that when I’m sending money I know it’s a vCard contact

Background: 
  Given I open the app
  And I fill the phone with phone that has transactions and balance
  And I fill the password with password
  And I fill the pin with pin
  And I click on the create button
  And I see a modal to enter my pin
  And I enter my pin
  And I click on the enter button
  And I see the dashboard page
  
  And I click on the send money button
  And I see my phone contacts list
  
Scenario: I have a number that is a vCard in my contact list 
  When I have a vCard contact
  Then I should see a vCard icon on that contact
  And I close the app
  
Scenario: I have a number that is not a vCard in my contact list 
  When I have a contact that is not associated to vCard
  Then I should see that contact without a vCard icon
  And I close the app