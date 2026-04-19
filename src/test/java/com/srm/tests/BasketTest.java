package com.srm.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.srm.base.BaseTest;
import com.srm.pages.*;

public class BasketTest extends BaseTest {

    @Test
    public void basketTest() {

        HomePage home = new HomePage(driver);
        SweetsPage sweets = new SweetsPage(driver);
        BasketPage basket = new BasketPage(driver);

        home.clickSweets();
        System.out.println("Navigated to Sweets Page");

        sweets.addFirstProduct();
        System.out.println("Product Added to Basket");

        basket.openBasket();
        System.out.println("Clicked on Basket");

        boolean isBasketPage = basket.isBasketPageDisplayed();

        if (isBasketPage) {
            System.out.println("Basket Page Opened");
        } else {
            System.out.println("Basket Page Opened");
        }

        Assert.assertTrue(isBasketPage);

        basket.enterDetails();
        System.out.println("Checkout Details Entered");

        basket.clickContinue();
        System.out.println("Clicked Continue");

        boolean result = basket.isContinueDisplayed();

        if (result) {
            System.out.println("Checkout done successfully");
        } else {
            System.out.println("checkout failed");
        }

        Assert.assertTrue(result);
    }
}