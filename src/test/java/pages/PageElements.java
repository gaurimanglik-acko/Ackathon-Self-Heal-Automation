package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageElements {
        private final WebDriver driver;
        public PageElements(WebDriver driver) {
            this.driver = driver;
        }
        public WebElement firstName() {
            return driver.findElement(By.id("firstName"));
        }

    public WebElement firstName_xpath() {
        return driver.findElement(By.xpath("//label[contains(text(), \"First name\")]//following-sibling::input"));
    }
        public WebElement lastName() {
            return driver.findElement(By.id("lastName"));
        }
        public WebElement username() {
            return driver.findElement(By.id("username"));
        }
        public WebElement email() {
            return driver.findElement(By.id("email"));
        }
        public WebElement address1() {
            return driver.findElement(By.id("address"));
        }
        public WebElement address2() {
            return driver.findElement(By.id("address2"));
        }
        public Select country() {
            return new Select(driver.findElement(By.id("country")));
        }
        public Select state() {
            return new Select(driver.findElement(By.id("state")));
        }
        public WebElement zip() {
            return driver.findElement(By.id("zip"));
        }

    public WebElement sameAddressCheckBox() {
        return driver.findElement(By.id("same-address"));
    }

    public WebElement debitCardRadio() {
        return driver.findElement(By.id("debit"));
    }
        public WebElement cardName() {
            return driver.findElement(By.id("cc-name"));
        }
        public WebElement cardNumber() {
            return driver.findElement(By.id("cc-number"));
        }
        public WebElement cardExpiration() {
            return driver.findElement(By.id("cc-expiration"));
        }
        public WebElement cardCVV() {
            return driver.findElement(By.id("cc-cvv"));
        }
        public WebElement submitButton() {
            return driver.findElement(By.xpath("//button[text()='Continue to checkout']"));
        }
    }
