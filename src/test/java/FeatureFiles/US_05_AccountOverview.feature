Feature: Account Details Access

  Background:
    Given Navigate to website
    When User sending the keys
      | usernameBox | Falanca6   |
      | passwordBox | Deneme.123 |
    Then Click on the element
      | loginBtn |

  Scenario: Account Details Access
    When Click on the element
      | accountsOverview |
    Then Account Overview verification process
    And Click on the element
      | accountNumber |
    And Account Details verification process
    And Click on the element
      | transaction1 |
    And Transaction Details verification process

