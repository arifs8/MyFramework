package com.web.ui.modules.Vehicles;


import com.web.ui.pageObjects.Vehicles.vehicleScreen;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class LegalVehicleAction {

    private static Logger logger = Logger.getLogger(LegalVehicleAction.class.getName());

    public static void ExecuteVehicle(WebDriver driver) throws Exception {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        if (vehicleScreen.VEHICLE_PAGE_TISWEB.size() != 0) {
            vehicleScreen.VEHICLE_PAGE_TISWEB.get(0).click();
            logger.info("\n Clicked on vehicles tab");

        } else {
            Assert.fail("\n Vehicles tab missing");

        }

    }

    public static void ExecuteVehicleSearch(WebDriver driver,String vehiclenumber) throws Exception {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        if (vehicleScreen.VEHICLE_PAGE_SARCH_TAB_TISWEB.size() != 0) {
            vehicleScreen.VEHICLE_PAGE_SARCH_TAB_TISWEB.get(0).click();

            logger.info("\n Clicked on vehicle search bar");
        }
        else {
            Assert.fail("\n Vehicle search bar tab missing");

        }
        if (vehicleScreen.VEHICLE_NUMBER_ENTER_TISWEB.size() != 0){

            vehicleScreen.VEHICLE_NUMBER_ENTER_TISWEB.get(0).click();
            vehicleScreen.VEHICLE_NUMBER_ENTER_TISWEB.get(0).sendKeys(vehiclenumber);
            vehicleScreen.VEHICLE_NUMBER_ENTER_TISWEB.get(0).click();
            logger.info("\n Entered the vehicle number");
        }
        else {
            Assert.fail("\n Vehicle number is not entered");

        }

    }

    public static void ExecuteVehicleNumber(WebDriver driver) throws Exception {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        if (vehicleScreen.VEHICLE_NUMBER_TISWEB.size() != 0) {
            vehicleScreen.VEHICLE_NUMBER_TISWEB.get(0).click();
            logger.info("\n Clicked on vehicle number");

        } else {
            Assert.fail("\n Vehicle number is missing");

        }

    }

    public static void ExecuteLegalTab(WebDriver driver) throws Exception {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        if (vehicleScreen.LEGAL_VEHICLE_TISWEB.size() != 0) {
            vehicleScreen.LEGAL_VEHICLE_TISWEB.get(0).click();
            logger.info("\n Clicked on Legal tab");

        } else {
            Assert.fail("\n Legal tab is missing");

        }

    }

    public static void SelectVehicle(WebDriver driver) throws Exception {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


        if (vehicleScreen.VEHICLE_DROP_DOWN_TISWEB.size() != 0) {
            vehicleScreen.VEHICLE_DROP_DOWN_TISWEB.get(0).click();
            logger.info("\n Clicked on Legal tab");

        } else {
            Assert.fail("\n Legal tab is missing");

        }

    }

    public static void SelectVehicleMonth(WebDriver driver) throws Exception {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


        if (vehicleScreen.VEHICLE_MONTH_SLECTION_TISWEB.size() != 0) {
            vehicleScreen.VEHICLE_MONTH_SLECTION_TISWEB.get(0).click();
            logger.info("\n Clicked on Month tab");

        } else {
            Assert.fail("\n Missing Working Month");

        }

    }

    public static void SelectVehicleMonthDetails(WebDriver driver) throws Exception {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


        if (vehicleScreen.VEHICLE_MONTH_SLECTING_DETAILS_TISWEB.size() != 0) {
            vehicleScreen.VEHICLE_MONTH_SLECTING_DETAILS_TISWEB.get(0).click();
            logger.info("\n Clicked on Month details tab");

        } else {
            Assert.fail("\n Missing Working Month Details tab");

        }

    }

    public static void SelectVehicleGeneration(WebDriver driver) throws Exception {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


        if (vehicleScreen.VEHICLE_GENERATION_DETAILS_TISWEB.size() != 0) {
            String var = vehicleScreen.VEHICLE_GENERATION_DETAILS_TISWEB.get(0).getText();
            System.out.println(var);
            logger.info("\n Getting generation info");

        } else {
            Assert.fail("\n Missing generation information");

        }

    }




}
