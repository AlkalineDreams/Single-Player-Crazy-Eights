/****************************************************************************
 * Class: Deck. A dynamic deck of cards.
 ****************************************************************************/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	//properties
	private List<Card> _deck = new ArrayList<Card>();
	
	//constructors
	public Deck(){
		//creates 52 card objects and adds them to the "_deck" list.

        //aces
        Card aceOfClubs = new Card(11, SUITS.CLUBS, CHARACTERS.ACE);
        _deck.add(aceOfClubs);
        Card aceOfSpades = new Card(11, SUITS.SPADES, CHARACTERS.ACE);
        _deck.add(aceOfSpades);
        Card aceOfHearts = new Card(11, SUITS.HEARTS, CHARACTERS.ACE);
        _deck.add(aceOfHearts);
        Card aceOfDiamonds = new Card(11, SUITS.DIAMONDS, CHARACTERS.ACE);
        _deck.add(aceOfDiamonds);

        //kings
        Card kingOfClubs = new Card(10, SUITS.CLUBS, CHARACTERS.KING);
        _deck.add(kingOfClubs);
        Card kingOfSpades = new Card(10, SUITS.SPADES, CHARACTERS.KING);
        _deck.add(kingOfSpades);
        Card kingOfHearts = new Card(10, SUITS.HEARTS, CHARACTERS.KING);
        _deck.add(kingOfHearts);
        Card kingOfDiamonds = new Card(10, SUITS.DIAMONDS, CHARACTERS.KING);
        _deck.add(kingOfDiamonds);

        //queens
        Card queenOfClubs = new Card(10, SUITS.CLUBS, CHARACTERS.QUEEN);
        _deck.add(queenOfClubs);
        Card queenOfSpades = new Card(10, SUITS.SPADES, CHARACTERS.QUEEN);
        _deck.add(queenOfSpades);
        Card queenOfHearts = new Card(10, SUITS.HEARTS, CHARACTERS.QUEEN);
        _deck.add(queenOfHearts);
        Card queenOfDiamonds = new Card(10, SUITS.DIAMONDS, CHARACTERS.QUEEN);
        _deck.add(queenOfDiamonds);

        //jacks
        Card jackOfClubs = new Card(10, SUITS.CLUBS, CHARACTERS.JACK);
        _deck.add(jackOfClubs);
        Card jackOfSpades = new Card(10, SUITS.SPADES, CHARACTERS.JACK);
        _deck.add(jackOfSpades);
        Card jackOfHearts = new Card(10, SUITS.HEARTS, CHARACTERS.JACK);
        _deck.add(jackOfHearts);
        Card jackOfDiamonds = new Card(10, SUITS.DIAMONDS, CHARACTERS.JACK);
        _deck.add(jackOfDiamonds);

        //10s
        Card tenOfClubs = new Card(10, SUITS.CLUBS, CHARACTERS.TEN);
        _deck.add(tenOfClubs);
        Card tenOfSpades = new Card(10, SUITS.SPADES, CHARACTERS.TEN);
        _deck.add(tenOfSpades);
        Card tenOfHearts = new Card(10, SUITS.HEARTS, CHARACTERS.TEN);
        _deck.add(tenOfHearts);
        Card tenOfDiamonds = new Card(10, SUITS.DIAMONDS, CHARACTERS.TEN);
        _deck.add(tenOfDiamonds);

        //9s
        Card nineOfClubs = new Card(9, SUITS.CLUBS, CHARACTERS.NINE);
        _deck.add(nineOfClubs);
        Card nineOfSpades = new Card(9, SUITS.SPADES, CHARACTERS.NINE);
        _deck.add(nineOfSpades);
        Card nineOfHearts = new Card(9, SUITS.HEARTS, CHARACTERS.NINE);
        _deck.add(nineOfHearts);
        Card nineOfDiamonds = new Card(9, SUITS.DIAMONDS, CHARACTERS.NINE);
        _deck.add(nineOfDiamonds);

        //8s
        Card eightOfClubs = new Card(8, SUITS.CLUBS, CHARACTERS.EIGHT);
        _deck.add(eightOfClubs);
        Card eightOfSpades = new Card(8, SUITS.SPADES, CHARACTERS.EIGHT);
        _deck.add(eightOfSpades);
        Card eightOfHearts = new Card(8, SUITS.HEARTS, CHARACTERS.EIGHT);
        _deck.add(eightOfHearts);
        Card eightOfDiamonds = new Card(8, SUITS.DIAMONDS, CHARACTERS.EIGHT);
        _deck.add(eightOfDiamonds);

        //7s
        Card sevenOfClubs = new Card(7, SUITS.CLUBS, CHARACTERS.SEVEN);
        _deck.add(sevenOfClubs);
        Card sevenOfSpades = new Card(7, SUITS.SPADES, CHARACTERS.SEVEN);
        _deck.add(sevenOfSpades);
        Card sevenOfHearts = new Card(7, SUITS.HEARTS, CHARACTERS.SEVEN);
        _deck.add(sevenOfHearts);
        Card sevenOfDiamonds = new Card(7, SUITS.DIAMONDS, CHARACTERS.SEVEN);
        _deck.add(sevenOfDiamonds);

        //6es
        Card sixOfClubs = new Card(6, SUITS.CLUBS, CHARACTERS.SIX);
        _deck.add(sixOfClubs);
        Card sixOfSpades = new Card(6, SUITS.SPADES, CHARACTERS.SIX);
        _deck.add(sixOfSpades);
        Card sixOfHearts = new Card(6, SUITS.HEARTS, CHARACTERS.SIX);
        _deck.add(sixOfHearts);
        Card sixOfDiamonds = new Card(6, SUITS.DIAMONDS, CHARACTERS.SIX);
        _deck.add(sixOfDiamonds);

        //5s
        Card fiveOfClubs = new Card(5, SUITS.CLUBS, CHARACTERS.FIVE);
        _deck.add(fiveOfClubs);
        Card fiveOfSpades = new Card(5, SUITS.SPADES, CHARACTERS.FIVE);
        _deck.add(fiveOfSpades);
        Card fiveOfHearts = new Card(5, SUITS.HEARTS, CHARACTERS.FIVE);
        _deck.add(fiveOfHearts);
        Card fiveOfDiamonds = new Card(5, SUITS.DIAMONDS, CHARACTERS.FIVE);
        _deck.add(fiveOfDiamonds);

        //4s
        Card fourOfClubs = new Card(4, SUITS.CLUBS, CHARACTERS.FOUR);
        _deck.add(fourOfClubs);
        Card fourOfSpades = new Card(4, SUITS.SPADES, CHARACTERS.FOUR);
        _deck.add(fourOfSpades);
        Card fourOfHearts = new Card(4, SUITS.HEARTS, CHARACTERS.FOUR);
        _deck.add(fourOfHearts);
        Card fourOfDiamonds = new Card(4, SUITS.DIAMONDS, CHARACTERS.FOUR);
        _deck.add(fourOfDiamonds);

        //3s
        Card threeOfClubs = new Card(3, SUITS.CLUBS, CHARACTERS.THREE);
        _deck.add(threeOfClubs);
        Card threeOfSpades = new Card(3, SUITS.SPADES, CHARACTERS.THREE);
        _deck.add(threeOfSpades);
        Card threeOfHearts = new Card(3, SUITS.HEARTS, CHARACTERS.THREE);
        _deck.add(threeOfHearts);
        Card threeOfDiamonds = new Card(3, SUITS.DIAMONDS, CHARACTERS.THREE);
        _deck.add(threeOfDiamonds);

        //2s
        Card twoOfClubs = new Card(2, SUITS.CLUBS, CHARACTERS.TWO);
        _deck.add(twoOfClubs);
        Card twoOfSpades = new Card(2, SUITS.SPADES, CHARACTERS.TWO);
        _deck.add(twoOfSpades);
        Card twoOfHearts = new Card(2, SUITS.HEARTS, CHARACTERS.TWO);
        _deck.add(twoOfHearts);
        Card twoOfDiamonds = new Card(2, SUITS.DIAMONDS, CHARACTERS.TWO);
        _deck.add(twoOfDiamonds);
		
	}
	
	//getter for deck size
	public int getDeckLength() { return this._deck.size(); }
	
	public void Shuffle(){
		
		Collections.shuffle(_deck);
		
	}
	
	public Card Draw(){
		
		Card chosenCard = _deck.get(0);
		_deck.remove(0);
		return chosenCard;
		
	}
	
}
