package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.PageClass;
import pages.UserInfo;

public class Test1 {
    public WebDriver driver;
    @BeforeAll
    public static void classInit() {
        WebDriverManager.chromedriver().create();
    }

    @AfterEach
    public void testCleanup() {
        driver.quit();
    }
    @Test
    public void assertFormSent_When_ValidInfoInput() {
        var pageClass = new PageClass(driver);
        pageClass.navigate();
        var userInfo = new UserInfo();
//        clientInfo.setFirstName("Anton");
//        clientInfo.setLastName("Angelov");
//        clientInfo.setUsername("aangelov");
//        clientInfo.setEmail("info@berlinspaceflowers.com");
//        clientInfo.setAddress1("1 Willi Brandt Avenue Tiergarten");
//        clientInfo.setAddress2("Lützowplatz 17");
//        clientInfo.setCountry(1);
//        clientInfo.setState(1);
//        clientInfo.setZip("10115");
//        clientInfo.setCardName("Anton Angelov");
//        clientInfo.setCardNumber("1234567890123456");
//        clientInfo.setCardExpiration("12/23");
//        clientInfo.setCardCVV("123");
//        localPage.fillInfo(clientInfo);
//        localPage.assertions().formSent();
    }
}