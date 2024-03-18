package nl.sogyo.domain;

import java.util.ArrayList;

public class Gwent implements IGwent {

    private Board board;
    private ArrayList<Card> cards = new ArrayList<>();
    public Gwent() {
        this.board = new Board();
        this.cards.add(new UnitCard("ciri"));
        cards.add(new UnitCard("Redenian-Foot-Soldier"));
    }
    public void playCard(String cardID) {
        //TODO checks
        //TODO constructors
        //TODO play the card
    }
}
