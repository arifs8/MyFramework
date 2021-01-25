package com.web.ui.pageObjects.Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class LoginScreen {

    public LoginScreen(WebDriver driver) {

    }

    @FindBy(how = How.XPATH, using="//input[@id='mat-input-0' and @type='text']")
    public  static List<WebElement> ACCOUNTNAME_LOGIN_PAGE_TISWEB;

    @FindBy(how = How.XPATH, using="//input[@id='mat-input-1' and @type='text']")
    public  static List<WebElement> USERNAME_LOGIN_PAGE_TISWEB;

    @FindBy(how = How.XPATH, using="//input[@id='mat-input-2' and @type='password']")
    public  static List<WebElement> PASSWORD_LOGIN_PAGE_TISWEB;

    @FindBy(how = How.XPATH, using="//button[@class='mat-raised-button']")
    public  static List<WebElement> BUTTON_SIGN_IN_TISWEB;


    @FindBy(how = How.XPATH, using="//h2[text()='TIS-Web']")
    public  static List<WebElement> LOGIN_TITLE_TISWEB;

}



