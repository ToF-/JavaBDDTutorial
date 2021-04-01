Feature: Sales stats
  As a salesperson I want to display sales per customer so that I can find my best customers

  Scenario: Possible income per customer
    Given I have this list of orders
      | "Alpha" | 2021-04-10 | 10 | 1000000 |
      | "Beta"  | 2021-04-12 | 11 | 1100000 |
      | "Gamma" | 2021-04-22 | 9  | 1000000 |
      | "Alpha" | 2021-04-23 | 8  | 1200000 |
    When I ask for possible income per customer
    Then I get the following stats
      | "Alpha" | 2200000 |
      | "Beta"  | 1100000 |
      | "Gamma" | 1000000 |
