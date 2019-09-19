package com.enlightenment.teststeps;

import com.enlightenment.appiumsupport.AppiumController;
import com.enlightenment.pageobjects.FormsPage;
import com.enlightenment.pageobjects.HomePage;
import com.enlightenment.utils.CommonActions;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.JavascriptExecutor;

import java.util.HashMap;

import static org.testng.Reporter.getCurrentTestResult;

public class DemoSteps {


    public static void given_user_navigates_to_forms_page() {
        HomePage homePage = new HomePage(AppiumController.getDriver());
        homePage.navigateToForms();

    }

    public static void when_user_interacts_with_forms_page() {
        FormsPage formsPage = new FormsPage(AppiumController.getDriver());
        formsPage.interactWithFormsPage("Text for Test");
        CommonActions.pauseTest(5);

    }

    public static void then_the_expected_text_is_displayed() {
        FormsPage formsPage = new FormsPage(AppiumController.getDriver());
        assertThat(formsPage.getTextFieldValue(), equalTo("Text for Test"));
        System.out.println("Managed to verify the text field");
        assertThat(formsPage.getSwitchButtonText(), equalTo("Click to turn the switch OFF"));
        System.out.println("Managed to verify the switch button");
    }

    public static void method_for_getting_your_os_and_switching_between_apps() {


//        //This is how you can get your test know whether it is an iOS or Android under test
//        String platform = getCurrentTestResult().getMethod().getXmlTest().getParameter("platformName").toLowerCase();


//        if (platform.equals("ios")) {
//            driver.runAppInBackground(30);
//            driver.closeApp();


//            /*
//            This is a way to switch from you app under test to let's say safari browser, where you can do something.
//            Then you can switch back to your app
//             */
//            JavascriptExecutor js = (driver);
//            HashMap<String, String> safariBundledId = new HashMap<>();
//            safariBundledId.put("bundleId", "com.apple.mobilesafari");
//            js.executeScript("mobile: launchApp", safariBundledId);
//
//
//            driver.get("https://www.google.com/gmail/about/#");
//
//            CommonActions.pauseTest(12);
//
//
//            HashMap<String, String> appBundleId = new HashMap<>();
//            appBundleId.put("bundleId", "com.wdiodemoapp");
//            js.executeScript("mobile: launchApp", appBundleId);

    }
}
