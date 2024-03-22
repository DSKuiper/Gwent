package gwent.domain;

import java.util.ArrayList;

import static java.util.Collections.shuffle;

public class DeckBuilder {
    protected ArrayList<Card> unitCards = new ArrayList<>();
    protected ArrayList<Card> specialCards = new ArrayList<>();

    public DeckBuilder(CardBank bank) {
        ArrayList<Card> tempUnitCards = new ArrayList<>();
        tempUnitCards.addAll(bank.northernRealm);
        tempUnitCards.addAll(bank.neutral);
        shuffle(tempUnitCards);
        for(int i = 0; i < 25; i++) {
            unitCards.add(tempUnitCards.get(i));
        }

        ArrayList<Card> tempSpecialCards = new ArrayList<>();
        tempSpecialCards.addAll(bank.special);
        shuffle(tempSpecialCards);
        for(int i = 0; i < 4; i++) {
            specialCards.add(tempSpecialCards.get(i));
        }
    }

}
