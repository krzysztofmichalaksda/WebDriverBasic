package StepDefinitions;

import Utils.Chrome;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp()
    {
        Chrome.start();
        System.out.println("Set up environment");
    }

    @After
    public void tearDown()
    {
        Chrome.end();
        System.out.println("Tear down environment");
    }
}