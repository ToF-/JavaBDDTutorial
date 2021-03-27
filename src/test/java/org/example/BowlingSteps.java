package org.example;

import bowling.BowlingScorer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class BowlingSteps {
    private bowling.BowlingScorer scorer;

    public BowlingSteps() {
        scorer = new BowlingScorer();
    }
    @Given("I have not thrown any ball yet")
    public void i_have_not_thrown_any_ball_yet() {
    }
    @Then("my score is {int}")
    public void my_score_is(int score) {
        assertEquals(score, scorer.score());
    }
    @When("I hit {int} pins")
    public void i_hit_pins(int pins) {
        scorer.addThrow(pins);
    }

}
