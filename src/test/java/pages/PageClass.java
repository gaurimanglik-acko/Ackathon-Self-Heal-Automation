package pages;

//import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

import java.net.URL;

public class PageClass {
        public final WebDriver driver;

        public PageClass(WebDriver driver) {
            this.driver = driver;
        }
        protected PageElements elements() {
            return new PageElements(driver);
        }
//        public PageAssertions assertions() {
//            return new PageAssertions(driver);
//        }
        public void navigate(URL url) {
            driver.navigate().to(url);
        }

        public void setUserDetails(UserInfo userInfo){
            userInfo.setFirstName("Anthony");
            userInfo.setLastName("Gonsalves");
            userInfo.setUsername("golmaal3");
            userInfo.setEmail("anthony@gmail.com");
            userInfo.setAddress1("Machhi Talao, Dockyard Lane");
            userInfo.setAddress2("Opposite Prawns Corner");
            userInfo.setCountry(2);
            userInfo.setState(2);
            userInfo.setZip("10115");
            userInfo.setCardName("Anthony Gonsalves");
            userInfo.setCardNumber("1234567890123456");
            userInfo.setCardExpiration("12/23");
            userInfo.setCardCVV("420");
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

    public void fillInfo_updated(UserInfo userInfo) {
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
