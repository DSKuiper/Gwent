package gwent.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCard {

    @Test
    public void testGetCardID() {
        Card testCard = new Card("ciri", 15,"close");
        testCard.cardID = "test";
        assertEquals("test", testCard.getCardID());
    }

    @Test
    public void testGetCardName() {
        Card testCard = new Card("ciri", 15, "close");
        testCard.cardName = "ciri";
        assertEquals("ciri", testCard.getCardName());
    }

    @Test
    public void testPlayCardSendsCardToPlayingField() {
        CardBank testBank = new CardBank();
        Card testCard = new Card("ciri", 15, "close");
        Player testPlayer1 = new Player(1, testBank);
        Player testPlayer2 = new Player(2, testBank);
        Board testBoard = new Board();
        testCard.play(testBoard, testPlayer1.hand, 1);
        assertEquals(testCard, testBoard.getCard(0, 1, "close"));
    }

    @Test
    public void testPlayCardSendsCardToPlayingFieldPlayer2() {
        CardBank testBank = new CardBank();
        Card testCard = new Card("ciri", 15, "close");
        Player testPlayer1 = new Player(1, testBank);
        Player testPlayer2 = new Player(2, testBank);
        Board testBoard = new Board();
        testCard.play(testBoard, testPlayer2.hand, 2);
        assertEquals(testCard, testBoard.getCard(0, 2, "close"));
    }
}
