Feature: Withdraw
  Scenario Outline: Withdraw fixed amount
    Given I have <Balance> in my account
    When I chose to withdraw the fixed amount of <Withdrawal>
    Then I should <Outcome>
    And the balance of my account should be <Remaining>

    Examples: Successful withdrawals
      | Balance | Withdrawal | Outcome | Remaining |
      | 500     | 50         | receive 50 cash | 450 |
      | 500     | 100        | receive 100 cash | 400 |

    Examples: Attempts to withdraw too much
      | Balance | Withdrawal | Outcome | Remaining |
      | 100     | 200        | see an error message | 100 |
      | 0       | 100        | see an error message | 0   |
