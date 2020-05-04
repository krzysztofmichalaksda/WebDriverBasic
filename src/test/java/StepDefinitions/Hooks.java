package StepDefinitions;

import Utils.Chrome;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp()
    {
        Chrome.start();
        System.out.println("Set Up environment");
    }

    @After
    public void tearDown()
    {
        Chrome.end();
        System.out.println("Tear Down environment");
    }
}