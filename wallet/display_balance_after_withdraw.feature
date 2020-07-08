Feature: Display balance after withdraw
   Scenario: User checks the balance of an account in credit after withdraw
      Given my account has been credited with $ 100
      When I withdraw $ 50
      And I check my balance
      Then It should return $ 50