package gwent.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestBoard {
    @Test
    public void TestAddCardForPlayer1AddsCardToPlayer1Field() {
        Gwent testGwent = new Gwent();
        Card testcard = new Card("testcard", 1);
        testGwent.getPlayer1().getHand().addCard(testcard);
        testGwent.playCard(testcard.getCardID(), 1);
        assertEquals(1, testGwent.getBoard().getCloseRangePlayer1().size());
        assertEquals(0, testGwent.getBoard().getCloseRangePlayer2().size());
    }

    @Test
    public void TestAddCardForPlayer2AddsCardToPlayer2Field() {
        Gwent testGwent = new Gwent();
        Card testcard = new Card("testcard", 1);
        testGwent.getPlayer2().getHand().addCard(testcard);
        testGwent.playCard(testcard.getCardID(), 2);
        assertEquals(0, testGwent.getBoard().getCloseRangePlayer1().size());
        assertEquals(1, testGwent.getBoard().getCloseRangePlayer2().size());
    }

    @Test
    public void TestAddingScoresAfterOnePlayedCard() {
        Gwent testGwent = new Gwent();
        Card testcard = new Card("testcard", 10);
        testGwent.getPlayer1().getHand().addCard(testcard);
        testGwent.playCard(testcard.getCardID(), 1);
        assertEquals(10, testGwent.getBoard().getScore("close", 1));
    }

    @Test
    public void TestAddingScoresAfterTwoPlayedcards() {
        Gwent testGwent = new Gwent();
        Card testcard = new Card("testcard", 10);
        testGwent.getPlayer2().getHand().addCard(testcard);
        testGwent.playCard(testcard.getCardID(), 2);
        Card testcard2 = new Card("testcard2", 5);
        testGwent.getPlayer2().getHand().addCard(testcard2);
        testGwent.playCard(testcard2.getCardID(), 2);
        assertEquals(15, testGwent.getBoard().getScore("close", 2));
    }
}
