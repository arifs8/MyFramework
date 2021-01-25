package com.web.ui.modules.Setting;

import com.web.ui.modules.Vehicles.LegalVehicleAction;
import com.web.ui.pageObjects.Settings.SettingGroup;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class settingGroupAction {

    private static Logger logger = Logger.getLogger(LegalVehicleAction.class.getName());

    public static void SettingsPage(WebDriver driver) throws Exception {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        if (SettingGroup.SETTING_PAGE_TISWEB.size() != 0) {
            SettingGroup.SETTING_PAGE_TISWEB.get(0).click();
            logger.info("\n Clicked on setting tab");

        } else {
            Assert.fail("\n Setting page tab missing");

        }

    }

    public static void SettingsPageSiteorGroup(WebDriver driver) throws Exception {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        if (SettingGroup.SETTING_SITESORGROUPS_TISWEB.size() != 0) {
            SettingGroup.SETTING_SITESORGROUPS_TISWEB.get(0).click();
            logger.info("\n Clicked on SiteorGroup tab");

        } else {
            Assert.fail("\n Setting page Site or Group tab missing");

        }

    }

    public static void SettingsPageGroup(WebDriver driver) throws Exception {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        if (SettingGroup.SETTING_GROUPS_TISWEB.size() != 0) {
            SettingGroup.SETTING_GROUPS_TISWEB.get(0).click();
            logger.info("\n Clicked on setting Page Group tab");

        } else {
            Assert.fail("\n Setting Page Group  tab missing");

        }

    }

    public static void SettingsPageGroupAdding(WebDriver driver) throws Exception {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        if (SettingGroup.SETTING_GROUPS_ADDING_TISWEB.size() != 0) {
            SettingGroup.SETTING_GROUPS_ADDING_TISWEB.get(0).click();
            logger.info("\n Clicked on setting Page Group tab");

        } else {
            Assert.fail("\n Setting Page Group  tab missing");

        }

    }

}
