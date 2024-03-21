package gwent.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestPlayer {
    @Test
    public void TestPlayerHasHandAfterInitiation() {
        Player testPlayer = new Player(1);
        assertNotNull(testPlayer.hand);
    }
}
