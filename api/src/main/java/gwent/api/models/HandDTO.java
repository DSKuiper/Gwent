package gwent.api.models;

import gwent.domain.IGwent;
import gwent.domain.Player;

public class HandDTO {
    public CardDTO[] cards;

    public HandDTO(IGwent gwent, int player) {
        if(player == 1) {
            cards = new CardDTO[gwent.getPlayer1().getHand().numberOfCards()];
            for(int i = 0; i < gwent.getPlayer1().getHand().numberOfCards(); i++) {
                cards[i] = new CardDTO(gwent.getPlayer1().getHand().getCard(i).getCardName(),
                        gwent.getPlayer1().getHand().getCard(i).getCardID());
            }
        } else {
            cards = new CardDTO[gwent.getPlayer2().getHand().numberOfCards()];
            for(int i = 0; i < gwent.getPlayer2().getHand().numberOfCards(); i++) {
                cards[i] = new CardDTO(gwent.getPlayer2().getHand().getCard(i).getCardName(),
                        gwent.getPlayer2().getHand().getCard(i).getCardID());
            }
        }
    }
}
