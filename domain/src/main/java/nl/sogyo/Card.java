package nl.sogyo;

public abstract class Card {
    protected String cardID;
    protected String cardName;
    protected Board playField;


    public String getCardID() {
        return cardID;
    }

    public String getCardName() {
        return cardName;
    }

    protected void play() {
        playField.addCard(this);
    }
}
