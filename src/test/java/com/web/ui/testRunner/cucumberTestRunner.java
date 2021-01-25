package com.web.ui.testRunner;

import com.web.ui.step_Definitions.Hooks;
import courgette.api.*;
import courgette.api.junit.Courgette;
import org.junit.runner.RunWith;

import java.io.IOException;

@RunWith(Courgette.class)
@CourgetteOptions(
        threads = 10, runLevel = CourgetteRunLevel.SCENARIO, rerunFailedScenarios = false, showTestOutput = true, reportTargetDir = "target", plugin = {"extentreports"},
        cucumberOptions = @CucumberOptions(
                features = "src/test/resources/features/",
                glue = "com.web.ui.step_Definitions",
                tags = {"@E2E"},
                plugin = {"pretty", "json:target/cucumber-report/cucumber.json", "html:target/cucumber-report/", "rerun:target/rerun-failed-scenarios/rerun.txt"},
                monochrome = true))

public class cucumberTestRunner {

    @CourgetteBeforeAll
    public static void beforeTest() throws IOException {
        System.out.println("checking for target folder and deleting it");
        Hooks.firstStep();
    }

    @CourgetteAfterAll
    public static void tearDown() throws IOException {
        System.out.println("performing final steps for reports");
        Hooks.finalStep();
    }
}
