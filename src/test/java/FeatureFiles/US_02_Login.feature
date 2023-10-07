Feature: Login with invalid and valid credentials


  Scenario Outline: Failed and Successful login
    Given Navigate to website
    When User sending the keys
      | usernameBox | <username> |
      | passwordBox | <password> |
    Then Click on the element
      | loginBtn |
    And Text verification process
      | <Element> | <Message> |
    Examples:
      | username   | password   | Message      | Element    |
      | Deneme.123 | Falanca6   | could not be | failedMsg  |
      | Falanca6   | Deneme.123 | Welcome      | welcomeMsg |
