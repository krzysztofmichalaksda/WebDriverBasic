package StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainStepDefinitions {
    @When("a user opens {string} page")
    public void aUserOpensPage(String url) {
        System.out.println("Open \"" + url + "\" page");
    }

    @Then("the user should see {string} course")
    public void theUserShouldSeeCourse(String arg0) {
        System.out.println("Check if course \"" + arg0 + "\" is displayed");
    }
}
