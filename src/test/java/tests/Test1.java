package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import com.epam.healenium.SelfHealingDriver;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.PageClass;
import pages.UserInfo;

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
    public void assertFormSent_When_ValidInfoInput() {
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
//        localPage.assertions().formSent();
    }

    @Test(description = "with self healing::locator change")
    public void locator_change() {
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

    @Test(description = "without self healing::locator position change")
    public void position_change() {
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

    @Test(description = "with self healing::locator position change")
    public void position_change_self_heal() {
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

}