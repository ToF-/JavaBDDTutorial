package org.example;

import checkout.Checkout;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.HashMap;

import static org.junit.Assert.*;

public class CheckoutSteps {
    private final HashMap<String,Integer> items;
    private int bananaprice;
    private Checkout checkout;

    public CheckoutSteps() {
        checkout = new Checkout();
        items = new HashMap<String, Integer>();
    }

    @Given("The price of a {string} is {int}")
    public void the_price_of_a_is(String item, Integer price) {
        items.put(item, price);
    }

    @When("I checkout {int} {string}")
    public void i_checkout(Integer itemCount, String item) {
        int itemPrice = items.get(item);
        checkout.add(itemCount, itemPrice);
    }

    @Then("The total price should be {int}")
    public void the_total_price_should_be(int total) {
        assertEquals(total, checkout.total());
    }
}
