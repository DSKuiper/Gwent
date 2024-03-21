package gwent.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestGwent {

    @Test
    public void TestGetNumberOfCardsInTheFieldReturns0AtStartOfGame() {
        Gwent testGwent = new Gwent();
        assertEquals(0, testGwent.getNumberOfCards(1));
    }

    @Test
    public void TestPlayCardMovesTestCardToBoard() {
        Gwent testGwent = new Gwent();
        UnitCard testCard = new UnitCard("testCard", 1);
        testGwent.getPlayer1().getHand().addCard(testCard);
        testGwent.playCard(testCard.getCardID(), 1);
        assertEquals(testCard, testGwent.getBoard().getCard(0, 1));
    }

    //meaningless tests for coverage:
    @Test
    public void TestGetBoardReturnsBoard() {
        Gwent testGwent = new Gwent();
        assertEquals(Board.class, testGwent.getBoard().getClass());
    }

    @Test
    public void TestGetHandReturnsHand() {
        Gwent testGwent = new Gwent();
        assertEquals(Hand.class, testGwent.getPlayer2().getHand().getClass());
    }

    @Test
    public void TestGetScoreReturnsCorrectScoreAfterPlayingTwoCards() {
        Gwent testGwent = new Gwent();
        UnitCard testcard = new UnitCard("testcard", 10);
        testGwent.getPlayer2().getHand().addCard(testcard);
        testGwent.playCard(testcard.getCardID(), 2);
        UnitCard testcard2 = new UnitCard("testcard2", 5);
        testGwent.getPlayer2().getHand().addCard(testcard2);
        testGwent.playCard(testcard2.getCardID(), 2);
        assertEquals(15, testGwent.getScore("close", 2));
    }

    //TODO test total score when multiple ranges are added
    @Test
    public void TestGetTotalScoreReturnsCorrectScoreAfterPlayingTwoCards() {
        Gwent testGwent = new Gwent();
        UnitCard testcard = new UnitCard("testcard", 10);
        testGwent.getPlayer2().getHand().addCard(testcard);
        testGwent.playCard(testcard.getCardID(), 2);
        UnitCard testcard2 = new UnitCard("testcard2", 5);
        testGwent.getPlayer2().getHand().addCard(testcard2);
        testGwent.playCard(testcard2.getCardID(), 2);
        assertEquals(15, testGwent.getTotalScore( 2));
    }
}
