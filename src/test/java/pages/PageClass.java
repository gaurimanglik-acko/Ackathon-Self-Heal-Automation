package pages;

//import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

import java.net.URL;

public class PageClass {
        public final WebDriver driver;
        private final URL url = getClass().getClassLoader().getResource("checkout/index.html");
        private final URL url_1 = getClass().getClassLoader().getResource("checkout/build_1.html");
        private final URL url_2 = getClass().getClassLoader().getResource("checkout/build_2.html");

    private final URL url_3 = getClass().getClassLoader().getResource("checkout/build_3.html");
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

    public void navigateBuild_1() {
        driver.navigate().to(url_1);
    }

    public void navigateBuild_2() {
        driver.navigate().to(url_2);
    }

    public void navigateBuild_3() {
        driver.navigate().to(url_3);
    }


//        @Step("Step 1 - Filling the data to the form")
        public void fillInfo(UserInfo userInfo) {
            elements().firstName().sendKeys(userInfo.getFirstName());
            elements().lastName().sendKeys(userInfo.getLastName());
            elements().username().sendKeys(userInfo.getUsername());
            elements().email().sendKeys(userInfo.getEmail());
            elements().address1().sendKeys(userInfo.getAddress1());
            elements().address2().sendKeys(userInfo.getAddress2());
            elements().country().selectByIndex(userInfo.getCountry());
            elements().state().selectByIndex(userInfo.getState());
            elements().zip().sendKeys(userInfo.getZip());
            elements().sameAddressCheckBox().click();
            elements().debitCardRadio().click();
            elements().cardName().sendKeys(userInfo.getCardName());
            elements().cardNumber().sendKeys(userInfo.getCardNumber());
            elements().cardExpiration().sendKeys(userInfo.getCardExpiration());
            elements().cardCVV().sendKeys(userInfo.getCardCVV());
//            elements().submitButton().click();
        }

    public void fillInfo_2(UserInfo userInfo) {
        elements().firstName_xpath().sendKeys(userInfo.getFirstName());
        elements().lastName().sendKeys(userInfo.getLastName());
        elements().username().sendKeys(userInfo.getUsername());
        elements().email().sendKeys(userInfo.getEmail());
        elements().address1().sendKeys(userInfo.getAddress1());
        elements().address2().sendKeys(userInfo.getAddress2());
        elements().country().selectByIndex(userInfo.getCountry());
        elements().state().selectByIndex(userInfo.getState());
        elements().zip().sendKeys(userInfo.getZip());
        elements().cardName().sendKeys(userInfo.getCardName());
        elements().cardNumber().sendKeys(userInfo.getCardNumber());
        elements().cardExpiration().sendKeys(userInfo.getCardExpiration());
        elements().cardCVV().sendKeys(userInfo.getCardCVV());
//        elements().submitButton().click();
    }

}
