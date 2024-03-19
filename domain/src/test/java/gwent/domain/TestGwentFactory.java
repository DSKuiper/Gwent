package gwent.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestGwentFactory {

    @Test
    public void testNewGwentGameIsReturned() {
        GwentFactory factory = new GwentFactory();
        Gwent testGwent = factory.createNewGame();
        assertEquals(Gwent.class, testGwent.getClass());
    }

}
