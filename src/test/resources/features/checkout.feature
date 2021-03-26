Feature: Checkout
  Scenario Outline: Checkout a banana
    Given The price of a "banana" is 40
    When I checkout <count> "banana"
    Then The total price should be <total>
  Examples:
    | count | total |
    | 1     | 40    |
    | 2     | 80    |
