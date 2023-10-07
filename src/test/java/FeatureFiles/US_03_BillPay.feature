Feature: Bill Payment Functionality

  Background:
    Given Navigate to website
    When User sending the keys
      | usernameBox | Falanca6    |
      | passwordBox | Deneme.123 |
    Then Click on the element
      | loginBtn |

  Scenario Outline: Bill Payment
    When Click on the element
      | billPay |
    Then User sending the keys
      | payeeName          | <PayeeName>     |
      | owingAddress       | 4653 Dye Street |
      | owingCity          | Mesa            |
      | owingState         | Arizona         |
      | owingZip           | AZ 85201        |
      | owingPhone         | +1-480-733-0113 |
      | payeeAccount       | 987456          |
      | payeeAccountVerify | 987456          |
      | amount             | <Amount>        |
    And User select on the element
      | fromAccount | 16785 |
    When Click on the element
      | sendPayment |
    Then Text verification process
      | paymentMsg | Complete |
    And Click on the element
      | accountsOverview |
      | accountNumber    |
      | <Payee>          |
    And Text verification process
      | transactionDetails | Transaction Details |
    Examples:
      | PayeeName   | Amount | Payee       |
      | Electricity | 85     | electricity |
      | Water       | 75     | water       |
      | Natural Gas | 65     | naturalGas  |