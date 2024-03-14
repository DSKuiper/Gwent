package nl.sogyo.api.models;

import java.util.ArrayList;

public class GameDTO {
    public ArrayList<CardDTO> cards = new ArrayList<>();
    public GameDTO() {
        CardDTO testCard = new CardDTO("GameStatusTest");
        this.cards.add(testCard);
    }
};
