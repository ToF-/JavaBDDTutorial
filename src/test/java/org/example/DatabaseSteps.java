package org.example;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.AfterAll;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DatabaseSteps {
    private Connection connection;
    private ResultSet resultSet;

    @Given("^I am connected with the database$")
    public void i_am_connected_with_the_database() throws Throwable {
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/lags","tof","poddema");
        }
        catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
    }
    @When("I search an order with id {string}")
    public void i_search_an_order_with_id(String id) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM ORDERS WHERE ID = ?");
        preparedStatement.setString(1, id);
        resultSet = preparedStatement.executeQuery();
    }

    @When("I search for all orders")
    public void i_search_for_all_orders() throws SQLException {
        Statement statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM ORDERS ORDER BY ID");
    }
    @Then("I should see the result")
    public void i_should_see_the_result(io.cucumber.datatable.DataTable expectedDataTable) throws SQLException {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        List<List<String>> resultAsList= new ArrayList<List<String>>();
        resultAsList.add(Arrays.asList("id", "start", "duration", "price"));

        while ( resultSet.next() ) {
            resultAsList.add(Arrays.asList(
                    resultSet.getString("id"),
                    resultSet.getDate("start").toString(),
                    Integer.toString(resultSet.getInt("duration")),
                    Double.toString(resultSet.getDouble("price"))));
        }
        DataTable resultAsDataTable = DataTable.create(resultAsList);
        resultAsDataTable.diff(expectedDataTable);
    }
    @AfterAll
    public void the_connection_is_closed() throws SQLException {
        connection.close();
    }
}
