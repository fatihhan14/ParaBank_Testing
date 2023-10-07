Feature: Create a user account

  Scenario: Successful registration
    Given Navigate to website
    When Click on the element
      | register |
    Then User sending the keys
      | firstName       | falan           |
      | lastName        | filan           |
      | address         | 4653 Dye Street |
      | city            | Mesa            |
      | state           | Arizona         |
      | zip             | AZ 85201        |
      | phone           | +1-480-733-0113 |
      | ssn             | 765-20-2371     |
      | username        | Falanca6        |
      | password        | Deneme.123      |
      | confirmPassword | Deneme.123      |
    And Click on the element
      | registerBtn |
    Then Text verification process
      | successMsg | successfully |