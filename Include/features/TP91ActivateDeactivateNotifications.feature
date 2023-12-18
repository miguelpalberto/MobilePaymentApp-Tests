Feature: Activate or Deactivate Notifications and Autosavings
As a vcard mobile application user I want to be able to toggle my notifications
So that I can stop or start receiving notifications

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
    And I see the dashboard page

 Scenario: Notifications are on
  When I open my notifications
  Then I see a notification about a transaction
  And I close the mobile app

 Scenario: Notifications are off
  When I tap the settings button
  Then I tap the notifications 
  When I open my notifications
  Then I see that there are no notifications about new transactions
  And I close the mobile app
  
