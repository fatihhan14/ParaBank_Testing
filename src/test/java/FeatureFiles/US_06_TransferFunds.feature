Feature: Transfer Funds

  Background:
    Given Navigate to website
    When User sending the keys
      | usernameBox | Falanca3   |
      | passwordBox | Deneme.123 |
    Then Click on the element
      | loginBtn |

  Scenario: Money transfer between accounts
    When Click on the element
      | transferFunds |
    Then User select on the element
      | fromAccountTransferFuns  | 19560 |
      | fromAccountTransferFuns2 | 19782 |
    And User sending the keys
      | amountTextBox | 1 |
    And Click on the element
      | transferButton |
    And Text verification process
      | transferCompleteText  | 19560 |
      | transferCompleteText2 | 19782 |
    And Click on the element
      | accountsOverview |
      | recipientAccount |
    And Transfer Date, Credit Amount and Transaction Id Verification


