/****************************************************************************
 * Enumerated Type: CHARACTERS.
 * A list of all possible characters/numbers that appear on a card's face.
 ****************************************************************************/

public enum CHARACTERS {

	ACE("ACE"),
	TWO("TWO"),
	THREE("THREE"),
	FOUR("FOUR"),
	FIVE("FIVE"),
	SIX("SIX"),
	SEVEN("SEVEN"),
	EIGHT("EIGHT"),
	NINE("NINE"),
	TEN("TEN"),
	JACK("JACK"),
	QUEEN("QUEEN"),
	KING("KING");
	
	private final String character;

    CHARACTERS(String character) {
        this.character = character;
    }
    
    public String getChar() {
        return this.character;
    }
	
}
