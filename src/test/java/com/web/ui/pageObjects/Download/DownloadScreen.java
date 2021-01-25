package com.web.ui.pageObjects.Download;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class DownloadScreen {


    public DownloadScreen(WebDriver driver) {

    }

    @FindBy(how = How.XPATH, using = "//*[text()='Computer']//following::button[@class='mat-button mat-button-base mat-raised-button mat-primary'][1]")
    public static List<WebElement> COMPUTER_DOWNLOAD_BUTTON_TISWEB;

    @FindBy(how = How.XPATH, using = "//tis-button[@class='ok-button ng-star-inserted']")
    public static List<WebElement> DOWNLOAD_FROM_COMPUTER_OK_BUTTON;

    @FindBy(how = How.XPATH, using = "//mat-icon[text()='close']")
    public static List<WebElement> DOWNLOAD_FROM_COMPUTER_CLOSE;

    @FindBy(how = How.XPATH, using = "//span[text()=' Cancel ']")
    public static List<WebElement> DOWNLOAD_COMPUTER_CANCEL_BUTTON;

    @FindBy(how = How.XPATH, using = "//p[text()='Please select site...']")
    public static WebElement DOWNLOAD_COMPUTER_PLEASE_SELECT;



}
