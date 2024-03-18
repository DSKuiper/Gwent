package nl.sogyo;

public class GwentFactory implements IGwentFactory{

    @Override
    public IGwent createNewGame() {
        return new Gwent();
    }
}
