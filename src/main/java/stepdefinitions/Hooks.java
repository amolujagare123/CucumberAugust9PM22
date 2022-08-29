package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before ("@valid")
    public void beforeScenario()
    {
        System.out.println("********* beforeScenario *********");
    }

    @After ("@valid")
    public void afterScenario()
    {
        System.out.println("********* afterScenario *********");
    }


    @Before ("@userRegistration")
    public void beforeScenarioUserReg()
    {
        System.out.println("********* beforeScenarioUserReg *********");
    }

    @After ("@userRegistration")
    public void afterScenarioUserReg()
    {
        System.out.println("********* afterScenarioUserReg *********");
    }
}
