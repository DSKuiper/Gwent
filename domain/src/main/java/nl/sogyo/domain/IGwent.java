package nl.sogyo.domain;

public interface IGwent {

    /**
     * Method for playing a card.
     *
     * @param cardID unique ID of the card being played
     */
    void playCard(String cardID);
}
