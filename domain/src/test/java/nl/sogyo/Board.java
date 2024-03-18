package nl.sogyo;

import java.util.ArrayList;

public class Board {
    private ArrayList<Card> closeRangePlayerOne;

    public Card getCard(/*int player, String range,*/ int index) {
        return closeRangePlayerOne.get(index);
    }
}
