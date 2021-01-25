package com.web.ui.modules.Login;

import com.web.ui.pageObjects.Login.LoginScreen;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import java.util.concurrent.TimeUnit;
import static com.web.ui.helpers.constants.Constants.VERIFYTITLE;

public class LoginAction {


    private static Logger logger = Logger.getLogger(LoginAction.class.getName());

    public static void ExecuteLogin(WebDriver driver, String accountname, String username, String password) throws Exception {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        if (LoginScreen.ACCOUNTNAME_LOGIN_PAGE_TISWEB.size() != 0) {
            LoginScreen.ACCOUNTNAME_LOGIN_PAGE_TISWEB.get(0).sendKeys(accountname);
             logger.info("\n Username entered");
        } else {
            Assert.fail("\n Accountname is missing");
        }

        if (LoginScreen.USERNAME_LOGIN_PAGE_TISWEB.size() != 0) {
            LoginScreen.USERNAME_LOGIN_PAGE_TISWEB.get(0).sendKeys(username);

             logger.info("\n Username entered");
        } else {
            Assert.fail("\n Username is missing");
        }

        if (LoginScreen.PASSWORD_LOGIN_PAGE_TISWEB.size() != 0) {
            LoginScreen.PASSWORD_LOGIN_PAGE_TISWEB.get(0).sendKeys(password);
        logger.info("\n Password entered");

        } else {
            Assert.fail("\nPassword is missing");

        }

        if (LoginScreen.BUTTON_SIGN_IN_TISWEB.size() != 0) {
            LoginScreen.BUTTON_SIGN_IN_TISWEB.get(0).click();
            logger.info("\n Clicked on LOGIN button");

        } else {
            Assert.fail("\n LOGIN button missing");

        }




    }

    public static void VerifyLogin(WebDriver driver) throws Exception{


        if (LoginScreen.LOGIN_TITLE_TISWEB.size() != 0) {
            String verifytext =  LoginScreen.LOGIN_TITLE_TISWEB.get(0).getText();
            Assert.assertEquals(VERIFYTITLE,verifytext);
            logger.info("\n Logged in successfully");

        } else {
            Assert.fail("\n Log is not successful");

        }





    }

}
