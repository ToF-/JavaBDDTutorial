
package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Date;

public class subscriptionSteps {
    @Given("^That I subscribed on the date (.+)$")
    // public void that_I_subscribed_on_the_date(@Format("yyyy-MM-dd") Date dateSubscription) {
    public void that_I_subscribed_on_the_date(String dateSubscription) {
    }
    @When("Comes the {int}-{int}-{int}")
    public void comes_the(int year, int month, int day) {
    }
    @Then("My renewal fee is due")
    public void my_renewal_fee_is_due() {
        throw new io.cucumber.java.PendingException();
    }
}
