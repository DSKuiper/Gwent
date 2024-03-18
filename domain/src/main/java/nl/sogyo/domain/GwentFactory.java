package nl.sogyo.domain;

public class GwentFactory implements IGwentFactory{

    @Override
    public Gwent createNewGame() {
        return new Gwent();
    }
}
