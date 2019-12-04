/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;


import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author User
 */
// here we create blackjack as a super class.
public abstract class BlackJACK {

    // here we create game as a static object of the blackjack class.
    private static BlackJACK game;
    // we create the list of array of the class person named players.
    private ArrayList<PERSON> players;
    //create deck asa the object of class GroupOfCards.
    private GroupOfCards deck;
       
        // here we are creating methods to do different task.
	public BlackJACK() {
        initializeGame();
        dealCards();
        takeTurns();
        declareWinner();
        playAgain();
	}

	/**
	 * 
	 * @param args the command line arguments
	 */
        // this is the main method of blackjack
	public static void main(String[] args) {
        game = new BlackJACK() {};
	}

        // here we are calling the methods.
	private void initializeGame() {
        deck = new GroupOfCards() {};
        players = new ArrayList<PERSON>();
        players.add(new PLAYER());
        players.add(new DEALER());

        System.out.println("Welcome to a new Blackjack game!");
	}

	private void dealCards() {
        for (PERSON player : players) {
            deck.dealInitialCards(player);
            player.printCards(player.getName().equals("You"));
	}
    }

	private void takeTurns() {
        for (PERSON player: players) {
            boolean endOfTurn = false;
            while(!endOfTurn) {
                player.printCards(true);
                boolean hit = player.wantToHit();
               
                if (hit) {
                    deck.dealCard(player);
                    System.out.println(player.getName() + " drew a card.\n");
                    if (player.getTotal() > 21) {
                        endOfTurn = true;
                        System.out.println(player.getName() + " died.\n");
	}
                } else{
                    endOfTurn = true;
                    System.out.println(player.getName() + " stayed.\n");
                }
            }
        }
    }

	private void declareWinner() {
        byte highest = -1;
        byte topPlayer = -1;
        for (byte i = 0; i < players.size(); i++) {
            String name = players.get(i).getName();
            byte total = players.get(i).getTotal();

            System.out.println(name + (name.equals("You") ? " have " : " has ") + "a total of " + total + ".");

            if (total > highest && total <= 21) {
                highest = total;
                topPlayer = i;
	}
            if (total == highest && name.equals("The dealer")) {
                topPlayer = i;
            }
        }
        if (topPlayer == -1) {
            System.out.println("Everyone is dead. Nobody wins.");
        } else {
            System.out.println(players.get(topPlayer).getName() + " wins!");
        }
    }

	private void playAgain() {
        System.out.print("\nPlay again? \"y\" / \"n\": ");
        Scanner keyboard = new Scanner(System.in);
        while(true) {
            String input = keyboard.next();
            if (input.equals("y")) {
                game = new BlackJACK() {};
            } else if (input.equals("n")) {
                System.exit(0);
            } else {
                System.out.print("Please type \"y\" or \"n\": ");
	}
        }
    }
}


