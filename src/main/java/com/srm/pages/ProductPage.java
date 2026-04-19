package com.srm.pages;

import java.util.List;
import org.openqa.selenium.*;
import com.srm.base.BasePage;

public class ProductPage extends BasePage {

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    By productNames = By.xpath("//div[contains(@class,'card')]//h5");
    By productPrices = By.xpath("//p[contains(text(),'£')]"); 
    By addButtons = By.xpath("//a[contains(@class,'addItem')]");

    public boolean verifyProductDetails() {

        waitForElement(productNames); 

        List<WebElement> names = driver.findElements(productNames);
        List<WebElement> prices = driver.findElements(productPrices);
        List<WebElement> buttons = driver.findElements(addButtons);

        System.out.println("Names: " + names.size());
        System.out.println("Prices: " + prices.size());
        System.out.println("Buttons: " + buttons.size());

        return names.size() > 0 &&
               prices.size() > 0 &&
               buttons.size() > 0;
    }
}