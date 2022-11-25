package tests;

//import io.qameta.allure.Allure;
//import io.qameta.allure.Description;
import org.testng.annotations.Test;
import pages.PageClass;
import pages.UserInfo;
import java.net.URL;

public class Verify_Form_Fill_Checkout extends BaseTest{
    private final URL url = getClass().getClassLoader().getResource("checkout/index.html");
    private final URL url_1 = getClass().getClassLoader().getResource("checkout/build_1.html");
    private final URL url_2 = getClass().getClassLoader().getResource("checkout/build_2.html");
    private final URL url_3 = getClass().getClassLoader().getResource("checkout/build_3.html");
    private final URL url_4 = getClass().getClassLoader().getResource("checkout/test_build.html");

    @Test(description = "Without self healing")
    public void test1_positive_scenario_build_0() {
//        try {
            var pageClass = new PageClass(driver);
            pageClass.navigate(url);
            var userInfo = new UserInfo();
            pageClass.setUserDetails(userInfo);
            pageClass.fillInfo(userInfo);
//        pageClass.assertions().formSent();
    }

    @Test(description = "Without self healing")
    public void test2_negative_scenario_build_1() {
        var pageClass = new PageClass(driver);
        pageClass.navigate(url_1);
        var userInfo = new UserInfo();
        pageClass.setUserDetails(userInfo);
        pageClass.fillInfo(userInfo);
//        pageClass.assertions().formSent();
    }


    @Test(description = "Without self healing")
    public void test3_negative_scenario_build_2() {
        var pageClass = new PageClass(driver);
        pageClass.navigate(url_2);
        var userInfo = new UserInfo();
        pageClass.setUserDetails(userInfo);
        pageClass.fillInfo_updated(userInfo);
//        pageClass.assertions().formSent();
    }


    @Test(description = "Without self healing")
    public void test3_negative_scenario_build_3() {
        var pageClass = new PageClass(driver);
        pageClass.navigate(url_3);
        var userInfo = new UserInfo();
        pageClass.setUserDetails(userInfo);
        pageClass.fillInfo(userInfo);
//        pageClass.assertions().formSent();
    }

    @Test(description = "Without self healing")
    public void test4_negative_scenario_build_3() {
//        try {
        var pageClass = new PageClass(driver);
        pageClass.navigate(url_4);
        var userInfo = new UserInfo();
        pageClass.setUserDetails(userInfo);
        pageClass.fillInfo(userInfo);
//        pageClass.assertions().formSent();
    }
}