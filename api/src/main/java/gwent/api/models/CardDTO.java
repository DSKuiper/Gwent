package gwent.api.models;

public class CardDTO {
    private String cardName;
    private String cardID;

    private String range;

    public CardDTO(String cardName, String cardID, String range) {
        this.cardName = cardName;
        this.cardID = cardID;
        this.range = range;
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
