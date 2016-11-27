/****************************************************************************
 * Class: Card. A single card with various properties and uses.
 ****************************************************************************/
 
 
public class Card {
	
	//properties
	private int _cardValue;
	private SUITS _cardSuit;
	private CHARACTERS _cardChar;
	
	//constructors
	public Card(int value, SUITS suit, CHARACTERS character){
		
		this._cardValue = value;
		this._cardSuit = suit;
		this._cardChar = character;
		
	}
	
	//getters
	public int getValue() { return this._cardValue; }
	public SUITS getSuit() { return this._cardSuit; }
	public CHARACTERS getChar() { return this._cardChar; }
	
	//setter
	public void setSuit(SUITS suit) { this._cardSuit = suit; }

}
