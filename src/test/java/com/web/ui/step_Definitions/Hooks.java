package com.web.ui.step_Definitions;


import com.web.ui.helpers.Utility.PropertyUtility;
import com.web.ui.helpers.Utility.WebDriverDependencyInjector;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.BasicConfigurator;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import static com.web.ui.helpers.constants.Constants.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

public class Hooks extends WebDriverDependencyInjector {

    private static Logger logger = Logger.getLogger(Hooks.class.getName());
    private  WebDriver driver;
    private static String browser;
    private static Properties properties;
    private static String chromeDriverPath;
    private static String ieDriverpath;
    private static String isDownLoadDriverExc;
    private static String isHeadLess;
    private static String closeBrowser;
    private WebDriverManager webDriverManager;
    private WebDriverDependencyInjector driverDependencyInjector;


    public Hooks(WebDriverDependencyInjector driverDependencyInjector) {
        this.driverDependencyInjector = driverDependencyInjector;
        driver = driverDependencyInjector.webDriver;
    }


    public Properties getProperties() {
        return properties;
    }


    public void setProperties(Properties properties) {
        this.properties = properties;
    }


    @Before

    public static String init() {

        BasicConfigurator.configure();
        properties = (new PropertyUtility()).loadProperty("testData.properties");
        chromeDriverPath = properties.getProperty("CHROME_DRIVER_PATH");
        ieDriverpath = properties.getProperty("IE_DRIVER_PATH");
        browser = System.getProperty("browser");

        if (browser == null || browser.isEmpty()) {
            browser = properties.getProperty("browser");

        }
        closeBrowser = properties.getProperty("closeBrowser");

        if (closeBrowser == null || closeBrowser.isEmpty()) {
            closeBrowser = "true";
        }

        isDownLoadDriverExc = properties.getProperty("isDownLoadDriverExc");

        if (isDownLoadDriverExc == null || isDownLoadDriverExc.isEmpty()) {
            isDownLoadDriverExc = "true";
        }

        isHeadLess = System.getProperty("headless");

        if (isHeadLess == null || isHeadLess.isEmpty()) {
            isHeadLess = properties.getProperty("headless");

        }


        String Env = System.getProperty("Env");

        if (Env == null || Env.isEmpty()) {
            Env = properties.getProperty("Env");
        }
        String URL = null;

        if (Env.equalsIgnoreCase("QA")) {
            URL = QA_URL;

        } else if (Env.equalsIgnoreCase("STAGING")) {
            URL = STAG_URL;

        } else if (Env.equalsIgnoreCase("PROD")) {
            URL = PROD_URL;

        }
          else if (Env.equalsIgnoreCase("STAGAUTH")) {
            URL = STAG_AUTH_URL;

        }else {
           URL = QA_URL;

        }
        return URL;

    }


    @Before
    public void openBrowser() {
        ChromeOptions options = new ChromeOptions();

        HashMap<String, Object> chromeLocalStatePrefs = new HashMap<String, Object>();
        List<String> experimentalFlags = new ArrayList<String>();
        experimentalFlags.add("cookies-without-same-site-must-be-secure@2");
        chromeLocalStatePrefs.put("browser.enabled_labs_experiments", experimentalFlags);
        options.setExperimentalOption("localState", chromeLocalStatePrefs);
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("disable-features=CookiesWithoutSameSiteMustBeSecure");
        options.addArguments("window-size=1200x600");

        if (isHeadLess == null || isHeadLess.isEmpty()) {
            isHeadLess = "true";
        }

        if (browser.equalsIgnoreCase("chrome")) {
            if (Boolean.parseBoolean(isDownLoadDriverExc)) {
                WebDriverManager.chromedriver().setup();
            } else {
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + chromeDriverPath);
            }
            if (Boolean.parseBoolean(isHeadLess)) {
                options.addArguments("headless");
                driver = new ChromeDriver(options);
                logger.info("Running test in headless browser");
            } else {
                driver = new ChromeDriver(options);
                logger.info("Running test in Real browser");
            }
        } else if (browser.equalsIgnoreCase("ie")) {
            if (Boolean.parseBoolean(isDownLoadDriverExc)) {
                WebDriverManager.iedriver().setup();
            } else {
                System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + ieDriverpath);
            }
            InternetExplorerOptions internetExplorerOptions = new InternetExplorerOptions();
            internetExplorerOptions.setCapability("ignoreZoomSetting", true);
            internetExplorerOptions.setCapability("requireWindowFocus", true);
            internetExplorerOptions.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
            internetExplorerOptions.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
            DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
            caps.setCapability("ignoreZoomSetting", true);
            driver = new InternetExplorerDriver(internetExplorerOptions);
        }
       // driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driverDependencyInjector.webDriver = driver;
    }


    /**
     * Embed a screenshot in test report if test is marked as failed
     */
    @After
    public void afterScenario(Scenario scenario) {

        if (scenario.isFailed()) {
            TakesScreenshot screenshot = (TakesScreenshot) driver;
            String base64 = screenshot.getScreenshotAs(OutputType.BASE64);
            scenario.write("<img class='col-lg-12' src='data:image/png;base64," + base64 + "'>");

        }
        }


   @After(order = 0)
    public void AfterSteps() {
        try {
            logger.info("Checking for Driver existence, if it exists closing it.");
        } finally {
            try {
                if (driver != null) {
                    if (Boolean.parseBoolean(closeBrowser)) {
                        driver.close();
                        driver.quit();
                    }
                }
            } catch (Exception e) {
                e.getMessage();
            }
        }
    }

    public static void firstStep() throws IOException {
        File dir = new File(System.getProperty("user.dir") + "/target");
        if (!dir.isDirectory()) {
            logger.info("There is no directory @ given path");
        } else {
            FileUtils.deleteDirectory(new File(String.valueOf(dir)));
        }
    }

    public static void finalStep() throws IOException {
        File dir = new File(System.getProperty("user.dir") + "/target/courgette-extentreports");
        if (!dir.isDirectory()) {
            logger.info("There is no directory @ given path");
        } else {
            File newDir = new File(System.getProperty("user.dir") + "/target/extentreports");
            dir.renameTo(newDir);
            FileUtils.deleteDirectory(new File(System.getProperty("user.dir") + "/target/courgette-report"));
        }
    }
}




