package com.srm.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.srm.base.BaseTest;
import com.srm.pages.LoginPage;
import com.srm.pages.AccountPage;

public class AccountTest extends BaseTest {

    @Test
    public void accountTest() {

        LoginPage lp = new LoginPage(driver);
        AccountPage acc = new AccountPage(driver);

        lp.openLogin();
        lp.login("fiveorders@sweetshop.local", "qwerty");

        boolean isDisplayed = acc.isAccountPageDisplayed();

        Assert.assertTrue(isDisplayed);

        System.out.println("Account page verified successfully");
    }
}