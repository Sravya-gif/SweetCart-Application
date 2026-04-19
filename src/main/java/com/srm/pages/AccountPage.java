package com.srm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.srm.base.BasePage;

public class AccountPage extends BasePage {

    public AccountPage(WebDriver driver) {
        super(driver);
    }

    By accountTitle = By.xpath("//h1[contains(text(),'Your Account')]");

    public boolean isAccountPageDisplayed() {
        return waitForElement(accountTitle).isDisplayed();
    }
}