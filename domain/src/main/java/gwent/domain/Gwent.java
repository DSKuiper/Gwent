package gwent.domain;

import java.util.ArrayList;

public class Gwent implements IGwent {
    private Board board;
    private Player player1;
    private Player player2;
    private CardBank bank;

    public Gwent() {
        this.bank = new CardBank();
        this.player1 = new Player(1, bank);
        this.player2 = new Player(2, bank);
        this.board = new Board();
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
    public int getNumberOfCards(String range, int player) {
        return board.numberOfCards(range, player);
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public int getScore(String range, int player) {
        return board.getScore(range, player);
    }

    public int getTotalScore(int player) {
        return board.getScore("close", player) +
                board.getScore("ranged", player) +
                board.getScore("siege", player);
    }
}
