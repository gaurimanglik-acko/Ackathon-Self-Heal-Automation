package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import org.junit.jupiter.api.AfterEach;
import com.epam.healenium.SelfHealingDriver;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.PageClass;
import pages.UserInfo;

import java.io.ByteArrayInputStream;
import java.io.File;

public class Test1 {
    WebDriver delegate;

    SelfHealingDriver driver;
    public static String browser="Chrome";

    @BeforeTest
    public void beforeTest() throws InterruptedException {
        switch (browser) {
            case "Chrome" -> {

                WebDriverManager.chromedriver().setup();
                delegate = new ChromeDriver();
                driver = SelfHealingDriver.create(delegate);
            }
            case "Firefox" -> {
                WebDriverManager.firefoxdriver().setup();
                delegate = new FirefoxDriver();
                driver = SelfHealingDriver.create(delegate);
            }
            case "Safari" -> {
                WebDriverManager.safaridriver().setup();
                delegate = new SafariDriver();
                driver = SelfHealingDriver.create(delegate);
            }
            default -> throw new IllegalStateException("Unexpected value: " + browser);
        }

    }

    @AfterEach
    public void testCleanup() {
        driver.quit();
    }
    @Test(description = "Without self healing")
    @Description("Without self healing")
    public void assertFormSent_When_ValidInfoInput() {
        try{
            var pageClass = new PageClass(driver);
            pageClass.navigate();
            var userInfo = new UserInfo();
            userInfo.setFirstName("Anton");
            userInfo.setLastName("Angelov");
//        userInfo.setUsername("aangelov");
//        userInfo.setEmail("info@berlinspaceflowers.com");
//        userInfo.setAddress1("1 Willi Brandt Avenue Tiergarten");
//        userInfo.setAddress2("Lützowplatz 17");
//        userInfo.setCountry(1);
//        userInfo.setState(1);
//        userInfo.setZip("10115");
//        userInfo.setCardName("Anton Angelov");
//        userInfo.setCardNumber("1234567890123456");
//        userInfo.setCardExpiration("12/23");
//        userInfo.setCardCVV("123");
            pageClass.fillInfo(userInfo);
//        pageClass.assertions().formSent();
        }
        catch(Exception e) {
            Allure.addAttachment("Caught an exception" , e.getMessage());
            Allure.addAttachment("Assertion Failed at this page", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
        }
    }

    @Test(description = "with self healing::locator change")
    @Description("With self healing when locator is changed")
    public void locator_change() {
        try {
            var pageClass = new PageClass(driver);
            pageClass.navigate();
            var userInfo = new UserInfo();
            Allure.addAttachment("Form", "Starting filling the form");
            userInfo.setFirstName("Anton");
            userInfo.setLastName("Angelov");
            userInfo.setUsername("aangelov");
            userInfo.setEmail("info@berlinspaceflowers.com");
            userInfo.setAddress1("1 Willi Brandt Avenue Tiergarten");
            userInfo.setAddress2("Lützowplatz 17");
            userInfo.setCountry(1);
            userInfo.setState(1);
            userInfo.setZip("10115");
            userInfo.setCardName("Anton Angelov");
            userInfo.setCardNumber("1234567890123456");
            userInfo.setCardExpiration("12/23");
            userInfo.setCardCVV("123");
            pageClass.fillInfo(userInfo);
            Allure.addAttachment("Starting Assertion for self-healing condition", "Filling up the form with given data and submitting the form");
            Allure.addAttachment("Filled form" , new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
//        localPage.assertions().formSent();
        }
        catch(Exception e) {
            Allure.addAttachment("Caught an exception" , e.getMessage());
            Allure.addAttachment("Assertion Failed at this page", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
        }
    }

    @Test(description = "without self healing::locator position change")
    @Description("Without self healing when locator position is changed")
    public void position_change() {
        try{
            var pageClass = new PageClass(driver);
            pageClass.navigate();
            var userInfo = new UserInfo();
//        userInfo.setFirstName("Anton");
//        userInfo.setLastName("Angelov");
//        userInfo.setUsername("aangelov");
//        userInfo.setEmail("info@berlinspaceflowers.com");
//        userInfo.setAddress1("1 Willi Brandt Avenue Tiergarten");
//        userInfo.setAddress2("Lützowplatz 17");
//        userInfo.setCountry(1);
//        userInfo.setState(1);
//        userInfo.setZip("10115");
//        userInfo.setCardName("Anton Angelov");
//        userInfo.setCardNumber("1234567890123456");
//        userInfo.setCardExpiration("12/23");
//        userInfo.setCardCVV("123");
            pageClass.fillInfo(userInfo);
//        localPage.assertions().formSent();
       }
       catch(Exception e) {
            Allure.addAttachment("Caught an exception" , e.getMessage());
            Allure.addAttachment("Assertion Failed at this page", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
        }
    }

    @Test(description = "with self healing::locator position change")
    @Description("With self healing when the locator position is changed")
    public void position_change_self_heal() {
        try {
            var pageClass = new PageClass(driver);
            pageClass.navigate();
            var userInfo = new UserInfo();
//        userInfo.setFirstName("Anton");
//        userInfo.setLastName("Angelov");
//        userInfo.setUsername("aangelov");
//        userInfo.setEmail("info@berlinspaceflowers.com");
//        userInfo.setAddress1("1 Willi Brandt Avenue Tiergarten");
//        userInfo.setAddress2("Lützowplatz 17");
//        userInfo.setCountry(1);
//        userInfo.setState(1);
//        userInfo.setZip("10115");
//        userInfo.setCardName("Anton Angelov");
//        userInfo.setCardNumber("1234567890123456");
//        userInfo.setCardExpiration("12/23");
//        userInfo.setCardCVV("123");
            pageClass.fillInfo(userInfo);
//        localPage.assertions().formSent();
       }
       catch(Exception e) {
            Allure.addAttachment("Caught an exception" , e.getMessage());
            Allure.addAttachment("Assertion Failed at this page", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
        }
    }

}