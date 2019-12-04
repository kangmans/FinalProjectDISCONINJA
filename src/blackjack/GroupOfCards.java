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
public abstract class GroupOfCards {

	public CARD drawNextCard() {
        int value = ThreadLocalRandom.current().nextInt(2,12);
        return new CARD(value);
	}

	/**
	 * 
	 * @param person
	 */
	public void dealCard(PERSON person) {
        person.receiveCard(drawNextCard());
	}

	/**
	 * 
	 * @param person
	 */
	public void dealInitialCards(PERSON person) {
        dealCard(person);
        dealCard(person);
	}

}