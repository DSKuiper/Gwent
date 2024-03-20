package gwent.domain;

import static java.util.UUID.randomUUID;

public abstract class Card {
    protected String cardID;
    protected String cardName;

    public Card(String cardName /*, Board range*/) {
        this.cardName = cardName;
        this.cardID = randomUUID().toString();
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
