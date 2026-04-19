package com.srm.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import com.srm.base.BaseTest;
import com.srm.pages.LoginPage;
import com.srm.pages.AccountPage;

@Listeners(com.srm.listeners.TestListener.class)
public class LoginTest extends BaseTest {

    @Test(dataProvider = "data")
    public void loginTest(String user, String pass, boolean expected) {

        LoginPage lp = new LoginPage(driver);
        AccountPage acc = new AccountPage(driver);

        lp.openLogin();
        lp.login(user, pass);

        boolean isLoggedIn = false;

        try {
           
            isLoggedIn = acc.isAccountPageDisplayed();
        } catch (Exception e) {
            isLoggedIn = false;
        }

        if (isLoggedIn) {
            System.out.println("Login passed for: " + user);
        } else {
            System.out.println("Login failed for: " + user);
        }

        Assert.assertTrue(isLoggedIn);
    }


    @DataProvider
    public Object[][] data() {
        return new Object[][] {
            {"fiveorders@sweetshop.local", "qwerty",true},
            {"twoorders@sweetshop.local", "qwerty",true},
            {"oneorder@sweetshop.local", "qwerty",true},
            {"wrong@test.com", "wrong",false}
        };
    }
}