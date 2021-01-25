package com.web.ui.step_Definitions.Download;

import com.web.ui.helpers.Utility.ExpectedConditions;
import com.web.ui.helpers.Utility.Waiter;
import com.web.ui.helpers.Utility.WebDriverDependencyInjector;
import com.web.ui.modules.Download.DownloadAction;
import com.web.ui.pageObjects.Download.DownloadScreen;

import gherkin.lexer.Th;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class downloadStepDef extends WebDriverDependencyInjector {


        private WebDriverDependencyInjector driverDependencyInjector;
        private WebDriver driver;
        private String endPoint;

        public downloadStepDef(WebDriverDependencyInjector driverDependencyInjector) {
                this.driverDependencyInjector = driverDependencyInjector;
                driver = driverDependencyInjector.webDriver;

        }

        @And("click on computer downloads button")
        public void clickOnComputerDownloadsButton() throws Exception {
                PageFactory.initElements(driver, DownloadScreen.class);
                Waiter.waitForElementToBeClickable(driver,DownloadScreen.COMPUTER_DOWNLOAD_BUTTON_TISWEB.get(0), 10000);
                DownloadAction.ComputerDownload(driver);
                Robot robot = new Robot();
                Waiter.waitForElement1(2000);
                robot.keyPress(KeyEvent.VK_TAB);
                Waiter.waitForElement1(2000);
                robot.keyPress(KeyEvent.VK_TAB);
                Waiter.waitForElement1(2000);
                robot.keyPress(KeyEvent.VK_SPACE);
                robot.keyRelease(KeyEvent.VK_SPACE);
                Waiter.waitForElement1(2000);

        }

        @Then("click on download from computer OK button")
        public void clickOnDownloadFromComputerOkButton() throws Exception {

                PageFactory.initElements(driver, DownloadScreen.class);
                Waiter.waitForElement(driver, 200);
                DownloadAction.ComputerDownloadOk(driver);
                Waiter.waitForElement1(8000);
                DownloadAction.ComputerDownloadClose(driver);


        }


}



