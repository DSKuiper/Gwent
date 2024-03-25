package gwent.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestBoard {
    @Test
    public void TestAddCardForPlayer1AddsCardToRightField() {
        Gwent testGwent = new Gwent();
        Card testcard = new Card("testcard", 1, "siege");
        testGwent.getPlayer1().getHand().addCard(testcard);
        testGwent.playCard(testcard.getCardID(), 1);
        assertEquals(0, testGwent.getBoard().getCloseRangePlayer1().size());
        assertEquals(0, testGwent.getBoard().getCloseRangePlayer2().size());
        assertEquals(0, testGwent.getBoard().getRangedPlayer1().size());
        assertEquals(0, testGwent.getBoard().getRangedPlayer2().size());
        assertEquals(1, testGwent.getBoard().getSiegePlayer1().size());
        assertEquals(0, testGwent.getBoard().getSiegePlayer2().size());

    }

    @Test
    public void TestAddCardForPlayer2AddsCardToPlayer2Field() {
        Gwent testGwent = new Gwent();
        Card testcard = new Card("testcard", 1, "close");
        testGwent.getPlayer2().getHand().addCard(testcard);
        testGwent.playCard(testcard.getCardID(), 2);
        assertEquals(0, testGwent.getBoard().getCloseRangePlayer1().size());
        assertEquals(1, testGwent.getBoard().getCloseRangePlayer2().size());
        assertEquals(0, testGwent.getBoard().getRangedPlayer1().size());
        assertEquals(0, testGwent.getBoard().getRangedPlayer2().size());
        assertEquals(0, testGwent.getBoard().getSiegePlayer1().size());
        assertEquals(0, testGwent.getBoard().getSiegePlayer2().size());
    }

    @Test
    public void TestAddingScoresAfterOnePlayedCard() {
        Gwent testGwent = new Gwent();
        Card testcard = new Card("testcard", 10, "close");
        testGwent.getPlayer1().getHand().addCard(testcard);
        testGwent.playCard(testcard.getCardID(), 1);
        assertEquals(10, testGwent.getBoard().getScore("close", 1));
    }

    @Test
    public void TestAddingScoresAfterTwoPlayedCards() {
        Gwent testGwent = new Gwent();
        Card testcard = new Card("testcard", 10, "close");
        testGwent.getPlayer2().getHand().addCard(testcard);
        testGwent.playCard(testcard.getCardID(), 2);
        Card testcard2 = new Card("testcard2", 5, "close");
        testGwent.getPlayer2().getHand().addCard(testcard2);
        testGwent.playCard(testcard2.getCardID(), 2);
        assertEquals(15, testGwent.getBoard().getScore("close", 2));
    }

    @Test
    public void TestTotalScoresAfterPlayingEveryRangePlayer1() {
        Gwent testGwent = new Gwent();
        Card testcard = new Card("testcard", 10, "close");
        testGwent.getPlayer1().getHand().addCard(testcard);
        testGwent.playCard(testcard.getCardID(), 1);
        Card testcard2 = new Card("testcard2", 5, "ranged");
        testGwent.getPlayer1().getHand().addCard(testcard2);
        testGwent.playCard(testcard2.getCardID(), 1);
        Card testcard3 = new Card("testcard3", 10, "siege");
        testGwent.getPlayer1().getHand().addCard(testcard3);
        testGwent.playCard(testcard3.getCardID(), 1);
        assertEquals(25, testGwent.getTotalScore(1));
    }

    @Test
    public void TestTotalScoresAfterPlayingEveryRangePlayer2() {
        Gwent testGwent = new Gwent();
        Card testcard = new Card("testcard", 10, "close");
        testGwent.getPlayer2().getHand().addCard(testcard);
        testGwent.playCard(testcard.getCardID(), 2);
        Card testcard2 = new Card("testcard2", 5, "ranged");
        testGwent.getPlayer2().getHand().addCard(testcard2);
        testGwent.playCard(testcard2.getCardID(), 2);
        Card testcard3 = new Card("testcard3", 10, "siege");
        testGwent.getPlayer2().getHand().addCard(testcard3);
        testGwent.playCard(testcard3.getCardID(), 2);
        assertEquals(25, testGwent.getTotalScore(2));
    }

    @Test
    public void TestNumberOfCardsReturnsCorrectNumberOfCardsAfterPlayingClose2() {
        Gwent testGwent = new Gwent();
        Card testcard = new Card("testcard", 10, "close");
        testGwent.getPlayer2().getHand().addCard(testcard);
        testGwent.playCard(testcard.getCardID(), 2);
        assertEquals(1, testGwent.getBoard().numberOfCards("close", 2));
    }

    @Test
    public void TestNumberOfCardsReturnsCorrectNumberOfCardsAfterPlayingRanged1() {
        Gwent testGwent = new Gwent();
        Card testcard = new Card("testcard", 10, "ranged");
        testGwent.getPlayer1().getHand().addCard(testcard);
        testGwent.playCard(testcard.getCardID(), 1);
        assertEquals(1, testGwent.getBoard().numberOfCards("ranged", 1));
    }

    @Test
    public void TestNumberOfCardsReturnsCorrectNumberOfCardsAfterPlayingRanged2() {
        Gwent testGwent = new Gwent();
        Card testcard = new Card("testcard", 10, "ranged");
        testGwent.getPlayer2().getHand().addCard(testcard);
        testGwent.playCard(testcard.getCardID(), 2);
        assertEquals(1, testGwent.getBoard().numberOfCards("ranged", 2));
    }

    @Test
    public void TestNumberOfCardsReturnsCorrectNumberOfCardsAfterPlayingSiege1() {
        Gwent testGwent = new Gwent();
        Card testcard = new Card("testcard", 10, "siege");
        testGwent.getPlayer1().getHand().addCard(testcard);
        testGwent.playCard(testcard.getCardID(), 1);
        assertEquals(1, testGwent.getBoard().numberOfCards("siege", 1));
    }

    @Test
    public void TestNumberOfCardsReturnsCorrectNumberOfCardsAfterPlayingSiege2() {
        Gwent testGwent = new Gwent();
        Card testcard = new Card("testcard", 10, "siege");
        testGwent.getPlayer2().getHand().addCard(testcard);
        testGwent.playCard(testcard.getCardID(), 2);
        assertEquals(1, testGwent.getBoard().numberOfCards("siege", 2));
    }
}
