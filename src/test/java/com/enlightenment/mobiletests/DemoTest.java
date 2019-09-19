package com.enlightenment.mobiletests;

import com.enlightenment.utils.CommonActions;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

import static com.enlightenment.teststeps.DemoSteps.*;

public class DemoTest extends BaseTest {

    @Description("Testing the login functionality")
    @Feature("Login")
    @Story("Valid Login")
    @Test(description = "Login First Test")
    public void loginBasicTest() {
        given_user_navigates_to_forms_page();
        when_user_interacts_with_forms_page();
        CommonActions.pauseTest(5);
        then_the_expected_text_is_displayed();
    }
}
