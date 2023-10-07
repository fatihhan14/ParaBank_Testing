Feature: Updating Contact Information

  Background:
    Given Navigate to website
    When User sending the keys
      | usernameBox | Falanca6   |
      | passwordBox | Deneme.123 |
    Then Click on the element
      | loginBtn |

  Scenario: Updating Contact Information
    When Click on the element
      | updateContactInfo |
    Then User sending the keys
      | firstName | falan2          |
      | lastName  | filan2          |
      | address   | 4653 Dye Street |
      | city      | Mesa2           |
      | state     | Arizona2        |
      | zip       | AZ 852012       |
      | phone     | +1-280-733-0113 |
    And Click on the element
      | updateProfileButton |
    And Text verification process
      | profileUpdatedVerifyText | Your updated address |
    And Click on the element
      | logOutButton |
    When User sending the keys
      | usernameBox | Falanca4   |
      | passwordBox | Deneme.123 |
    Then Click on the element
      | loginBtn |
    And Click on the element
      | updateContactInfo |
    And Update Contact Info verification process
      | falan2          |
      | filan2          |
      | 4623 Dye Street |
      | Mesa2           |
      | Arizona2        |
      | AZ 852012       |
      | +1-280-733-0113 |

  Scenario: Updating Contact Information (Negative)
    When Click on the element
      | updateContactInfo |
    Then -negative- Update Contact Info verification process