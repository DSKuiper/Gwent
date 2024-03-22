package gwent.domain;

import java.util.ArrayList;

import static java.util.Collections.shuffle;

public class DeckBuilder {
    protected ArrayList<Card> unitCards = new ArrayList<>();
    protected ArrayList<Card> specialCards = new ArrayList<>();

    public DeckBuilder(CardBank bank) {
        ArrayList<Card> tempUnitCards = new ArrayList<>();
        tempUnitCards.addAll(bank.northernRealm);
        tempUnitCards.addAll(bank.northernRealm);
        tempUnitCards.addAll(bank.neutral);
        shuffle(tempUnitCards);
        for(int i = 0; i < 25; i++) {
            unitCards.add(tempUnitCards.get(i));
        }

        ArrayList<Card> tempSpecialCards = new ArrayList<>();
        while(tempSpecialCards.size() < 8) {
            tempSpecialCards.addAll(bank.special);
        }
        shuffle(tempSpecialCards);
        for(int i = 0; i < 8; i++) {
            specialCards.add(tempSpecialCards.get(i));
        }
    }

}
