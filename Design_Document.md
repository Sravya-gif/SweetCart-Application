# Design Document – SweetCart Automation Framework

## Introduction

This project is an automation testing framework developed using Selenium WebDriver, Java, and TestNG for the SweetCart web application.
It automates key user functionalities like login, product browsing, basket, and checkout.

---

## Tools & Technologies

* Java
* Selenium WebDriver
* TestNG
* Maven
* Extent Reports (for reporting)

---

## Framework Architecture

The framework follows Page Object Model (POM) design pattern.

---


## Key Features

* Page Object Model (POM)
* Reusable methods
* Config-driven execution
* Screenshot on failure
* HTML reporting

---

## Test Scenarios Covered

* Login (valid & invalid)
* Navigation validation
* Product listing verification
* Add to basket
* Checkout form handling

---

##  Project Structure
```
SweetCart
│
├── src/main/java
│   ├── com.srm.base
│   │   ├── BasePage.java
│   │   └── BaseTest.java
│   │
│   ├── com.srm.listeners
│   │   └── TestListener.java
│   │
│   ├── com.srm.pages
│   │   ├── AccountPage.java
│   │   ├── BasketPage.java
│   │   ├── HomePage.java
│   │   ├── LoginPage.java
│   │   ├── ProductPage.java
│   │   └── SweetsPage.java
│   │
│   ├── com.srm.utils
│   │   ├── ConfigReader.java
│   │   ├── ExtentManager.java
│   │   └── ScreenshotUtil.java
│
├── src/main/resources
│   └── config.properties
│
├── src/test/java
│   └── com.srm.tests
│       ├── AccountTest.java
│       ├── BasketTest.java
│       ├── LoginTest.java
│       ├── NavigationTest.java
│       └── ProductTest.java
│
├── reports
├── screenshots
├── testng.xml
└── pom.xml
```
