package gwent.api.models;

import gwent.domain.IGwent;

public class ScoresDTO {
    public int totalScorePlayer1;
    public int totalScorePlayer2;
    public int scoreCloseRangePlayer1;
    public int scoreCloseRangePlayer2;

    public ScoresDTO(IGwent gwent) {
        totalScorePlayer1 = gwent.getTotalScore(1);
        totalScorePlayer2 = gwent.getTotalScore(2);
        scoreCloseRangePlayer1 = gwent.getScore("close", 1);
        scoreCloseRangePlayer2 = gwent.getScore("close", 2);
    }
}
