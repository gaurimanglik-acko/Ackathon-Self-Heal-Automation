package tests;

import com.epam.healenium.SelfHealingDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    WebDriver delegate;
    SelfHealingDriver driver;
    public static String browser = "Chrome";

    @AfterTest
    public void testCleanup() {
        driver.close();
    }

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
//        driver.manage().window().maximize();

    }
}
