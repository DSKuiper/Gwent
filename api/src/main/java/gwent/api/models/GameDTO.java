package gwent.api.models;


import gwent.domain.IGwent;

public class GameDTO {
    public PlayerDTO[] players;
    public CardDTO[] cardsOnField;

    public GameDTO(IGwent gwent) {
        players = new PlayerDTO[2];
        players[0] = new PlayerDTO(gwent, 1);
        players[1] = new PlayerDTO(gwent, 2);

        cardsOnField = new CardDTO[gwent.getBoard().numberOfCards("close")];
        for(int i = 0; i < gwent.getBoard().numberOfCards("close"); i++) {
            cardsOnField[i] = new CardDTO(gwent.getBoard().getCard(i).getCardName(), gwent.getBoard().getCard(i).getCardID());
        }
    }
};
