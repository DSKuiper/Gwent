package nl.sogyo.domain;

import java.util.ArrayList;

public class Board {
    private ArrayList<Card> closeRangePlayerOne = new ArrayList<>();

    public Card getCard(/*int player, String range,*/ int index) {
        return closeRangePlayerOne.get(index - 1);
    }

    public void addCard(Card playedCard) {
        closeRangePlayerOne.add(playedCard);
    }
}
