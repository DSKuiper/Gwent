package gwent.domain;

import static java.util.UUID.randomUUID;

public abstract class Card {
    protected String cardID;
    protected String cardName;
    protected int cardValue;

    public Card(String cardName, int value /*, Board range*/) {
        this.cardName = cardName;
        this.cardID = randomUUID().toString();
        this.cardValue = value;
    }

    public String getCardID() {
        return cardID;
    }

    public String getCardName() {
        return cardName;
    }

    protected void play(Board board, Hand hand, int player) {
        board.addCard(this, player);
        hand.removeCard(this);
    }
}
