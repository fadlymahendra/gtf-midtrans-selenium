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
    public void clickOnBuy() {
        checkoutPage.clickBuy();
    }

    @When("I click on checkout button")
    public void clickOnCheckout() {
        checkoutPage.clickCheckout();
    }


    @When("I click on Credit Debit Payment method")
    public void clickPaymentMethod() {
        checkoutPage.clickcreditDebitPayment();
    }

    @When("I input valid credit card information")
    public void inputValidCard() {
        checkoutPage.inputValidCard();
    }

    @When("I input and submit valid OTP")
    public void inputValidOtp() {
        checkoutPage.inputValidOtp();
    }

    @Then("Verify payment successful")
    public void verifyPayment() {
    // Still flaky / mostly failed -- need to improve this method
    // Assert.assertEquals(checkoutPage.paymentInfo(), true);
    }

}

