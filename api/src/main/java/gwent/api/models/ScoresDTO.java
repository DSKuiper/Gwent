package gwent.api.models;

import gwent.domain.IGwent;

public class ScoresDTO {
    public int totalScorePlayer1;
    public int totalScorePlayer2;
    public int scoreCloseRangePlayer1;
    public int scoreCloseRangePlayer2;
    public int scoreRangedPlayer1;
    public int scoreRangedPlayer2;
    public int scoreSiegePlayer1;
    public int scoreSiegePlayer2;

    public ScoresDTO(IGwent gwent) {
        totalScorePlayer1 = gwent.getTotalScore(1);
        totalScorePlayer2 = gwent.getTotalScore(2);
        scoreCloseRangePlayer1 = gwent.getScore("close", 1);
        scoreCloseRangePlayer2 = gwent.getScore("close", 2);
        scoreRangedPlayer1 = gwent.getScore("ranged", 1);
        scoreRangedPlayer2 = gwent.getScore("ranged", 2);
        scoreSiegePlayer1 = gwent.getScore("siege", 1);
        scoreSiegePlayer2 = gwent.getScore("siege", 2);
    }
}
