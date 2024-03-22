package gwent.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestPlayer {
    @Test
    public void TestPlayerHasHandAfterInitiation() {
        CardBank testBank = new CardBank();
        Player testPlayer = new Player(1, testBank);
        assertNotNull(testPlayer.hand);
    }
}
