Feature: Subtract From Piggy Bank Vault
   As a vcard mobile application user I want to access my Piggy Bank Vault
   So that I can subtract balance from Piggy Bank into my available balance

   Scenario: I am subtracting balance from my Piggy Bank into my available balance
      Given I am in the Piggy Bank Vault
      And I check my current Piggy Bank balance
      When I fill the amount that I want to withdraw
      And I press the “Apply” button
      Then I should see my available balance updated
      And I should see my Piggy Bank balance updated

   Scenario: I am subtracting more balance than I have stored on my Piggy Bank 
      Given I am in the Piggy Bank Vault
      And I check my current Piggy Bank balance
      When I fill the amount that I want to withdraw
      And the amount I’m subtracting is more than my current Piggy Bank balance
      Then an error message is shown
      And the “Apply” button is not present

   Scenario: I don’t have any balance
      Given I am in the Piggy Bank Vault
      When I check that my balance is 0
      And I check that my Piggy Bank balance is 0
      I should see the text “No balance”