package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefinition {
    @Given("^user is on NetBanking landing page$")
    public void user_is_on_netBanking_landing_page() throws Throwable {
        //code to land on homepage
        System.out.println("landed on homepage");
    }

    @When("^user login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_login_into_application_with_something_and_something(String strArg1, String strArg2) throws Throwable {
        //code to login to the page
        System.out.println(strArg1);
        System.out.println(strArg2);
        System.out.println("login successful");
    }

    @Then("^home page is populated$")
    public void home_page_is_populated() throws Throwable {
        //validating the homepage
        System.out.println("homepage validated");
    }

    @And("^all displayed cards are \"([^\"]*)\"$")
    public void all_displayed_cards_are_something(String strArg1) throws Throwable {
        //validating cards
        System.out.println(strArg1);
        System.out.println("cards validated");
    }
}
