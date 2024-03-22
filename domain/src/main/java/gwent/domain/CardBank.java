package gwent.domain;

import java.util.ArrayList;

public class CardBank {
    protected ArrayList<Card> bank = new ArrayList<>();

    public CardBank() {
        addNorthernRealms();
        addNeutralCards();
        addSpecialCards();
    }

    public void addNorthernRealms() {
        /* template add:
        bank.add(new Card("", ));
        */
        bank.add(new Card("Ballista-1", 6));
        bank.add(new Card("Ballista-2", 6));
        bank.add(new Card("Dethmold", 6));
        bank.add(new Card("Esterad-Thyssen", 10));
        bank.add(new Card("John-Natalis", 10));
        bank.add(new Card("Keira-Metz", 5));
        bank.add(new Card("Philippa-Eilhart", 10));
        bank.add(new Card("Redenian-Foot-Soldier-1", 1));
        bank.add(new Card("Redenian-Foot-Soldier-2", 1));
        bank.add(new Card("Sabrina-Glevissig", 4));
        bank.add(new Card("Sheldon-Skaggs", 4));
        bank.add(new Card("Siege-Tower", 6));
        bank.add(new Card("Siegfried-Of-Denesele", 5));
        bank.add(new Card("Sile-De-Tansarville", 5));
        bank.add(new Card("Trebuchet-1", 6));
        bank.add(new Card("Trebuchet-2", 6));
        bank.add(new Card("Vernon-Roche", 10));
        bank.add(new Card("Ves", 5));
        bank.add(new Card("Yarpen-Zigrin", 2));
    }

    public void addNeutralCards() {
        /* template add:
        bank.add(new Card("", ));
        */
        bank.add(new Card("Ciri-1", 15));
        bank.add(new Card("Ciri-2", 15));
        bank.add(new Card("Emiel-Regis-Rohellec-Terzieff-1", 5));
        bank.add(new Card("Emiel-Regis-Rohellec-Terzieff-2", 5));
        bank.add(new Card("Geralt-Of-Rivia-1", 15));
        bank.add(new Card("Geralt-Of-Rivia-2", 15));
        bank.add(new Card("Triss-Merigold-1", 7));
        bank.add(new Card("Triss-Merigold-2", 7));
        bank.add(new Card("Vesemir-1", 6));
        bank.add(new Card("Vesemir-2", 6));
        bank.add(new Card("Zoltan-Chivay-1", 5));
        bank.add(new Card("Zoltan-Chivay-2", 5));
    }
    
    public void addSpecialCards() {
        /* template add:
        bank.add(new Card("", ));
        */
    }
}
