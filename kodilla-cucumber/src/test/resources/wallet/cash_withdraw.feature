Feature: Cash Withdrawal

    Scenario Outline: Successful withdrawal from a wallet in credit
        Given I have deposited $ <deposit> in my wallet
        When I request $ <amount>
        Then $ <amount> should be dispensed
        And the balance of my wallet should be $ <balance>
        Examples:
            | deposit | amount | balance |
            | 200 | 30 | 170 |
            | 200 | 50 | 150 |
            | 200 | 200 | 0 |
            | 200 | 0 | 200 |