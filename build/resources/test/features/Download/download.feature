@downloadFiles

Feature: Downlaod DDD files from computer

  Scenario Outline: User is able to downlaod DDD files
    Given open the provided url
    When enter "<accountname>" "<username>" and "<password>"
    And click on computer downloads button
    Then click on download from computer OK button


    Examples:
      |accountname |username  |password|
      |continental    |continental      |continental  |
