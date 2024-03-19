package gwent.domain;

import java.util.ArrayList;

public class Gwent implements IGwent {

    private Board board;

    private Hand hand;
    private ArrayList<Card> cards = new ArrayList<>();

    public Gwent() {
        this.board = new Board();
        for(int i = 0; i < board.numberOfCards("close"); i++ ) {
            cards.add(board.getCard(i));
        }
        this.hand = board.getHand();
        for(int i = 0; i < hand.numberOfCards(); i++ ) {
            cards.add(hand.getCard(i));
        }
    }

    public void playCard(String cardID) {
        for(int i = 0; i < hand.numberOfCards(); i++) {
            if(hand.getCard(i).getCardName().equals(cardID)) {
                hand.getCard(i).play(board, hand);
            }
        }
    }

    @Override
    public Board getBoard() {
        return board;
    }

    @Override
    public int getNumberOfCards() {
        return board.numberOfCards("close");
    }

    @Override
    public Hand getHand() {
        return hand;
    }
}
