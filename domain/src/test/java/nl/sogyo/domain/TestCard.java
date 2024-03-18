package nl.sogyo.domain;

import nl.sogyo.domain.Board;
import nl.sogyo.domain.Card;
import nl.sogyo.domain.UnitCard;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCard {

    @Test
    public void testGetCardID() {
        Card testCard = new UnitCard("ciri");
        testCard.cardID = "test";
        assertEquals("test", testCard.getCardID());
    }

    @Test
    public void testGetCardName() {
        Card testCard = new UnitCard("ciri");
        testCard.cardName = "ciri";
        assertEquals("ciri", testCard.getCardName());
    }

    @Test
    public void testPlayCardSendsCardToPlayingField() {
        Card testCard = new UnitCard("ciri");
        Board testBoard = new Board();
        testCard.playField = testBoard;
        testCard.play();
        assertEquals(testCard, testBoard.getCard(/*1, close, */ 1));
    }
}
