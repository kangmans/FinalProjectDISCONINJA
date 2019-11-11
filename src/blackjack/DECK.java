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
public class DECK {
    
    public CARD drawNextCard() {
        int value = ThreadLocalRandom.current().nextInt(2,12);
        return new CARD(value);
    }

    public void dealCard(PERSON person) {
        person.receiveCard(drawNextCard());
    }

    public void dealInitialCards(PERSON person) {
        dealCard(person);
        dealCard(person);
    }
}
