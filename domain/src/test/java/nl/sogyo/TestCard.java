package nl.sogyo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCard {

    @Test
    public void testGetCardID() {
        Card testCard = new UnitCard();
        testCard.cardID = "test";
        assertEquals("test", testCard.getCardID());
    }

    @Test
    public void testGetCardName() {
        Card testCard = new UnitCard();
        testCard.cardName = "ciri";
        assertEquals("ciri", testCard.getCardName());
    }
}
