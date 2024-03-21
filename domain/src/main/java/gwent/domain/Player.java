package gwent.domain;

public class Player {
    protected Hand hand;
    protected int playerOneOrTwo;

    public Player(int player) {
        this.hand = new Hand();
        this.playerOneOrTwo = player;
    }

    public Hand getHand() {
        return hand;
    }
}
