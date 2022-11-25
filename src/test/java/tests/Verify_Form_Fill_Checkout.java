package tests;

import com.epam.healenium.annotation.DisableHealing;
import org.testng.annotations.Test;
import pages.PageClass;
import pages.UserInfo;
import java.net.URL;

public class Verify_Form_Fill_Checkout extends BaseTest{
    private final URL url = getClass().getClassLoader().getResource("checkout/index.html");
    private final URL url_1 = getClass().getClassLoader().getResource("checkout/build_1.html");
    private final URL url_2 = getClass().getClassLoader().getResource("checkout/build_2.html");
    private final URL url_3 = getClass().getClassLoader().getResource("checkout/build_3.html");

    @Test
    public void test1_positive_scenario_build_0() {
            var pageClass = new PageClass(driver);
            pageClass.navigate(url);
            var userInfo = new UserInfo();
            pageClass.setUserDetails(userInfo);
            pageClass.fillInfo_updated(userInfo);
    }

    @Test
    @DisableHealing
    public void test4_negative_scenario_build_2() {
        var pageClass = new PageClass(driver);
        pageClass.navigate(url_2);
        var userInfo = new UserInfo();
        pageClass.setUserDetails(userInfo);
        pageClass.fillInfo_updated(userInfo);
    }

    @Test
    public void test3_negative_scenario_build_2() {
        var pageClass = new PageClass(driver);
        pageClass.navigate(url_2);
        var userInfo = new UserInfo();
        pageClass.setUserDetails(userInfo);
        pageClass.fillInfo_updated(userInfo);
    }

    @Test
    public void test2_negative_scenario_build_1() {
        var pageClass = new PageClass(driver);
        pageClass.navigate(url_1);
        var userInfo = new UserInfo();
        pageClass.setUserDetails(userInfo);
        pageClass.fillInfo(userInfo);
//        pageClass.assertions().formSent();
    }







    @Test
    public void test3_negative_scenario_build_3() {
        var pageClass = new PageClass(driver);
        pageClass.navigate(url_3);
        var userInfo = new UserInfo();
        pageClass.setUserDetails(userInfo);
        pageClass.fillInfo(userInfo);
//        pageClass.assertions().formSent();
    }

}