Feature: Database retrieval

  Background:
    Given I am connected with the database

  Scenario: I want to retrieve data
    When I run the select query
    Then I should see the result
      | id | start | duration | price |
      | ABCD | 2021-03-21 | 10 | 4807.0 |
      | FOOBAR | 2021-03-24 | 12       | 6839.0  |