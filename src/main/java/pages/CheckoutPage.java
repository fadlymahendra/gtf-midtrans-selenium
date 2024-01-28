package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {

    private WebDriver driver;

    // Locators
    private By buyBotton = By.className("buy");
    private By checkoutButton = By.className("cart-checkout");
    private By creditDebitPayment = By.cssSelector("a.list[data-testid='list-item'][href='#/credit-card']:first-child");
    private By cardNumberField = By.cssSelector("[autocomplete=\"cc-number\"]");
    private By cardExpiryField = By.id("card-expiry");
    private By cardCvvField = By.id("card-cvv");
    private By payNowButton = By.xpath("//button[text()='Pay now']");
    private By otpField = By.id("otp");
    private By successButton = By.className("btn-success");
    private By successPaymentInfo = By.xpath("//div[text()='Payment successful']");
    


    // Constructor
    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    // Methods
    public void clickBuy() {
        WebElement buyBtn = driver.findElement(buyBotton);
        buyBtn.click();
    }

    public void clickCheckout() {
        WebElement checkoutBtn = driver.findElement(checkoutButton);
        checkoutBtn.click();
    }

    public void clickcreditDebitPayment() {
        driver.switchTo().frame("snap-midtrans");
        
        WebElement clickcreditDebit = driver.findElement(creditDebitPayment);
        clickcreditDebit.click(); 
    }

    public void inputValidCard(){
        WebElement cardNumber = driver.findElement(cardNumberField);
        cardNumber.sendKeys("4811111111111114");

        WebElement cardExpiry = driver.findElement(cardExpiryField);
        cardExpiry.sendKeys("0126");

        WebElement cardCvv = driver.findElement(cardCvvField);
        cardCvv.sendKeys("123");

        WebElement payNow = driver.findElement(payNowButton);
        payNow.click();

        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void inputValidOtp(){
        driver.switchTo().frame(0);
        
        WebElement otp = driver.findElement(otpField);
        otp.sendKeys("112233");

        WebElement successBtn = driver.findElement(successButton);
        successBtn.click();
    }

    public boolean paymentInfo(){
        return driver.findElement(successPaymentInfo).isDisplayed();
    }


}
