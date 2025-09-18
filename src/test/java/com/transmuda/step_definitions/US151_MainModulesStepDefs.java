package com.transmuda.step_definitions;

import com.transmuda.pages.BasePage;
import com.transmuda.pages.MainModulesPage;
import com.transmuda.utilities.BrowserUtils;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Arrays;
import java.util.List;

public class US151_MainModulesStepDefs extends BasePage {

    MainModulesPage mainModulesPage = new MainModulesPage();

    @When("the user views the main modules")
    public void the_user_views_the_main_modules() {
        BrowserUtils.waitFor(5);
        List<String> actualModules = mainModulesPage.getMenuOptions();
        System.out.println("Actual Modules: " + actualModules);

    }

    @Then("the user should see {string} modules")
    public void the_user_should_see_modules(String expectedCount) {
        int actualCount = mainModulesPage.getMenuOptions().size();
        System.out.println("Actual module count: " + actualCount);
        Assert.assertEquals("Module count mismatch!", Integer.parseInt(expectedCount), actualCount);
    }


    @Then("the user should see the following modules")
    public void the_user_should_see_the_following_modules(List<String> expectedModules) {
        BrowserUtils.waitFor(5);
        List<String> actualModules = mainModulesPage.getMenuOptions();
        System.out.println("Actual Modules: " + actualModules);
        List<String> expectedList = Arrays.asList(expectedModules.toArray(new String[0]));
        System.out.println("Expected Modules: " + expectedModules);
        Assert.assertEquals("Module list does not match!", actualModules, expectedList);
    }


}
