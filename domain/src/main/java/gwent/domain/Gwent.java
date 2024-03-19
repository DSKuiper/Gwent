package gwent.domain;

import java.util.ArrayList;

public class Gwent implements IGwent {

    private Board board;
    private ArrayList<Card> cards = new ArrayList<>();

    public Gwent() {
        this.board = new Board();
        for(int i = 0; i < board.numberOfCards("close"); i++ ) {
            cards.add(board.getCard(i));
        }
    }
    public void playCard(String cardID) {
        //TODO checks
        //TODO constructors
        //TODO play the card
    }

    @Override
    public Board getBoard() {
        return board;
    }

    @Override
    public int getNumberOfCards() {
        return board.numberOfCards("close");
    }
}
