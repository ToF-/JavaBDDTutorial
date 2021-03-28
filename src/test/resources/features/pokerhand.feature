Feature: Hand comparisons in Texas Hold'em Poker
  Scenario: The highest full house is beaten by the lowest four of a kind
    Given "Jim" can make this hand
      | A♣︎ | A♦︎ | A♠︎ | K♣︎ | K♥︎ |
    And "Leslie" can make this hand
      | 2♣︎ | 2♦︎ | 2♥︎ | 2♠︎ | 3♥︎ |
    Then "Leslie" is the winner
