Feature: Login and navigate to Drivers page

    Scenario Outline: User is able to create new driver
   Given open the provided url
   When enter "<accountname>" "<username>" and "<password>"
   Then login successful
   And navigate to drivers page
   Then click on open list menu
   Then click on CREATE NEW DRIVER option
   And verify user is on create new driver page




   Examples:
     |accountname |username  |password|
     |qwerty    |qwerty      |qwerty  |

