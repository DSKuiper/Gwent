package gwent.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestCardBank {

    @Test
    public void TestInitializingCardBankAddsNorthernRealms() {
        CardBank testBank = new CardBank();
        boolean test = false;
        for(Card card : testBank.bank) {
            if(card.getCardName().equals("Redenian-Foot-Soldier-1")) {
                test = true;
                break;
            }
        }
        assertTrue(test);
    }

    @Test
    public void TestInitializingCardBankAddsNeutralCards() {
        CardBank testBank = new CardBank();
        boolean test = false;
        for(Card card : testBank.bank) {
            if(card.getCardName().equals("Ciri-1")) {
                test = true;
                break;
            }
        }
        assertTrue(test);
    }

    @Test
    public void TestInitializingCardBankAddsSpecialCards() {
        CardBank testBank = new CardBank();
        boolean test = false;
        for(Card card : testBank.bank) {
            if(card.getCardName().equals("Clear-Weather")) {
                test = true;
                break;
            }
        }
        assertTrue(test);
    }
}
