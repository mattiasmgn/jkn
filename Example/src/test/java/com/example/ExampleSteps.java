package com.example;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.assertEquals;
/**
 * Created by mm on 06/12/16.
 */
public class ExampleSteps {
    Example test;
    String r;
    @Given("^I am officiating a FizzBuzz game$")
    public void I_am_officiating_a_FizzBuzz_game() throws Throwable {
        // Express the Regexp above with the code you wish you had
        test = new Example();
    }

    @When("^the number (\\d+) is played$")
    public void the_number_is_played(int arg1) throws Throwable {
        // Express the Regexp above with the code you wish you had
        r=test.checkPlay(arg1);
    }

    @Then("^I should be told the correct answer is \"([^\"]*)\"$")
    public void I_should_be_told_the_correct_answer_is(String arg1) throws Throwable {
        // Express the Regexp above with the code you wish you had
        assertEquals(r, arg1);
    }
}
