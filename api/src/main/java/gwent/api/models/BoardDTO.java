package gwent.api.models;

import gwent.domain.IGwent;

public class BoardDTO {
    public CardDTO[] cardsOnFieldPlayer1;
    public CardDTO[] cardsOnFieldPlayer2;
    public CardDTO[] rangedPlayer1;
    public CardDTO[] rangedPlayer2;
    public CardDTO[] siegePlayer1;
    public CardDTO[] siegePlayer2;

    public BoardDTO(IGwent gwent) {
        cardsOnFieldPlayer1 = new CardDTO[gwent.getBoard().numberOfCards("close", 1)];
        for(int i = 0; i < gwent.getBoard().numberOfCards("close", 1); i++) {
            cardsOnFieldPlayer1[i] = new CardDTO(gwent.getBoard().getCard(i, 1, "close").getCardName(),
                    gwent.getBoard().getCard(i, 1, "close").getCardID(), "close");
        }
        cardsOnFieldPlayer2 = new CardDTO[gwent.getBoard().numberOfCards("close", 2)];
        for(int i = 0; i < gwent.getBoard().numberOfCards("close", 2); i++) {
            cardsOnFieldPlayer2[i] = new CardDTO(gwent.getBoard().getCard(i, 2, "close").getCardName(),
                    gwent.getBoard().getCard(i, 2, "close").getCardID(), "close");
        }

        rangedPlayer1 = new CardDTO[gwent.getBoard().numberOfCards("ranged", 1)];
        for(int i = 0; i < gwent.getBoard().numberOfCards("ranged", 1); i++) {
            rangedPlayer1[i] = new CardDTO(gwent.getBoard().getCard(i, 1, "close").getCardName(),
                    gwent.getBoard().getCard(i, 1, "close").getCardID(), "ranged");
        }

        rangedPlayer2 = new CardDTO[gwent.getBoard().numberOfCards("ranged", 2)];
        for(int i = 0; i < gwent.getBoard().numberOfCards("ranged", 2); i++) {
            rangedPlayer2[i] = new CardDTO(gwent.getBoard().getCard(i, 2, "close").getCardName(),
                    gwent.getBoard().getCard(i, 2, "close").getCardID(), "ranged");
        }

        siegePlayer1 = new CardDTO[gwent.getBoard().numberOfCards("siege", 1)];
        for(int i = 0; i < gwent.getBoard().numberOfCards("siege", 1); i++) {
            siegePlayer1[i] = new CardDTO(gwent.getBoard().getCard(i, 1, "close").getCardName(),
                    gwent.getBoard().getCard(i, 1, "close").getCardID(), "siege");
        }

        siegePlayer2 = new CardDTO[gwent.getBoard().numberOfCards("siege", 2)];
        for(int i = 0; i < gwent.getBoard().numberOfCards("siege", 2); i++) {
            siegePlayer2[i] = new CardDTO(gwent.getBoard().getCard(i, 2, "close").getCardName(),
                    gwent.getBoard().getCard(i, 2, "close").getCardID(), "siege");
        }
    }
}
