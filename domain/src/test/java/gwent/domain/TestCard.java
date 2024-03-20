package gwent.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
        Player testPlayer1 = new Player(1);
        Player testPlayer2 = new Player(2);
        Board testBoard = new Board(testPlayer1, testPlayer2);
        testCard.play(testBoard, testPlayer1.hand, 1);
        assertEquals(testCard, testBoard.getCard(/* close, */ 0, 1));
    }

    @Test
    public void testPlayCardSendsCardToPlayingFieldPlayer2() {
        Card testCard = new UnitCard("ciri");
        Player testPlayer1 = new Player(1);
        Player testPlayer2 = new Player(2);
        Board testBoard = new Board(testPlayer1, testPlayer2);
        testCard.play(testBoard, testPlayer2.hand, 2);
        assertEquals(testCard, testBoard.getCard(0, 2));
    }
}
