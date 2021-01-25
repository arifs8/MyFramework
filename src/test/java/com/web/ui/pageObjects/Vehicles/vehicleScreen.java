package com.web.ui.pageObjects.Vehicles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class vehicleScreen {

    public vehicleScreen(WebDriver driver) {

    }

    @FindBy(how = How.XPATH, using="//span[@class='title' and text()='Vehicles']")
    public  static List<WebElement> VEHICLE_PAGE_TISWEB;

    @FindBy(how = How.XPATH, using="//h2[@class='title ng-star-inserted']")
    public  static List<WebElement> VEHICLE_PAGE_SARCH_TAB_TISWEB;

    @FindBy(how = How.XPATH, using="//input[@id='mat-input-0']")
    public  static List<WebElement> VEHICLE_NUMBER_ENTER_TISWEB;

    @FindBy(how = How.XPATH, using="//span[text()='VS HW 602'][1]")
    public  static List<WebElement> VEHICLE_NUMBER_TISWEB;

    @FindBy(how = How.XPATH, using="//a[@class='mat-tab-link legal ng-star-inserted']")
    public  static List<WebElement> LEGAL_VEHICLE_TISWEB;

    @FindBy(how = How.XPATH, using="//span[@class='calendar-text bold' and text()='Jun 2019']")
    public  static List<WebElement> LEGAL_VEHICLE_MONTH_TISWEB;

    @FindBy(how = How.XPATH, using="//span[@class='mat-button-wrapper' and text()=' Details ']")
    public  static List<WebElement> LEGAL_VEHICLE_DETAILS_TISWEB;

    @FindBy(how = How.XPATH, using="//p[@class='ng-star-inserted']")
    public  static List<WebElement> VEHICLE_DROP_DOWN_TISWEB;

    @FindBy(how = How.XPATH, using="//div[@class='status-bar status-ok']")
    public  static List<WebElement> VEHICLE_MONTH_SLECTION_TISWEB;

    @FindBy(how = How.XPATH, using="//span[@class='mat-button-wrapper' and text()=' Details ']")
    public  static List<WebElement> VEHICLE_MONTH_SLECTING_DETAILS_TISWEB;

    @FindBy(how = How.XPATH, using="//span[text()='Generations']//following::div[last()-70]")
    public  static List<WebElement> VEHICLE_GENERATION_DETAILS_TISWEB;

}


