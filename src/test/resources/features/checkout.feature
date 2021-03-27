Feature: Checkout
  Scenario Outline: Checkout a banana
    Given The price of a "banana" is 40
    When I checkout <count> "banana"
    Then The total price should be <total>
  Examples:
    | count | total |
    | 1     | 40    |
    | 2     | 80    |

    Scenario: Two bananas scanned separately
      Given The price of a "banana" is 40
      When I checkout 1 "banana"
      And I checkout 1 "banana"
      Then The total price should be 80

      Scenario: A banana and an apple
        Given The price of a "banana" is 40
        And The price of a "apple" is 25
        When I checkout 1 "banana"
        And I checkout 1 "apple" 
        Then The total price should be 65