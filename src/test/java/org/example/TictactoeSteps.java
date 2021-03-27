package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.*;

import java.util.ArrayList;
import java.util.List;

public class TictactoeSteps {
    private List<List<String>> board;

    @Given("a board like this:")
    public void a_board_like_this(io.cucumber.datatable.DataTable table) {
        this.board = new ArrayList<List<String>>();
        List<List<String>> rows = table.asLists(String.class);
        for(List<String> row: rows) {
            this.board.add(new ArrayList<String>(row));
        }
    }
    @When("player x plays in row {int}, column {int}")
    public void player_x_plays_in_row_column(Integer row, Integer col) {
        board.get(row).set(col,"x");
    }
    @Then("the board should look like this:")
    public void the_board_should_look_like_this(io.cucumber.datatable.DataTable expectedTable) {
        expectedTable.diff(DataTable.create(board));
    }
}
