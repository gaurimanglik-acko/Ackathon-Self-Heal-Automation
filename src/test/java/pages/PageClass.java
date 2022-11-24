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
