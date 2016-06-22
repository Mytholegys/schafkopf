package game.rules;

import game.playfield.card;
import java.util.Collection;
/**
 * Created by Thoams on 19.06.2016.
 */
public class spiel {
    private Collection <card> trumpf;

    void cleartrumpf(){
        trumpf.removeAll(trumpf);
        }

    void addCard(card karte){
        if(!trumpf.contains(karte))
        trumpf.add(karte);
        karte.setTrumpf(true);
    }


}
