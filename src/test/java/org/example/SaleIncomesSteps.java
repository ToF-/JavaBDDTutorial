package org.example;

import LAGS.IncomeCalculator;
import LAGS.Order;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class SaleIncomesSteps {
    private String customer;
    private Integer year;
    private Integer month;
    private Integer day;
    private Integer duration;
    private IncomeCalculator incomeCalculator;
    private Integer price;

    @Before
    public void setup() {
        incomeCalculator = new IncomeCalculator();
    }
    @Given("a new order for a customer {string}")
    public void a_new_order_for_a_customer(String customer) {
        this.customer = customer;
    }
    @Given("the following orders")
    public void the_following_orders() {
    }
    @Given("a start date at {int}-{int}-{int}")
    public void a_start_date_at(Integer year, Integer month, Integer day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Given("a duration of {int} days")
    public void a_duration_of_days(Integer duration) {
        this.duration = duration;
    }

    @Given("a price of {int}")
    public void a_price_of(Integer price) {
        this.price = price;
    }

    @Given("an order with {string} {int}-{int}-{int} {int} {int}")
    public void an_order_with(String customer, Integer year, Integer month, Integer day, Integer duration, Integer price) {
        Order order = new Order(customer, year, month, day, duration, price);
        this.incomeCalculator.addOrder(order);
    }

    @When("I enter this order")
    public void i_enter_this_order() {
        Order order = new Order(customer, year, month, day, duration, price);
        this.incomeCalculator.addOrder(order);
    }
    @When("I enter these orders")
    public void i_enter_these_orders() {
    }

    @Then("the maximum income is {int}")
    public void the_maximum_income_is(Integer income) {
        assertEquals(income, incomeCalculator.getMaximumIncome());
    }
}
