Feature: Arithmetic operations
  This is a reverse notation calculator.
  Enter numbers followed by operations.

  Scenario: One number
    Given The result is currently 0
    When I enter 23
    Then The result is 23

  Scenario: An addition
    Given The result is currently 0
    When I enter 23
    And I enter 17
    And I enter the sign "+"
    Then The result is 40
