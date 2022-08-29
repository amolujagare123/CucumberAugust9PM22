package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features"
        ,glue = "stepdefinitions"
//,tags = "@loginReal"
        , dryRun = false

        ,plugin = {"pretty","html:target/Reports/cucumber.html"}

)
public class TestRunner {
}
