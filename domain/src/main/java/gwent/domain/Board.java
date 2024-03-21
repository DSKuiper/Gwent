package gwent.domain;

import java.util.ArrayList;

public class Board {
    //private Player player1;
    //private Player player2;

    private ArrayList<Card> closeRangePlayer1 = new ArrayList<>();

    private ArrayList<Card> closeRangePlayer2 = new ArrayList<>();
    public Board(Player player1, Player player2) {
        //this.player1 = player1;
        //this.player2 = player2;
    }
    public Card getCard( /*String range,*/ int index, int player) {
        if (player == 1) {
            return closeRangePlayer1.get(index);
        } else {
            return closeRangePlayer2.get(index);
        }
    }

    public int numberOfCards(String range, int player) {
        if(player == 1) {
            return closeRangePlayer1.size();
        } else {
            return closeRangePlayer2.size();
        }
    }
    public void addCard(Card playedCard, int player) {
        if(player == 1) {
            closeRangePlayer1.add(playedCard);
        } else {
            closeRangePlayer2.add(playedCard);
        }
    }

    public ArrayList<Card> getCloseRangePlayer1() {
        return closeRangePlayer1;
    }

    public ArrayList<Card> getCloseRangePlayer2() {
        return closeRangePlayer2;
    }
}
