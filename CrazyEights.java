/****************************************************************************
 *
 * Created by: Craig
 * Created on: Nov 2016
 * This program is a single player game of Crazy 8's.
 * 
 ****************************************************************************/
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CrazyEights {
	
	public static int UserPlay(String userInput, Card cardInPlay, List<Card> hand) throws IOException{
		
		//this function is created to make errors caused by user input impossible.
		
		InputStreamReader r2 = new InputStreamReader(System.in);
		BufferedReader br2 = new BufferedReader(r2);
		
		int userNumber = -1;
		
		try {
			userNumber = Integer.parseInt(userInput);
		} catch (NumberFormatException e) {
			System.out.println("Please input a NUMBER:");
			userInput = br2.readLine();
			UserPlay(userInput, cardInPlay, hand);
		}
		
		try {
			hand.get(userNumber - 1);
		} catch (Exception e) {
			System.out.println("Please input a VALID NUMBER:");
			userInput = br2.readLine();
			UserPlay(userInput, cardInPlay, hand);
		}
		
		userNumber = userNumber - 1;
		
		if(hand.get(userNumber).getChar() == cardInPlay.getChar() || hand.get(userNumber).getSuit() == cardInPlay.getSuit()){
			//if user's choice is playable, just return it.
			return userNumber;
		} else {
			System.out.println("You cannot play that card onto the one in play. Please select another.");
			userInput = br2.readLine();
			userNumber = UserPlay(userInput, cardInPlay, hand);
		}
		
		return userNumber;
		
	}
	
	public static Card SuitSelect(Card card) throws IOException{
		
		InputStreamReader r2 = new InputStreamReader(System.in);
		BufferedReader br2 = new BufferedReader(r2);
		
		String userInput = br2.readLine();
		
		if (userInput.toUpperCase().equals("S")){
			card.setSuit(SUITS.SPADES);
		}
		else if (userInput.toUpperCase().equals("C")){
			card.setSuit(SUITS.CLUBS);
		}
		else if (userInput.toUpperCase().equals("H")){
			card.setSuit(SUITS.HEARTS);
		}
		else if (userInput.toUpperCase().equals("D")){
			card.setSuit(SUITS.DIAMONDS);
		}
		else {
			//if the user's input was invalid
			System.out.println("Please enter a valid letter; either S, C, H, or D.");
			SuitSelect(card);
		}
		
		return card;
		
	}

	public static void main(String[] args) throws IOException {
		
		System.out.println("SINGLE PLAYER CRAZY EIGHTS");
		System.out.println("--------------------------");
		
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		
		Deck deck = new Deck(); //creates deck of 52 cards
		deck.Shuffle(); //randomizes the cards' order
		
		List<Card> hand = new ArrayList<Card>(); //initializes user's hand
		
		for (int counter = 0; counter < 8; counter++){ //gives the user 8 cards
			hand.add(deck.Draw()); //draws card from deck and adds it to hand
		}
		
		Card cardInPlay = deck.Draw(); //draws first card in play
		
		/*------------------------DIVIDING LINE FOR READABILITY------------------------*/
		
		while(hand.size() > 0 && deck.getDeckLength() > 0){ //while any move can be made, including draws
			
			System.out.println("The card in play is the " + cardInPlay.getChar() + " of " + cardInPlay.getSuit() + ".");
			
			boolean playable = false; //whether or not a play can be made this round
			
			for (int i = 0; i < hand.size(); i++){ //checks each item in hand to see if a play can be made.
				
				if (hand.get(i).getChar() == cardInPlay.getChar() || hand.get(i).getSuit() == cardInPlay.getSuit()){
					
					//if card at [i] is playable
					playable = true;
					
				}
				
			}
			
			if(playable){
				
				//when a play can be made
				System.out.println("In your hand, you have " + hand.size() + " cards.");
				for (int i = 0; i < hand.size(); i++){
					if (i == hand.size() - 1){
						//adds a period on the last item in the hand. purely cosmetic code to make the user experience easier.
						System.out.println("and (" + (i+1) + ")" + hand.get(i).getChar() + " of " + hand.get(i).getSuit() + ".");
					} else {
						System.out.println("(" + (i+1) + ")" + hand.get(i).getChar() + " of " + hand.get(i).getSuit() + ", ");
					}
				}
				
				System.out.println("Please enter the number of the card you would like to play.");
				
				String userInput = br.readLine();
				
				int userChoice = UserPlay(userInput, cardInPlay, hand);
				
				Card temp;
				
				if (hand.get(userChoice).getChar() == CHARACTERS.EIGHT){
					
					//if card chosen is an 8
					System.out.println("You drew an 8! Please Select a suit for the top card:");
					System.out.println("Enter 'S' for Spades, 'C' for Clubs, 'H' for Hearts, or 'D' for diamonds.");
					temp = SuitSelect(hand.get(userChoice));
					
				} else {
					
					//if card isn't an 8
					temp = hand.get(userChoice);
					
				}
				
				System.out.println("You played the " + hand.get(userChoice).getChar() + " of " + hand.get(userChoice).getSuit() + ".");
				
				cardInPlay = temp;
				hand.remove(userChoice);
				
			} else {
				
				//when a play cannot be made, draw a new card.
				System.out.println("None of the cards in your hand can be played. You draw another card from the deck.");
				hand.add(deck.Draw()); 
				
			}
			
			System.out.println("-------------------------"); //separates each round with a line of dashes.
			
		}
		
		if (hand.size() < 1){
			System.out.println("You Win!");
		} else {
			System.out.println("You Lose!");
		}

	}

}
