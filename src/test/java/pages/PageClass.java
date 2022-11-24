package pages;

//import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

import java.net.URL;

public class PageClass {
        public final WebDriver driver;
        private final URL url = getClass().getClassLoader().getResource("checkout/index.html");
        public PageClass(WebDriver driver) {
            this.driver = driver;
        }
        protected PageElements elements() {
            return new PageElements(driver);
        }
//        public PageAssertions assertions() {
//            return new PageAssertions(driver);
//        }
        public void navigate() {
            driver.navigate().to(url);
        }
//        @Step("Step 1 - Filling the data to the form")
        public void fillInfo(UserInfo userInfo) {
            elements().firstName().sendKeys(userInfo.getFirstName());
//            elements().lastName().sendKeys(userInfo.getLastName());
//            elements().username().sendKeys(userInfo.getUsername());
//            elements().email().sendKeys(userInfo.getEmail());
//            elements().address1().sendKeys(userInfo.getAddress1());
//            elements().address2().sendKeys(userInfo.getAddress2());
//          elements().country().selectByIndex(userInfo.getCountry());
//            elements().state().selectByIndex(userInfo.getState());
//            elements().zip().sendKeys(userInfo.getZip());
//            elements().cardName().sendKeys(userInfo.getCardName());
//            elements().cardNumber().sendKeys(userInfo.getCardNumber());
//            elements().cardExpiration().sendKeys(userInfo.getCardExpiration());
//            elements().cardCVV().sendKeys(userInfo.getCardCVV());
//            elements().submitButton().click();
        }

}
