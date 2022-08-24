package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SampleSD {

    @Given("Login page should be opened")
    public void login_page_should_be_opened() {
        System.out.println("Login page should be opened");
    }
    @When("I enter correct username and correct password")
    public void i_enter_correct_username_and_correct_password() {
        System.out.println("I enter correct username and correct password");
    }
    @When("I Click on login button")
    public void i_click_on_login_button() {
        System.out.println("I Click on login button");
    }
    @Then("I should land on home page")
    public void i_should_land_on_home_page() {
        System.out.println("I should land on home page");
    }
}
