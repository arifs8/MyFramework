@E2E

Feature: E2E run for Vehicle Generation

  Scenario Outline: User is able to downlaod DDD files
    Given open the provided url
    When enter "<accountname>" "<username>" and "<password>"
    Then login successful
    And click on computer downloads button
    Then click on download from computer OK button
    And click on vehicle tab
    Then click on search bar and enter vehicle number "<vehiclenumber>"
    Then Select the vehicle
    Then select legal archieve tab
    And select month
    Then click on details
    And navigate to legal data preview


    Examples:
      |accountname |username  |password|vehiclenumber |
      |continental |continental |continental |VS HW 602 |
