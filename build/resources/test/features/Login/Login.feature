@login

Feature: Log into the staging environment

  Scenario Outline: User is able to login staging environment
    Given open the provided url
    When enter "<accountname>" "<username1>" and "<password1>"
    Then login successful

    Examples:
      |accountname |username1  |password1|
      |continental    |continental      |continental  |