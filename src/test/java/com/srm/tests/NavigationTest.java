package com.srm.tests;

import org.testng.annotations.Test;
import com.srm.base.BaseTest;

public class NavigationTest extends BaseTest {

    @Test
    public void navigationTest() {

        if (driver.getTitle().contains("Sweet")) {
            System.out.println("Navigation passed");
        } else {
            System.out.println("Navigation failed");
        }
    }
}