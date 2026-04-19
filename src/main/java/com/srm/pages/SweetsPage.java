package com.srm.pages;

import java.util.List;
import org.openqa.selenium.*;
import com.srm.base.BasePage;

public class SweetsPage extends BasePage {

    public SweetsPage(WebDriver driver) {
        super(driver);
    }

    By products = By.xpath("//div[contains(@class,'card')]");
    By names = By.xpath("//div[contains(@class,'card')]//h5");
    By prices = By.xpath("//div[contains(text(),'£')]");
    By addButtons = By.xpath("//a[contains(@class,'addItem')]");

    public int getProductCount() {
        return driver.findElements(products).size();
    }

    public boolean verifyProductsDisplayed() {

        List<WebElement> nameList = driver.findElements(names);
        List<WebElement> priceList = driver.findElements(prices);
        List<WebElement> btnList = driver.findElements(addButtons);

        return nameList.size() > 0 &&
               priceList.size() > 0 &&
               btnList.size() > 0;
    }

    public void addFirstProduct() {
        driver.findElements(addButtons).get(0).click();
    }
}