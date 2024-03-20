package gwent.domain;

import java.util.ArrayList;

public class Board {
    private Player player1;
    private Player player2;

    private ArrayList<Card> closeRangePlayerOne = new ArrayList<>();
    public Board(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
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
