package nl.sogyo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestGwent {

    @Test
    public void testPlayCardSendsCardToPlayingField() {
        Card testCard = new UnitCard();
        testCard.play();
        Board testBoard = new Board();
        assertEquals(testCard, testBoard.getCard(/*1, close, */ 1));
    }

}
