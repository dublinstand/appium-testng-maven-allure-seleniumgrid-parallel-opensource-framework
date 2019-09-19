package com.enlightenment.pageobjects;

import com.enlightenment.appiumsupport.AppiumController;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.*;
import io.qameta.allure.Step;

import javax.naming.directory.ModificationItem;

public class HomePage extends BasePage {

    public HomePage(AppiumDriver driver) {
        super(driver);
        onPage();
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Forms']")
    @iOSFindBy(xpath = "//XCUIElementTypeOther[@name='Forms']")
    private MobileElement forms;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Swipe']")
    @iOSFindBy(xpath = "//XCUIElementTypeOther[@name='Swipe']")
    private MobileElement swipe;


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='WEBDRIVER']")
    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name='WEBDRIVER']")
    private MobileElement homeScreen;


//    Issue with returning page like that

//    @Step("Navigation to Forms Tab")
//    public FormsPage navigateToForms(){
//        System.out.println("Navigating to Forms Tab");
//        forms.click();
//        return new FormsPage(AppiumController.getDriver());
//    }

    @Step("Navigation to Forms Tab")
    public void navigateToForms(){
        System.out.println("Navigating to Forms Tab");
        forms.click();
    }

    @Step("Navigation to Swipe Tab")
    public void navigateToSwipe(){
        System.out.println("Navigating to Swipe Tab");
        swipe.click();
    }


    private void onPage() {
//        homeScreen.isDisplayed();
    }
}
