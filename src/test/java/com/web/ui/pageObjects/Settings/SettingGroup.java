package com.web.ui.pageObjects.Settings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

    public class SettingGroup {

        public SettingGroup(WebDriver driver) {

        }

        @FindBy(how = How.XPATH, using="//span[@class='title' and text()='Settings']")
        public  static List<WebElement> SETTING_PAGE_TISWEB;

        @FindBy(how = How.XPATH, using="//a[@class='sites-groups ng-star-inserted' and text()=' Sites/Groups ']")
        public  static List<WebElement> SETTING_SITESORGROUPS_TISWEB;

        @FindBy(how = How.XPATH, using="//a[@class='groups ng-star-inserted' and text()=' Groups ']")
        public  static List<WebElement> SETTING_GROUPS_TISWEB;

        @FindBy(how = How.XPATH, using="//span[@class='oi' and @data-glyph='plus']")
        public  static List<WebElement> SETTING_GROUPS_ADDING_TISWEB;

        @FindBy(how = How.XPATH, using="//input[@id='mat-input-10' and @placeholder='Group Code']")
        public  static List<WebElement> SETTING_GROUPS_CODE_TISWEB;

        @FindBy(how = How.XPATH, using="//input[@id='mat-input-11' and @placeholder='Group Description']")
        public  static List<WebElement> SETTING_GROUPS_DESCRIPTION_TISWEB;

    }

