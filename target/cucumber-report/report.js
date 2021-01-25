$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Functional/E2E.feature");
formatter.feature({
  "name": "E2E run for Vehicle Generation",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@E2E"
    }
  ]
});
formatter.scenarioOutline({
  "name": "User is able to downlaod DDD files",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "open the provided url",
  "keyword": "Given "
});
formatter.step({
  "name": "enter \"\u003caccountname\u003e\" \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "login successful",
  "keyword": "Then "
});
formatter.step({
  "name": "click on computer downloads button",
  "keyword": "And "
});
formatter.step({
  "name": "click on download from computer OK button",
  "keyword": "Then "
});
formatter.step({
  "name": "click on vehicle tab",
  "keyword": "And "
});
formatter.step({
  "name": "click on search bar and enter vehicle number \"\u003cvehiclenumber\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Select the vehicle",
  "keyword": "Then "
});
formatter.step({
  "name": "select legal archieve tab",
  "keyword": "Then "
});
formatter.step({
  "name": "select month",
  "keyword": "And "
});
formatter.step({
  "name": "click on details",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "accountname",
        "username",
        "password",
        "vehiclenumber"
      ]
    },
    {
      "cells": [
        "continental",
        "continental",
        "continental",
        "VS HW 602"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User is able to downlaod DDD files",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@E2E"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "open the provided url",
  "keyword": "Given "
});
formatter.match({
  "location": "com.web.ui.step_Definitions.Login.loginStepDef.opentheprovidedurl()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter \"continental\" \"continental\" and \"continental\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.web.ui.step_Definitions.Login.loginStepDef.enterand(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "login successful",
  "keyword": "Then "
});
formatter.match({
  "location": "com.web.ui.step_Definitions.Login.loginStepDef.login_successful()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on computer downloads button",
  "keyword": "And "
});
formatter.match({
  "location": "com.web.ui.step_Definitions.Download.downloadStepDef.clickOnComputerDownloadsButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on download from computer OK button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.web.ui.step_Definitions.Download.downloadStepDef.clickOnDownloadFromComputerOkButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on vehicle tab",
  "keyword": "And "
});
formatter.match({
  "location": "com.web.ui.step_Definitions.Vehicles.legalVehicleStepDef.click_on_vehicle_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on search bar and enter vehicle number \"VS HW 602\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.web.ui.step_Definitions.Vehicles.legalVehicleStepDef.click_on_search_bar(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select the vehicle",
  "keyword": "Then "
});
formatter.match({
  "location": "com.web.ui.step_Definitions.Vehicles.legalVehicleStepDef.select_the_vehicle()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select legal archieve tab",
  "keyword": "Then "
});
formatter.match({
  "location": "com.web.ui.step_Definitions.Vehicles.legalVehicleStepDef.select_legal_archieve_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select month",
  "keyword": "And "
});
formatter.match({
  "location": "com.web.ui.step_Definitions.Vehicles.legalVehicleStepDef.select_month()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on details",
  "keyword": "Then "
});
formatter.match({
  "location": "com.web.ui.step_Definitions.Vehicles.legalVehicleStepDef.click_on_details()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
