package gwent.domain;

import java.util.ArrayList;

public class Gwent implements IGwent {
    private Board board;
    private Player player1;
    private Player player2;
    private ArrayList<Card> closeRangePlayer1 = new ArrayList<>();
    private ArrayList<Card> closeRangePlayer2 = new ArrayList<>();

    public Gwent() {
        this.player1 = new Player(1);
        this.player2 = new Player(2);
        this.board = new Board(player1, player2);
        for(int i = 0; i < board.numberOfCards("close", 1); i++ ) {
            closeRangePlayer1.add(board.getCard(i));
        }
        for(int i = 0; i < board.numberOfCards("close", 2); i++ ) {
            closeRangePlayer2.add(board.getCard(i));
        }
    }

    public void playCard(String cardID, int player) {
        if(player == 1) {
            for(int i = 0; i < player1.hand.numberOfCards(); i++) {
                if(player1.hand.getCard(i).getCardID().equals(cardID)) {
                    player1.hand.getCard(i).play(board, player1.hand, player);
                }
            }
        } else {
            for(int i = 0; i < player2.hand.numberOfCards(); i++) {
                if(player2.hand.getCard(i).getCardID().equals(cardID)) {
                    player2.hand.getCard(i).play(board, player2.hand, player);
                }
            }
        }
    }

    @Override
    public Board getBoard() {
        return board;
    }

    @Override
    public int getNumberOfCards(int player) {
        return board.numberOfCards("close", player);
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }
}
