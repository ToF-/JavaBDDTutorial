package pokerhand;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.datatable.DataTable;

public class pokerhandSteps {
    @Given("{string} can make this hand")
    public void can_make_this_hand(String player, DataTable dataTable) {
    }
    @Then("{string} is the winner")
    public void is_the_winner(String player) {
    }
}
