@newgroup
Feature: Creating a new group in Setting Tab

  Scenario Outline: User is able to create a new group
    Given open the provided url
    When enter "<accountname>" "<username>" and "<password>"
    Then login successful
    And navigate to settings page
    Then click on site or group list menu
    Then click on group option
    And navigate to add new group icon and click on it
#   And verify user is on create new driver page




    Examples:
      |accountname |username  |password|
      |continental    |continental      |continental  |