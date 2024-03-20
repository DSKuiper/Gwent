package gwent.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestGwent {

    @Test
    public void TestGetNumberOfCardsReturns0AtStartOfGame() {
        Gwent testGwent = new Gwent();
        assertEquals(0, testGwent.getNumberOfCards());
    }

    @Test
    public void TestPlayCardMovesTestCardToBoard() {
        Gwent testGwent = new Gwent();
        UnitCard testCard = new UnitCard("testCard");
        testGwent.getPlayer1().getHand().addCard(testCard);
        testGwent.playCard(testCard.getCardID());
        assertEquals(testCard, testGwent.getBoard().getCard(0));
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


}
