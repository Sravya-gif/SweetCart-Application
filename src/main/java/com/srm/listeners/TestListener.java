package com.srm.listeners;

import org.testng.*;
import org.openqa.selenium.WebDriver;  
import com.aventstack.extentreports.*;
import com.srm.utils.*;
import com.srm.base.BaseTest;

public class TestListener implements ITestListener {

    ExtentReports extent = ExtentManager.getReport();
    ExtentTest test;

    @Override
    public void onTestStart(ITestResult result) {
        test = extent.createTest(result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test.pass("Test Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {

        test.fail("Test Failed");

        Object currentClass = result.getInstance();
        WebDriver driver = ((BaseTest) currentClass).driver;

        ScreenshotUtil.capture(driver, result.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        extent.flush();
    }
}