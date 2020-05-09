package StepDefinitions;

import Utils.Chrome;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class MainStepDefinitions {

    By googleLogoSelector = By.id("hplogo");
    By searchInputSelector = By.name("q");
    By searchButtonSelectors = By.name("btnK");
    By suggestionsSelectors = By.className("sbl1");

    @When("a user opens {string} page")
    public void aUserOpensPage(String url) {
        Chrome.driver.get(url);
    }

    @When("the user type {string} in input box")
    public void userTypeInSearchInput(String text)
    {
        Chrome.driver.findElement(searchInputSelector).sendKeys(text);
    }

    @Then("the user should see Google logo")
    public void theUserShouldSeeLogo() {
        boolean isLogoDisplayed = Chrome.driver.findElement(googleLogoSelector).isDisplayed();

        Assert.assertTrue(
            "Google logo is not displayed",
            isLogoDisplayed
        );
    }

    @Then("the user should see search input")
    public void theUserShouldSearchInput() {
        boolean isSearchDisplayed = Chrome.driver.findElement(searchInputSelector).isDisplayed();

        Assert.assertTrue(
                "Google search input is not displayed",
                isSearchDisplayed
        );
    }

    @Then("the user should see search button")
    public void theUserShouldSearchButton() {
        List<WebElement> searchButtonElements = Chrome.driver.findElements(searchButtonSelectors);
        boolean isSearchButtonDisplayed = searchButtonElements.get(1).isDisplayed();
        Assert.assertTrue(
                "Google search button is not displayed",
                isSearchButtonDisplayed
        );
    }

    @Then("the user should see {string} as {int} suggestion")
    public void checkSuggestionText(String expectedSuggestionText, int index)
    {
        WebDriverWait wait = new WebDriverWait(Chrome.driver, 10);
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(suggestionsSelectors, index));

        List<WebElement> suggestionElements  = Chrome.driver.findElements(suggestionsSelectors);
        String actualSuggestionText = suggestionElements.get(index).getText();
        Assert.assertEquals(
                expectedSuggestionText,
                actualSuggestionText
        );
    }
}
