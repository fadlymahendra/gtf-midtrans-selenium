package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {

    private WebDriver driver;

    // Locators
    private By buyBotton = By.className("buy");
    private By checkoutButton = By.className("cart-checkout");


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


}
