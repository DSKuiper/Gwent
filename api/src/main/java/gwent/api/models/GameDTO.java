package gwent.api.models;


import gwent.domain.IGwent;

public class GameDTO {
    public PlayerDTO[] players;
    public CardDTO[] cardsOnFieldPlayer1;
    public CardDTO[] cardsOnFieldPlayer2;

    public GameDTO(IGwent gwent) {
        players = new PlayerDTO[2];
        players[0] = new PlayerDTO(gwent, 1);
        players[1] = new PlayerDTO(gwent, 2);

        cardsOnFieldPlayer1 = new CardDTO[gwent.getBoard().numberOfCards("close", 1)];
        for(int i = 0; i < gwent.getBoard().numberOfCards("close", 1); i++) {
            cardsOnFieldPlayer1[i] = new CardDTO(gwent.getBoard().getCard(i).getCardName(),
                    gwent.getBoard().getCard(i).getCardID());
        }
        cardsOnFieldPlayer2 = new CardDTO[gwent.getBoard().numberOfCards("close", 2)];
        for(int i = 0; i < gwent.getBoard().numberOfCards("close", 1); i++) {
            cardsOnFieldPlayer2[i] = new CardDTO(gwent.getBoard().getCard(i).getCardName(),
                    gwent.getBoard().getCard(i).getCardID());
        }
    }
};
