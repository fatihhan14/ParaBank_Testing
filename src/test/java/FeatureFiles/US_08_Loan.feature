Feature: Request Loan

  Background:
    Given Navigate to website
    When User sending the keys
      | usernameBox | Falanca6   |
      | passwordBox | Deneme.123 |
    Then Click on the element
      | loginBtn |

  Scenario: Request Loan
    When Click on the element
      | requestLoanButton |
    Then User sending the keys
      | loanAmountTextBox  | 2000 |
      | downPaymentTextBox | 400  |
    And Click on the element
      | applyNowButton |
    And Loan Request Processed verify
      | ParaBank            |
      | Approved            |
      | congratulationsText |
    And Click on the element
      | newLoanAccount |
    And Loan Account verification process
    When Click on the element
      | requestLoanButton |
    Then User sending the keys
      | loanAmountTextBox  | 1000000 |
      | downPaymentTextBox | 10000   |
    And Click on the element
      | applyNowButton |
    And Loan Request Processed verify2
      | ParaBank          |
      | Denied            |
      | loanDeniedMessage |