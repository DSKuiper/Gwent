package nl.sogyo.domain;

import nl.sogyo.domain.Gwent;
import nl.sogyo.domain.GwentFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestGwentFactory {

    @Test
    public void testNewGwentGameIsReturned() {
        GwentFactory factory = new GwentFactory();
        Gwent testGwent = factory.createNewGame();
        assertEquals(Gwent.class, testGwent.getClass());
    }

}
