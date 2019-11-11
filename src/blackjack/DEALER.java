/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.util.concurrent.ThreadLocalRandom;
/**
 *
 * @author User
 */
public class DEALER extends PERSON{
    
     public DEALER() {
        super();
        name = "The dealer";
    }

    public boolean wantToHit() {
        if (total < 16) return true;
        if (total > 16) return false;
        if (ThreadLocalRandom.current().nextInt(0,2) == 0) return true;
        return false;
    }
}
