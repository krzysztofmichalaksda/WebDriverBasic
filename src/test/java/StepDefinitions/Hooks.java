package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp()
    {
        System.out.println("Set Up environment");
    }

    @After
    public void tearDown()
    {
        System.out.println("Tear Down environment");
    }
}