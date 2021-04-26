Feature: Database retrieval

  Background:
    Given I am connected with the database

  Scenario: I want to retrieve one order
    When I search an order with id "FOOBAR"
    Then I should see the result
      | id | start | duration | price |
      | FOOBAR | 2021-03-24 | 12       | 6839.0  |

  Scenario: I want to retrieve all orders
    When I search for all orders
    Then I should see the result
      | id | start | duration | price |
      | ABCD   | 2021-03-21 | 10       | 4807.0 |
      | FOOBAR | 2021-03-24 | 12       | 6839.0 |
      | TUXEDO | 2021-05-24 | 11       | 7000.0 |
