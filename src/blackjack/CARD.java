/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

/**
 *
 * @author User
 */
public class CARD{
    
    private int value;

    public CARD(int value) {
        this.value = value;
    }
   
    public String toString() {
        return "" + value;
    }

    public int getValue() {
        return value;
    }
}
