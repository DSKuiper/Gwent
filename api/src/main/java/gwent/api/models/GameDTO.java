package gwent.api.models;


import gwent.domain.IGwent;

public class GameDTO {
    public CardDTO[] cardsInHand;
    public CardDTO[] cardsOnField;

    public GameDTO(IGwent gwent) {
        cardsInHand = new CardDTO[gwent.getHand().numberOfCards()];
        for(int i = 0; i < gwent.getHand().numberOfCards(); i++) {
            cardsInHand[i] = new CardDTO(gwent.getHand().getCard(i).getCardName(), gwent.getHand().getCard(i).getCardID());
        }

        cardsOnField = new CardDTO[gwent.getBoard().numberOfCards("close")];
        for(int i = 0; i < gwent.getBoard().numberOfCards("close"); i++) {
            cardsOnField[i] = new CardDTO(gwent.getBoard().getCard(i).getCardName(), gwent.getBoard().getCard(i).getCardID());
        }
    }
};
