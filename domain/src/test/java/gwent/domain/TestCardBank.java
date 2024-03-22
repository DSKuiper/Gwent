package gwent.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestCardBank {

    @Test
    public void TestInitializingCardBankAddsNorthernRealms() {
        CardBank testBank = new CardBank();
        assertNotNull(testBank.northernRealm);
    }

    @Test
    public void TestInitializingCardBankAddsNeutralCards() {
        CardBank testBank = new CardBank();
        assertNotNull(testBank.neutral);
    }

    @Test
    public void TestInitializingCardBankAddsSpecialCards() {
        CardBank testBank = new CardBank();
        assertNotNull(testBank.special);
    }
}
