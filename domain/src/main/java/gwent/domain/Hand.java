package gwent.domain;

import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> hand = new ArrayList<>();

    public Hand() {
        hand.add(new Card("Ciri-1", 15));
        hand.add(new Card("Redenian-Foot-Soldier-1", 1));
        hand.add(new Card("Ciri-2", 15));
        hand.add(new Card("Redenian-Foot-Soldier-1", 1));
        hand.add(new Card("Ciri-1", 15));
        hand.add(new Card("Redenian-Foot-Soldier-1", 1));
    }

    public Card getCard(/*int player, String range,*/ int index) {
        return hand.get(index);
    }

    public int numberOfCards() {
        return hand.size();
    }

    public void addCard(Card card) {
        hand.add(card);
    }

    public void removeCard(Card card) {
        hand.remove(card);
    }
}
