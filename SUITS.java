/****************************************************************************
 * Enumerated Type: SUITS. All four suits that a standard playing card can be.
 ****************************************************************************/

public enum SUITS {
	
	HEARTS("HEARTS"),
	DIAMONDS("DIAMONDS"),
	CLUBS("CLUBS"),
	SPADES("SPADES");
	
	private final String suit;

    SUITS(String suit) {
        this.suit = suit;
    }
    
    public String getSuit() {
        return this.suit;
    }

}
