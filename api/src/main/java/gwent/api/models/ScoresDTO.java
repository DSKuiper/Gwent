package gwent.api.models;

import gwent.domain.IGwent;

public class ScoresDTO {
    public int scoreCloseRangePlayer1;
    public int scoreCloseRangePlayer2;

    public ScoresDTO(IGwent gwent) {
        scoreCloseRangePlayer1 = gwent.getScore("close", 1);
        scoreCloseRangePlayer2 = gwent.getScore("close", 2);
    }

    public int getScoreCloseRangePlayer1() {
        return scoreCloseRangePlayer1;
    }

    public void setScoreCloseRangePlayer1(int scoreCloseRangePlayer1) {
        this.scoreCloseRangePlayer1 = scoreCloseRangePlayer1;
    }

    public int getScoreCloseRangePlayer2() {
        return scoreCloseRangePlayer2;
    }

    public void setScoreCloseRangePlayer2(int scoreCloseRangePlayer2) {
        this.scoreCloseRangePlayer2 = scoreCloseRangePlayer2;
    }
}
