/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.util.Scanner;
/**
 *
 * @author User
 */
public class PLAYER extends PERSON{

    

     private Scanner keyboard;

    public PLAYER(){
        super();
        name = "You";
        keyboard = new Scanner(System.in);
	}

	public boolean wantToHit() {
        System.out.print("\nWould you like to \"hit\" or \"stay\": ");
        while (true) {
            String input = keyboard.next();
            if (input.equals("hit")) {
                return true;
            } else if (input.equals("stay")) {
               return false;
            } else {
                System.out.print("Type \"hit\" or \"stay\": ");
	}
        
            
        
}
    }

    boolean wantToHit(String input) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}