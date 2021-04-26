Feature:
  Scenario:
    Given a board like this:
      |   | 1 | 2 | 3 |
      | 1 |   |   |   |
      | 2 |   |   |   |
      | 3 |   |   |   |
    When player x plays in row 1, column 3
    Then the board should look like this:
      |   | 1 | 2 | 3 |
      | 1 |   |   | x |
      | 2 |   |   |   |
      | 3 |   |   |   |
