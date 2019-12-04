/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author User
 */
public abstract class PERSON {
    
    private List<CARD> cards;
    protected String name;
    protected byte total;

    public PERSON() {
        cards = new ArrayList<CARD>();
        total = 0;
    }

    public CARD receiveCard(CARD card) {
        cards.add(card);
        total += card.getValue();
        return card;
    }

    public abstract boolean wantToHit();
   

    public byte getTotal() {
        return total;
    }

    public String getName() {
        return name;
    }

    public void printCards(boolean showAll) {
        System.out.print("\n" + name + (name == "You" ? " have a" : " has a") + (cards.get(0).getValue() == 8 || cards.get(0).getValue() == 11 ? "n " : " ") + cards.get(0).toString());
        for (int i = 1; i < cards.size(); i++) {
            if (showAll) {
                System.out.print(" and a" + (cards.get(i).getValue() == 8 || cards.get(i).getValue() == 11 ? "n " : " ") + cards.get(i).toString());
            } else {
                System.out.println(" and a hidden card.");
                 }
        }
        if (showAll) {
            System.out.println(".\n" + name + (name == "You" ? "r" : "'s") + " total is " + total + ".");
        }
    }
}
