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
    public void user_is_on_netbanking_landing_page() throws Throwable {
        //code to land on homepage
        System.out.println("landed on homepage");
    }

    @When("^user login into application with username and password$")
    public void user_login_into_application_with_username_and_password() throws Throwable {
        //code to login with username and password
        System.out.println("login success");
    }

    @Then("^home page is populated$")
    public void home_page_is_populated() throws Throwable {
        //validating the homepage
        System.out.println("homepage validated");
    }

    @And("^all the cards are displayed$")
    public void all_the_cards_are_displayed() throws Throwable {
        //validating cards
        System.out.println("cards validated");
    }
}
