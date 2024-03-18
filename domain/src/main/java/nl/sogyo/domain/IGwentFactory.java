package nl.sogyo.domain;

public interface IGwentFactory {
    /**
     * Method to create a new Gwent game
     *
     * @return a new Gwent game
     */
    IGwent createNewGame();
}
