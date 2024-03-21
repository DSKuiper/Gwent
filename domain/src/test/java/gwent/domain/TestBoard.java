package gwent.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestBoard {
    @Test
    public void TestAddCardForPlayer1AddsCardToPlayer1Field() {
        Gwent testGwent = new Gwent();
        UnitCard testcard = new UnitCard("testcard");
        testGwent.getPlayer1().getHand().addCard(testcard);
        testGwent.playCard(testcard.getCardID(), 1);
        assertEquals(1, testGwent.getBoard().getCloseRangePlayer1().size());
        assertEquals(0, testGwent.getBoard().getCloseRangePlayer2().size());
    }

    @Test
    public void TestAddCardForPlayer2AddsCardToPlayer2Field() {
        Gwent testGwent = new Gwent();
        UnitCard testcard = new UnitCard("testcard");
        testGwent.getPlayer2().getHand().addCard(testcard);
        testGwent.playCard(testcard.getCardID(), 2);
        assertEquals(0, testGwent.getBoard().getCloseRangePlayer1().size());
        assertEquals(1, testGwent.getBoard().getCloseRangePlayer2().size());
    }

}
