package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
//import io.qameta.allure.Allure;
//import io.qameta.allure.Description;
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

public class Test1 extends BaseTest{


    @Test(description = "Without self healing")
//    @Description("Without self healing")
    public void assertFormSent_When_ValidInfoInput() {
        try {
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
        } catch (Exception e) {
//            Allure.addAttachment("Caught an exception", e.getMessage());
//            Allure.addAttachment("Assertion Failed at this page", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
        }
    }
}