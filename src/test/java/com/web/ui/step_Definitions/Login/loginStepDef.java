package com.web.ui.step_Definitions.Login;

import com.web.ui.step_Definitions.Hooks;
import com.web.ui.helpers.Utility.Waiter;
import com.web.ui.helpers.Utility.WebDriverDependencyInjector;
import com.web.ui.modules.Login.LoginAction;
import com.web.ui.pageObjects.Login.LoginScreen;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import static com.web.ui.helpers.constants.Constants.STAG_AUTH_URL;
import static com.web.ui.helpers.constants.Constants.STAG_URL;


public class loginStepDef extends WebDriverDependencyInjector {

    private WebDriverDependencyInjector driverDependencyInjector;
    private WebDriver driver;
    private String endPoint;

    public loginStepDef(WebDriverDependencyInjector driverDependencyInjector)
    {
        this.driverDependencyInjector = driverDependencyInjector;
        driver = driverDependencyInjector.webDriver;

    }
    @Given("open the provided url")
    public void opentheprovidedurl() {
        endPoint = Hooks.init();
        if(endPoint.equals(STAG_AUTH_URL)) {
            driver.get(STAG_AUTH_URL);
            driver.get(STAG_URL);
        }
        else
            {
                driver.get(endPoint);
       }
    }

    @When("^enter \"([^\"]*)\" \"([^\"]*)\" and \"([^\"]*)\"$")
    public void enterand(String accountname, String username, String password) throws Exception {
        PageFactory.initElements(driver, LoginScreen.class);
        Waiter.waitForElementToBeDisplayed(LoginScreen.ACCOUNTNAME_LOGIN_PAGE_TISWEB,driver,50);//to do xpath for admin mock tool header
        //Waiter.waitForElementToLoad(driver ,LoginScreen.COMPUTER_DOWNLOAD_BUTTON_TISWEB,50);
        LoginAction.ExecuteLogin(driver,accountname,username,password);
        Waiter.waitForElement(driver, 100);
    }

    @Then("login successful")
    public void login_successful() throws Exception {

        Waiter.waitForElement(driver, 200);
        LoginAction.VerifyLogin(driver);

    }


}
