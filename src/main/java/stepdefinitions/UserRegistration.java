package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class UserRegistration {

    @Given("I am on user registration page")
    public void i_am_on_user_registration_page() {
        System.out.println("I am on user registration page");
    }

    @When("I enter below Data")
    public void i_enter_below_data(DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.


        List<List<String>> data = dataTable.asLists();

        System.out.println("first name="+ data.get(0).get(0));
        System.out.println("last name="+ data.get(0).get(1));
        System.out.println("email="+ data.get(0).get(2));
        System.out.println("phone="+ data.get(0).get(3));

    }
    @When("I click on submit")
    public void i_click_on_submit() {
        System.out.println("I click on submit");
    }
    @Then("user should be added")
    public void user_should_be_added() {
        System.out.println("user should be added");
    }

    @Given("I am on user subscription page")
    public void iAmOnUserSubscriptionPage() {
        System.out.println("I am on user subscription page");
    }

   @And("I click on subscribe")
    public void iClickOnSubscribe() {
        System.out.println("I click on subscribe");
    }

    @Then("user should be subscribed")
    public void userShouldBeSubscribed() {
        System.out.println("user should be subscribed");
    }

    /*@When("I enter <name> , <contact> , <email>")
    public void iEnterNameContactEmail() {
    }*/


    @When("^I enter (.+) , (.+) , (.+)$")
    public void i_enter_(String name, String contact, String email)  {
        System.out.println("name="+name);
        System.out.println("contact="+contact);
        System.out.println("email="+email);

    }

}
