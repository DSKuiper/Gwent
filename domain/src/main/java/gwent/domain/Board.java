package gwent.domain;

import java.util.ArrayList;

public class Board {
    private Hand hand;

    private ArrayList<Card> closeRangePlayerOne = new ArrayList<>();
    public Board() {
        this.hand = new Hand();
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

    public Hand getHand() {
        return hand;
    }
}
