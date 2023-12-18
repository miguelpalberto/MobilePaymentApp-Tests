Feature: receive push notifications about received transactions
As a user I want to be able to receive push notifications about received transactions
So that I now about my transactions

Background:
	Given I open the mobile app
	And I see the vcard creation page in mobile
	And I fill the phone with phone in mobile
  And I fill the password with password in mobile
  And I fill the pin with pin in mobile
  And I click on the create button in mobile
  And I see a modal to enter my pin in mobile
  And I enter my pin in mobile
  And I click on the enter button in mobile
  Then I see the dashboard page in mobile

Scenario: I receive a push notification about a transaction
  When I open my notifications
  Then I see a notification about a transaction
  And I close the mobile app


Scenario: I open my notifications but there is no new transactions
  When I open my notifications
  Then I see that there are no notifications about new transactions
  And I close the mobile app