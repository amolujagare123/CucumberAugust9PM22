package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MyProjectSD {

   /* @Given("Login on billing page should be opened")
    public void loginOnBillingPageShouldBeOpened() {

    }

    @When("I enter correct username and correct password on billing page")
    public void iEnterCorrectUsernameAndCorrectPasswordOnBillingPage() {

    }

    @And("I Click on login button on billing page")
    public void iClickOnLoginButtonOnBillingPage() {

    }

    @Then("I should land on the dashboard")
    public void iShouldLandOnTheDashboard() {
    }*/

    @Given("^Login on billing page should be opened$")
    public void login_on_billing_page_should_be_opened() throws Throwable {
        System.out.println("Login on billing page should be opened");
    }

    @When("^I enter correct username and correct password on billing page$")
    public void i_enter_correct_username_and_correct_password_on_billing_page() throws Throwable {
        System.out.println("I enter correct username and correct password on billing page");
    }

    @Then("^I should land on the dashboard$")
    public void i_should_land_on_the_dashboard() throws Throwable {
        System.out.println("I should land on the dashboard");
    }

    @And("^I Click on login button on billing page$")
    public void i_click_on_login_button_on_billing_page() throws Throwable {
        System.out.println("I Click on login button on billing page");
    }

    @When("I enter incorrect username and incorrect password on billing page")
    public void iEnterIncorrectUsernameAndIncorrectPasswordOnBillingPage() {
        System.out.println("I enter incorrect username and incorrect password on billing page");
    }

    @Then("I should get error")
    public void iShouldGetError() {
        System.out.println("I should get error");
        Assert.assertEquals("This is wrong message",true,false);
    }

    @When("I enter blank username and blank password on billing page")
    public void iEnterBlankUsernameAndBlankPasswordOnBillingPage() {
        System.out.println("I enter blank username and blank password on billing page");
    }

    @Then("I should get another error")
    public void iShouldGetAnotherError() {
        System.out.println("I should get another error");
    }

    @When("I enter {string} as username and {string} as password")
    public void iEnterAsUsernameAndAsPassword(String username, String password) {

        System.out.println("username="+username);
        System.out.println("password="+password);
    }

    @Given("Open the browser")
    public void openTheBrowser() {
        System.out.println("========= >> Open the browser  << =========");
    }

    @And("maximize it")
    public void maximizeIt() {
        System.out.println("========= >> maximize it  << =========");
    }

   /* @When("I enter {string} as username and {string} as password")
    public void i_enter_as_username_and_as_password(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }*/

   /*

   @When("^I enter \"([^\"]*)\" as username and \"([^\"]*)\" as password$")
    public void i_enter_something_as_username_and_something_as_password(String username, String password)  {
        System.out.println("username="+username);
        System.out.println("password="+password);
    }

    */

}
