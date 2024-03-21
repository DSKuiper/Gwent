package gwent.api.models;

public class CardDTO {
    private String cardName;
    private String cardID;

    public CardDTO(String cardName, String cardID) {
        this.cardName = cardName;
        this.cardID = cardID;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getCardID() {
        return cardID;
    }

    public void setCardID(String cardID) {
        this.cardID = cardID;
    }
}
