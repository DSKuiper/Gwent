package nl.sogyo.api.models;

import java.util.ArrayList;
import java.util.List;

public class GameDTO {
    public CardDTO[] cards;
    public GameDTO() {
        cards = new CardDTO[3];
        cards[0] = new CardDTO("Ciri");
        cards[1] = new CardDTO("Yarpen-Zigrin");
        cards[2] = new CardDTO("Redenian-Foot-Soldier");
    }
};
