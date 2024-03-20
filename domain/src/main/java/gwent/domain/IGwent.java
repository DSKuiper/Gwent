package gwent.domain;

public interface IGwent {

    /**
     * Method for playing a card.
     *
     * @param cardID unique ID of the card being played
     */
    void playCard(String cardID);

    Board getBoard();

    int getNumberOfCards();

    Player getPlayer1();

    Player getPlayer2();
}
