package gwent.domain;

import java.util.ArrayList;

public class Board {
    private ArrayList<Card> closeRangePlayerOne = new ArrayList<>();

    public Board() {
        closeRangePlayerOne.add(new UnitCard("Ciri"));
        closeRangePlayerOne.add(new UnitCard("Redenian-Foot-Soldier"));
    }
    public Card getCard(/*int player, String range,*/ int index) {
        return closeRangePlayerOne.get(index);
    }

    public int numberOfCards(String range) {
        return closeRangePlayerOne.size();
    }

    public void addCard(Card playedCard) {
        closeRangePlayerOne.add(playedCard);
    }
}
