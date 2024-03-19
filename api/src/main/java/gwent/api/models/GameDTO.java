package gwent.api.models;


import gwent.domain.IGwent;

public class GameDTO {
    public CardDTO[] cards;
    public GameDTO(IGwent gwent) {
        cards = new CardDTO[gwent.getHand().numberOfCards()];
        for(int i = 0; i < gwent.getHand().numberOfCards(); i++) {
            cards[i] = new CardDTO(gwent.getHand().getCard(i).getCardName(), gwent.getHand().getCard(i).getCardID());
        }
    }
};
