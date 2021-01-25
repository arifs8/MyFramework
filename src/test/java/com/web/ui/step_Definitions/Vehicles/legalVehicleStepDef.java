package com.web.ui.step_Definitions.Vehicles;

import com.web.ui.helpers.Utility.Waiter;
import com.web.ui.helpers.Utility.WebDriverDependencyInjector;
import com.web.ui.modules.Vehicles.LegalVehicleAction;
import com.web.ui.pageObjects.Download.DownloadScreen;
import com.web.ui.pageObjects.Login.LoginScreen;
import com.web.ui.pageObjects.Vehicles.vehicleScreen;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class legalVehicleStepDef {

    private WebDriverDependencyInjector driverDependencyInjector;
    private WebDriver driver;


    public legalVehicleStepDef(WebDriverDependencyInjector driverDependencyInjector)
    {
        this.driverDependencyInjector = driverDependencyInjector;
        driver = driverDependencyInjector.webDriver;

    }


    @And("click on vehicle tab")
    public void click_on_vehicle_tab() throws Exception {
        PageFactory.initElements(driver, vehicleScreen.class);
        Waiter.waitForElementToBeClickable(driver, vehicleScreen.VEHICLE_PAGE_TISWEB.get(0), 20000);
        Waiter.waitForElement(driver,20);
        LegalVehicleAction.ExecuteVehicle(driver);
    }


    @Then("^click on search bar and enter vehicle number \"([^\"]*)\"$")
    public void click_on_search_bar(String vehiclenumber) throws Exception {
        PageFactory.initElements(driver, vehicleScreen.class);
        Waiter.waitForElement(driver,60);
        LegalVehicleAction.ExecuteVehicleSearch(driver,vehiclenumber);
        Waiter.waitForElement1(1000);

    }


    @Then("Select the vehicle")
    public void select_the_vehicle() throws Exception {
        PageFactory.initElements(driver, vehicleScreen.class);
        Waiter.waitForElement(driver,20);
       // LegalVehicleAction.ExecuteVehicleNumber(driver);
        LegalVehicleAction.SelectVehicle(driver);

    }


    @Then("select legal archieve tab")
    public void select_legal_archieve_tab() throws Exception {
        PageFactory.initElements(driver, vehicleScreen.class);
        Waiter.waitForElement(driver,10);
        LegalVehicleAction.ExecuteLegalTab(driver);

    }



    @And("select month")
    public void select_month() throws Exception {
        PageFactory.initElements(driver, vehicleScreen.class);
        Waiter.waitForElement(driver,10);
        LegalVehicleAction.SelectVehicleMonth(driver);

    }


    @Then("click on details")
    public void click_on_details() throws Exception {
        PageFactory.initElements(driver, vehicleScreen.class);
        Waiter.waitForElement(driver,10);
        LegalVehicleAction.SelectVehicleMonthDetails(driver);
    }



    @And("navigate to legal data preview")
    public void navigate_to_legal_data_preview() throws Exception {
        PageFactory.initElements(driver, vehicleScreen.class);
        Waiter.waitForElement(driver,10);
        LegalVehicleAction.SelectVehicleGeneration(driver);


    }



}
