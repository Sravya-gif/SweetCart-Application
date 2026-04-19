package com.srm.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import com.srm.base.BasePage;

public class BasketPage extends BasePage {

    public BasketPage(WebDriver driver) {
        super(driver);
    }

    By basketLink = By.xpath("//a[contains(@href,'/basket')]");
    By basketTitle = By.xpath("//h1[contains(text(),'Your Basket')]");

    By firstName = By.id("name");   
    By lastName = By.id("name");    
    By email = By.id("email");
    By address = By.id("address");

    By country = By.id("country");
    By city = By.id("city");
    By zip = By.id("zip");

    By cardName = By.id("cc-name");
    By cardNumber = By.id("cc-number");
    By expiry = By.id("cc-expiration");
    By cvv = By.id("cc-cvv");

    By continueBtn = By.xpath("//button[contains(text(),'Continue')]");

    public void openBasket() {
        WebElement element = waitForElement(basketLink);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }

    public boolean isBasketPageDisplayed() {
        return waitForElement(basketTitle).isDisplayed();
    }
    
    public void enterDetails() {

        driver.findElements(firstName).get(0).sendKeys("Test");
        driver.findElements(lastName).get(1).sendKeys("User");

        type(email, "test@gmail.com");
        type(address, "Guntur");

        new Select(waitForElement(country)).selectByIndex(1);
        new Select(waitForElement(city)).selectByIndex(1);

        type(zip, "522034");

        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,400)");

        type(cardName, "Test User");
        type(cardNumber, "1234567812345678");
        type(expiry, "12/28");
        type(cvv, "123");
    }

    public void clickContinue() {
        WebElement btn = waitForElement(continueBtn);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", btn);
    }

    public boolean isContinueDisplayed() {
        return waitForElement(continueBtn).isDisplayed();
    }
}