Feature: Sales Incomes
  En tant que Commercial je veux connaître le CA optimal afin de faire le point sur ma rentabilité.
  As a salesperson I want to know the maximum income so that I can check our rentability

  Scenario: Maximum income for one order only
    Given a new order for a customer "Alpha"
    And a start date at 2021-04-10
    And a duration of 10 days
    And a price of 1000000
    When I enter this order
    Then the maximum income is 1000000

  Scenario Outline: Maximum income for series of one order
    Given  an order with <customer> <start date> <duration> <price>
    When I enter these orders
    Then the maximum income is <price>
    Examples:
    | customer   | start date | duration | price   |
    | "Alpha"    | 2021-04-10 | 10       | 1000000 |
    | "Beta"     | 2021-04-12 | 11       | 1100000 |

    Scenario: Maximum income for a set of several orders
      Given I have this list of orders
        | "Alpha" | 2021-04-10 | 10 | 1000000 |
        | "Beta"  | 2021-04-12 | 11 | 1100000 |
        | "Gamma" | 2021-04-22 | 9  | 1000000 |
        | "Delta" | 2021-04-23 | 8  | 1200000 |
      When I enter these orders
      Then the maximum income is 2200000


