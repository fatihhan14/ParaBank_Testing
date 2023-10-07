Feature: Transfer Funds

  Background:
    Given Navigate to website
    When User sending the keys
      | usernameBox | Falanca6   |
      | passwordBox | Deneme.123 |
    Then Click on the element
      | loginBtn |

  Scenario: Money transfer between accounts
    When Click on the element
      | transferFunds |
    Then User select on the element
      | fromAccountTransferFuns  | 13566 |
      | fromAccountTransferFuns2 | 13899 |
    And User sending the keys
      | amountTextBox | 1 |
    And Click on the element
      | transferButton |
    And Text verification process
      | transferCompleteText  | 13566 |
      | transferCompleteText2 | 13899 |
    And Click on the element
      | accountsOverview |
      | recipientAccount |
    And Transfer Date, Credit Amount and Transaction Id Verification


