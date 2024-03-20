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
        UnitCard testCard = new UnitCard("testCard");
        testGwent.getPlayer1().getHand().addCard(testCard);
        testGwent.playCard(testCard.getCardID(), 1);
        assertEquals(testCard, testGwent.getBoard().getCard(0, 1));
    }

    @Test
    public void TestCardsAdded

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
