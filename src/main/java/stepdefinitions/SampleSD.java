package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleSD {
    WebDriver driver;
  @Given("Login page should be opened")
    public void login_page_should_be_opened() {
      System.out.println("Login page should be opened");

      WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://stock.amolujagare.com/");

    }


    @When("I enter correct username and correct password")
    public void i_enter_correct_username_and_correct_password() {
        System.out.println("I enter correct username and correct password");

        driver.findElement(By.id("login-username")).sendKeys("admin");
        driver.findElement(By.id("login-password")).sendKeys("admin");

    }
    @When("I Click on login button")
    public void i_click_on_login_button() {
        System.out.println("I Click on login button");

        driver.findElement(By.name("submit")).click();
    }

    @Then("I should land on home page")
    public void i_should_land_on_home_page() {
        System.out.println("I should land on home page");

        String expected  ="https://stock.amolujagare.com/dashboard.php";
        String actual = driver.getCurrentUrl();

        Assert.assertEquals("This is not a dashboard",expected,actual);
    }


}
