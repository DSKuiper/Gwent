package gwent.domain;

public class Player {
    protected Hand hand;
    protected int playerOneOrTwo;
    protected DeckBuilder deck;

    public Player(int player, CardBank bank) {
        this.deck = new DeckBuilder(bank);
        this.hand = new Hand(deck);
        this.playerOneOrTwo = player;
    }

    public Hand getHand() {
        return hand;
    }
}
