package gwent.domain;

import java.util.ArrayList;

import static java.util.Collections.shuffle;

public class Hand {
    private ArrayList<Card> hand = new ArrayList<>();

    public Hand(DeckBuilder deck) {
        ArrayList<Card> tempDeck = new ArrayList<>();
        tempDeck.addAll(deck.unitCards);
        tempDeck.addAll(deck.specialCards);
        shuffle(tempDeck);
        for(int i = 0; i < 10; i++) {
            hand.add(tempDeck.get(i));
        }
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
