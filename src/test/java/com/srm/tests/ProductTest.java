package com.srm.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.srm.base.BaseTest;

public class ProductTest extends BaseTest {

    @Test
    public void productTest() {

        driver.findElement(By.linkText("Sweets")).click();

        List<WebElement> products = driver.findElements(By.xpath("//div[contains(@class,'card')]"));

        System.out.println("Total products: " + products.size());

        if (products.size() > 0) {
            System.out.println("Product Test passed successfully");
        } else {
            System.out.println("Product Test failed");
        }

        Assert.assertTrue(products.size() > 0);
    }
}