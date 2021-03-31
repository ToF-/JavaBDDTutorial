package org.example;

import calculator.Calculator;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static junit.framework.TestCase.assertEquals;

public class CalculatorSteps {
    private Calculator calculator;

    @Before
    public void setup() {
        calculator = new Calculator();
    }
    @Given("The result is currently {int}")
    public void the_result_is_currently(Integer number) {
        assertEquals(number, calculator.result());
    }
    @When("I enter {int}")
    public void i_enter(Integer number) {
        calculator.enter(number);
    }
    @When("I enter the sign {string}")
    public void i_enter_the_sign(String string) {
        calculator.operation(string);
    }
    @Then("The result is {int}")
    public void the_result_is(Integer number) {
        assertEquals(number, calculator.result());
    }
}
