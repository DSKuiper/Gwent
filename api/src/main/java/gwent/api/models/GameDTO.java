package gwent.api.models;


import gwent.domain.IGwent;

public class GameDTO {
    public CardDTO[] cards;
    public GameDTO(IGwent gwent) {
        cards = new CardDTO[gwent.getBoard().numberOfCards("close")];
        for(int i = 0; i < gwent.getBoard().numberOfCards("close"); i++) {
            cards[i] = new CardDTO(gwent.getBoard().getCard(i).getCardName());
        }
    }
};
