package com.web.ui.step_Definitions.Settings;

import com.web.ui.helpers.Utility.WebDriverDependencyInjector;
import com.web.ui.modules.Setting.settingGroupAction;
import com.web.ui.pageObjects.Settings.SettingGroup;
import com.web.ui.pageObjects.Vehicles.vehicleScreen;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import com.web.ui.helpers.Utility.Waiter;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.PageFactory;

import java.io.StringReader;

public class groupStepDef extends WebDriverDependencyInjector{

    private WebDriverDependencyInjector driverDependencyInjector;
    private WebDriver driver;
    private String endPoint;

    public groupStepDef(WebDriverDependencyInjector driverDependencyInjector)
    {
        this.driverDependencyInjector = driverDependencyInjector;
        driver = driverDependencyInjector.webDriver;

    }

    @And("navigate to settings page")
    public void navigate_to_settings_page() throws Exception {
        PageFactory.initElements(driver, SettingGroup.class);
        Waiter.waitForElement(driver,20);
        settingGroupAction.SettingsPage(driver);
    }

    @Then("click on site or group list menu")
    public void click_on_site_group_list_menu() throws Exception {
        PageFactory.initElements(driver, SettingGroup.class);
        Waiter.waitForElementToBeClickable(driver, SettingGroup.SETTING_SITESORGROUPS_TISWEB.get(0), 20000);
        Waiter.waitForElement(driver,20);
        settingGroupAction.SettingsPageSiteorGroup(driver);
    }

    @Then("click on group option")
    public void click_on_group_option() throws Exception {
        PageFactory.initElements(driver, SettingGroup.class);
        Waiter.waitForElement(driver,20);
        settingGroupAction.SettingsPageGroup(driver);
    }

    @And("navigate to add new group icon and click on it")
    public void navigate_to_add_new_group_icon_and_click_on_it() throws Exception {
        PageFactory.initElements(driver, SettingGroup.class);
        Waiter.waitForElement(driver,20);
        settingGroupAction.SettingsPageGroupAdding(driver);
    }


}
