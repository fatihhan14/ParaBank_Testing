Feature: Create a Checking Account

  Background:
    Given Navigate to website
    When User sending the keys
      | usernameBox | Falanca6    |
      | passwordBox | Deneme.123 |
    Then Click on the element
      | loginBtn |

  Scenario Outline: Account Creation
    When Click on the element
      | openNewAccount |
    Then User select on the element
      | accountType | <AccountType> |
    And Text verification process
      | accountMsg | minimum of |
    When User select on the element
      | accountNum | 123678 |
    Then Click on the element
      | newAccountBtn |
    And Text verification process
      | accountOpenMsg | Account Opened! |
    When Element display verification process
      | newAccountNum | new account |
    Examples:
      | AccountType |
      | 0           |
      | 1           |