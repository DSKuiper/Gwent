package gwent.domain;

import java.util.ArrayList;

public class Gwent implements IGwent {
    private Board board;
    private Player player1;
    private Player player2;
    private ArrayList<Card> cards = new ArrayList<>();

    public Gwent() {
        this.player1 = new Player(1);
        this.player2 = new Player(2);
        this.board = new Board(player1, player2);
        for(int i = 0; i < board.numberOfCards("close"); i++ ) {
            cards.add(board.getCard(i));
        }
    }

    public void playCard(String cardID) {
        for(int i = 0; i < player1.hand.numberOfCards(); i++) {
            if(player1.hand.getCard(i).getCardID().equals(cardID)) {
                player1.hand.getCard(i).play(board, player1.hand);
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

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }
}
