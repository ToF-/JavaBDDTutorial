package bowling;

public class BowlingScorer {
    private int score;

    public BowlingScorer() {
        int score = 0;
    }
    public int score() {
        return score;
    }

    public void addThrow(int pins) {
        score += pins;
    }
}
