package gwent.domain;

import java.util.ArrayList;
import java.util.Collection;

import static java.util.Collections.shuffle;

public class CardBank {
    protected ArrayList<Card> northernRealm = new ArrayList<>();
    protected ArrayList<Card> neutral = new ArrayList<>();
    protected ArrayList<Card> special = new ArrayList<>();
    public CardBank() {
        addNorthernRealms();
        addNorthernRealms();
        addNeutralCards();
        addSpecialCards();
        addSpecialCards();
        addSpecialCards();
    }

    public void addNorthernRealms() {
        /* template add:
        northernRealm.add(new Card("", ));
        */
        northernRealm.add(new Card("Ballista-1", 6, "siege"));
        northernRealm.add(new Card("Ballista-2", 6, "siege"));
        northernRealm.add(new Card("Dethmold", 6, "ranged"));
        northernRealm.add(new Card("Esterad-Thyssen", 10, "close"));
        northernRealm.add(new Card("John-Natalis", 10, "close"));
        northernRealm.add(new Card("Keira-Metz", 5,"ranged"));
        northernRealm.add(new Card("Philippa-Eilhart", 10, "ranged"));
        northernRealm.add(new Card("Redenian-Foot-Soldier-1", 1, "close"));
        northernRealm.add(new Card("Redenian-Foot-Soldier-2", 1, "close"));
        northernRealm.add(new Card("Sabrina-Glevissig", 4, "ranged"));
        northernRealm.add(new Card("Sheldon-Skaggs", 4, "ranged"));
        northernRealm.add(new Card("Siege-Tower", 6, "siege"));
        northernRealm.add(new Card("Siegfried-Of-Denesle", 5, "close"));
        northernRealm.add(new Card("Sile-De-Tansarville", 5, "ranged"));
        northernRealm.add(new Card("Trebuchet-1", 6, "siege"));
        northernRealm.add(new Card("Trebuchet-2", 6, "siege"));
        northernRealm.add(new Card("Vernon-Roche", 10, "close"));
        northernRealm.add(new Card("Ves", 5, "close"));
        northernRealm.add(new Card("Yarpen-Zigrin", 2, "close"));
    }

    public void addNeutralCards() {
        /* template add:
        neutral.add(new Card("", ));
        */
        neutral.add(new Card("Ciri-1", 15, "close"));
        neutral.add(new Card("Ciri-2", 15, "close"));
        neutral.add(new Card("Emiel-Regis-Rohellec-Terzieff-1", 5, "close"));
        neutral.add(new Card("Emiel-Regis-Rohellec-Terzieff-2", 5, "close"));
        neutral.add(new Card("Geralt-Of-Rivia-1", 15, "close"));
        neutral.add(new Card("Geralt-Of-Rivia-2", 15, "close"));
        neutral.add(new Card("Triss-Merigold-1", 7, "close"));
        neutral.add(new Card("Triss-Merigold-2", 7, "close"));
        neutral.add(new Card("Vesemir-1", 6, "close"));
        neutral.add(new Card("Vesemir-2", 6, "close"));
        neutral.add(new Card("Zoltan-Chivay-1", 5, "close"));
        neutral.add(new Card("Zoltan-Chivay-2", 5, "close"));
    }
    
    public void addSpecialCards() {
        /* template add:
        special.add(new Card("", 0));
        */
        special.add(new Card("Biting-Frost", 0, "weather"));
        special.add(new Card("Clear-Weather", 0, "weather"));
        //special.add(new Card("Commanders-Horn", 0));
        //special.add(new Card("Decoy", 0));
        //special.add(new Card("Impenetrable-Fog", 0));
        //special.add(new Card("Scorch", 0));
        //special.add(new Card("Torrential-Rain", 0));
    }
}
