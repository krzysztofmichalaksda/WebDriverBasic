package StepDefinitions;

import Utils.Chrome;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class MainStepDefinitions {

    By googleLogoSelector = By.id("hplogo");

    @When("a user opens {string} page")
    public void aUserOpensPage(String url) {
        Chrome.driver.get(url);
    }

    @Then("the user should see Google logo")
    public void theUserShouldSeeLogo() {
        boolean isLogoDisplayed = Chrome.driver.findElement(googleLogoSelector).isDisplayed();

        Assert.assertTrue(
            "Google logo is not displayed",
            isLogoDisplayed
        );
    }
}
