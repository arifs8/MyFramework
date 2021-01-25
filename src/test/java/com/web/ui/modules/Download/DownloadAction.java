package com.web.ui.modules.Download;

import com.web.ui.helpers.Utility.ExpectedConditions;
import com.web.ui.helpers.Utility.Waiter;
import com.web.ui.modules.Login.LoginAction;
import com.web.ui.pageObjects.Download.DownloadScreen;
import com.web.ui.pageObjects.Login.LoginScreen;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class DownloadAction {

    private static Logger logger = Logger.getLogger(LoginAction.class.getName());

    public static void ComputerDownload(WebDriver driver) throws Exception {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        if (DownloadScreen.COMPUTER_DOWNLOAD_BUTTON_TISWEB.size() != 0) {
            DownloadScreen.COMPUTER_DOWNLOAD_BUTTON_TISWEB.get(0).click();
            logger.info("\n Clicked on Computer download button");

        } else {
            Assert.fail("\n Computer downlaod button missing");

        }


    }

        public static void ComputerDownloadOk(WebDriver driver) {

            if (DownloadScreen.DOWNLOAD_COMPUTER_PLEASE_SELECT.isDisplayed()) {
                if (DownloadScreen.DOWNLOAD_FROM_COMPUTER_OK_BUTTON.size() != 0) {
                    DownloadScreen.DOWNLOAD_FROM_COMPUTER_OK_BUTTON.get(0).click();
                    logger.info("\n Clicked on Download from Computer ok button");
                } else {
                    Assert.fail("\n Download from Computer ok button is missing");

                }
            }
            else {
                if (DownloadScreen.DOWNLOAD_COMPUTER_CANCEL_BUTTON.size() != 0) {
                    DownloadScreen.DOWNLOAD_COMPUTER_CANCEL_BUTTON.get(0).click();
                    logger.info("\n Clicked on Download from Computer cancel button");
                } else {
                    Assert.fail("\n Download from Computer cancel button is missing");

                }
            }
        }


        public static void ComputerDownloadClose (WebDriver driver)throws Exception {
                if (DownloadScreen.DOWNLOAD_FROM_COMPUTER_CLOSE.size() != 0) {
                    DownloadScreen.DOWNLOAD_FROM_COMPUTER_CLOSE.get(0).click();
                    logger.info("\n Clicked on close button");
                    driver.navigate().refresh();
                } else {
                    Assert.fail("\n Close button is missing");

                }

            }

}
