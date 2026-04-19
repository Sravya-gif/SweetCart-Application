package com.srm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.srm.base.BasePage;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    By loginLink = By.linkText("Login");
    By email = By.id("exampleInputEmail");       
    By password = By.id("exampleInputPassword");  
    By loginBtn = By.xpath("//button[text()='Login']");

    public void openLogin() {
        click(loginLink);
    }

    public void login(String user, String pass) {
        type(email, user);
        type(password, pass);
        click(loginBtn);
    }
}