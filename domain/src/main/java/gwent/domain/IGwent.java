package gwent.domain;

public interface IGwent {

    /**
     * Method for playing a card.
     *
     * @param cardID unique ID of the card being played
     */
    void playCard(String cardID, int player);

    Board getBoard();

    int getNumberOfCards(int player);

    Player getPlayer1();

    Player getPlayer2();

    int getScore(String range, int player);

    int getTotalScore(int player);
}
