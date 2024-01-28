package com.qa.mystepdefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.CheckoutPage;

public class CheckoutStepDefinition {

    private WebDriver driver;
    private CheckoutPage checkoutPage;

    @Before
    public void setup(){
        driver = new ChromeDriver();
    }

    @After
    public void tearDown(){
        if(driver!=null){
            driver.quit();
        }
    }


    @Given("I am on the Midtrans home page")
    public void on_midtrans_page() {
        driver.get("https://demo.midtrans.com/");
        checkoutPage = new CheckoutPage(driver);

    }

    @When("I click on the buy button")
    public void click_buy_button() {
        checkoutPage.clickBuy();
    }

    @When("I click on checkout button")
    public void click_checkout_button() {
        checkoutPage.clickCheckout();
    }
}
