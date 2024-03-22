package gwent.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDeckBuilder {

    @Test
    public void TestInitializingDeckBuilderAdds25UnitCardsToDeck() {
        CardBank testBank = new CardBank();
        DeckBuilder testDeck = new DeckBuilder(testBank);
        assertEquals(25, testDeck.unitCards.size());
    }

    @Test
    public void TestInitializingDeckBuilderAdds4SpecialCardsToDeck() {
        CardBank testBank = new CardBank();
        DeckBuilder testDeck = new DeckBuilder(testBank);
        assertEquals(4, testDeck.specialCards.size());
    }
}
