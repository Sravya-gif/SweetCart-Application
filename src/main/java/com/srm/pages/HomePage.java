package com.srm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.srm.base.BasePage;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    By sweets = By.linkText("Sweets");

    public void clickSweets() {
        click(sweets);
    }
}