package gwent.api.models;

import gwent.domain.IGwent;

public class BoardDTO {
    public CardDTO[] cardsOnFieldPlayer1;
    public CardDTO[] cardsOnFieldPlayer2;

    public BoardDTO(IGwent gwent) {
        cardsOnFieldPlayer1 = new CardDTO[gwent.getBoard().numberOfCards("close", 1)];
        for(int i = 0; i < gwent.getBoard().numberOfCards("close", 1); i++) {
            cardsOnFieldPlayer1[i] = new CardDTO(gwent.getBoard().getCard(i, 1).getCardName(),
                    gwent.getBoard().getCard(i, 1).getCardID());
        }
        cardsOnFieldPlayer2 = new CardDTO[gwent.getBoard().numberOfCards("close", 2)];
        for(int i = 0; i < gwent.getBoard().numberOfCards("close", 2); i++) {
            cardsOnFieldPlayer2[i] = new CardDTO(gwent.getBoard().getCard(i, 2).getCardName(),
                    gwent.getBoard().getCard(i, 2).getCardID());
        }
    }
}
