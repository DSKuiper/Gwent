package gwent.domain;

public abstract class Card {
    protected String cardID;
    protected String cardName;

    public Card(String cardName /*, Board range*/) {
        this.cardName = cardName;
        //this.playField = range;
    }

    public String getCardID() {
        return cardID;
    }

    public String getCardName() {
        return cardName;
    }

    protected void play(Board board, Hand hand) {
        board.addCard(this);
        hand.removeCard(this);
    }
}
