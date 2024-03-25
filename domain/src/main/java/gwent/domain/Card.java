package gwent.domain;

import static java.util.UUID.randomUUID;

public class Card {
    protected String cardID;
    protected String cardName;
    protected int cardValue;

    protected String range;

    public Card(String cardName, int value, String range) {
        this.cardName = cardName;
        this.cardID = randomUUID().toString();
        this.cardValue = value;
        this.range = range;
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

    public String getRange() {
        return range;
    }
}
