package org.example;

import checkout.Checkout;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class CheckoutSteps {
    private int bananaprice;
    private Checkout checkout;

    @Given("The price of a {string} is {int}")
    public void the_price_of_a_is(String string, Integer price) {
        bananaprice = price;
    }
    @When("I checkout {int} {string}")
    public void i_checkout(Integer itemcount, String item) {
        checkout = new Checkout();
        checkout.add(itemcount, bananaprice);
    }
    @Then("The total price should be {int}")
    public void the_total_price_should_be(int total) {
        assertEquals(total, checkout.total());
    }
}
