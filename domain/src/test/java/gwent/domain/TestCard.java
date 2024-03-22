package gwent.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCard {

    @Test
    public void testGetCardID() {
        Card testCard = new Card("ciri", 15);
        testCard.cardID = "test";
        assertEquals("test", testCard.getCardID());
    }

    @Test
    public void testGetCardName() {
        Card testCard = new Card("ciri", 15);
        testCard.cardName = "ciri";
        assertEquals("ciri", testCard.getCardName());
    }

    @Test
    public void testPlayCardSendsCardToPlayingField() {
        CardBank testBank = new CardBank();
        Card testCard = new Card("ciri", 15);
        Player testPlayer1 = new Player(1, testBank);
        Player testPlayer2 = new Player(2, testBank);
        Board testBoard = new Board(testPlayer1, testPlayer2);
        testCard.play(testBoard, testPlayer1.hand, 1);
        assertEquals(testCard, testBoard.getCard(/* close, */ 0, 1));
    }

    @Test
    public void testPlayCardSendsCardToPlayingFieldPlayer2() {
        CardBank testBank = new CardBank();
        Card testCard = new Card("ciri", 15);
        Player testPlayer1 = new Player(1, testBank);
        Player testPlayer2 = new Player(2, testBank);
        Board testBoard = new Board(testPlayer1, testPlayer2);
        testCard.play(testBoard, testPlayer2.hand, 2);
        assertEquals(testCard, testBoard.getCard(0, 2));
    }
}
