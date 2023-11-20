Feature: display piggy bank vault balance in dashboard
  as a vcard mobile application user I want to see my piggy bank balance in the dashboard
  so that I know how much I have saved

    Scenario: Piggy Bank Vault balance is greater than 0
       Given I am in the vcard creation page
       When I fill the phone _with "999999998"
       And I fill the password with password
       And I fill the pin with pin
       And I click on the create button
       And I see a modal to enter my pin
       And I enter my pin
       And I click on the confirm button
       When I look at the Piggy Bank panel
       Then I should see the Piggy Bank Vault balance
       And I close the browser
     
    Scenario: Piggy Bank Vault balance is 0
       Given I am in the vcard creation page 
       When I fill the phone _with "999999999"
       And I fill the password with password
       And I fill the pin with pin
       And I click on the create button
       And I see a modal to enter my pin
       And I enter my pin
       And I click on the confirm button
       When I look at the Piggy Bank panel
       Then I should see the text under the Piggy Bank panel "no balance"
       And I close the browser