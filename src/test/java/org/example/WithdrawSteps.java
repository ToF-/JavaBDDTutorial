package org.example;

import account.Account;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class WithdrawSteps {
    private Account myAccount;

    public WithdrawSteps() {
        myAccount = new Account();
    }
    @Given("I have {int} in my account")
    public void i_have_in_my_account(Integer balance) {
        myAccount.setBalance(balance);
    }
    @When("I chose to withdraw the fixed amount of {int}")
    public void i_chose_to_withdraw_the_fixed_amount_of(Integer amount) {
        myAccount.withdrawFixedAmount(amount);
    }
    @Then("I should receive {int} cash")
    public void i_should_receive_cash(Integer cash) {
    }
    @Then("I should see an error message")
    public void i_should_see_an_error_message() {
    }
    @Then("the balance of my account should be {int}")
    public void the_balance_of_my_account_should_be(Integer balance) {
        assertEquals(balance, myAccount.balance());
    }

}
