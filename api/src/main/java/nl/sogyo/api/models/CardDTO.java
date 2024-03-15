package nl.sogyo.api.models;

public class CardDTO {

    private String cardName;

    public CardDTO(String cardName) {
        this.cardName = cardName;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }
}
