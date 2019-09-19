package com.enlightenment.pageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class FormsPage extends HomePage {

    public FormsPage(AppiumDriver driver) {
        super(driver);
//        onPage();
    }

    @AndroidFindBy(xpath = "//android.widget.EditText[@index='0']")
    @iOSFindBy(xpath = "//XCUIElementTypeTextField[@name='text-input']")
    private MobileElement textField;


    @AndroidFindBy(accessibility = "input-text-result")
    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name='input-text-result']")
    private MobileElement textFieldValue;

    @AndroidFindBy(accessibility = "switch")
    @iOSFindBy(xpath = "//XCUIElementTypeSwitch[@name='switch']")
    private MobileElement switchElement;

    @AndroidFindBy(accessibility = "switch-text")
    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name='switch-text']")
    private MobileElement switchButtonText;

    private void onPage() {
        textFieldValue.isDisplayed();
    }

    private void enterValueForTextField(String textValue) {
        System.out.println(String.format("Trying to enter value %s at demo text field", textValue));
        textField.clear();
        textField.sendKeys(textValue);
    }

    private void clickOnSwitchElement() {
        switchElement.click();
    }

    public void interactWithFormsPage(String textValue) {
        enterValueForTextField(textValue);
        clickOnSwitchElement();
    }

    public String getTextFieldValue() {
        return textFieldValue.getText();
    }

    public String getSwitchButtonText() {
        return switchButtonText.getText();
    }
}
