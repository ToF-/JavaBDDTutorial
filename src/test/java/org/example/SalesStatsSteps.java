package org.example;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class SalesStatsSteps {
    private List<List<String>> stats;

    @Given("I have this list of orders")
    public void i_have_this_list_of_orders(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
    }
    @When("I ask for possible income per customer")
    public void i_ask_for_possible_income_per_customer() {
        stats = SalesStats.getStats();
    }
    @Then("I get the following stats")
    public void i_get_the_following_stats(io.cucumber.datatable.DataTable expectedTable) {
        exepectedTable.diff(DataTable.create(stats));
    }
}
