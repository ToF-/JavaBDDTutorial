Feature: Bowling
  Scenario: Initial score
    Given I have not thrown any ball yet
    Then my score is 0

  Scenario: Average score
    Given I have not thrown any ball yet
    When I hit 3 pins
    And I hit 5 pins
    And I hit 2 pins
    Then my score is 10

  Scenario: Spare in first frame
    Given I have not thrown any ball yet
    When I hit 6 pins
    And I hit 4 pins
    And I hit 3 pins
    Then my score is 16

  Scenario: Spare only within a frame
    Given I have not thrown any ball yet
    When I hit 2 pins
    And I hit 4 pins
    And I hit 6 pins
    And I hit 2 pins
    Then my score is 14

  Scenario: Strike in first frame
    Given I have not thrown any ball yet
    And I hit 10 pins
    And I hit 4 pins
    Then my score is 18
