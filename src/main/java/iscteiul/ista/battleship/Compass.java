/**
 *
 */
package iscteiul.ista.battleship;

/**
 * @author fba
 */
/**

 Represents the possible orientations of a ship on the Battleship board.
 */
public enum Compass {

    /**

     North direction.
     */
    NORTH('n'),

    /**

     South direction.
     */
    SOUTH('s'),

    /**

     East direction.
     */
    EAST('e'),

    /**

     West direction.
     */
    WEST('o'),

    /**

     Unknown or invalid direction.
     */
    UNKNOWN('u');

    private final char c;

    Compass(char c) {
        this.c = c;
    }

    /**

     Returns the character representing this direction.

     @return the direction character
     */
    public char getDirection() {
        return c;
    }

    /**

     Returns the character representation of this direction.

     @return the direction character as a string
     */
    @Override
    public String toString() {
        return "" + c;
    }

    /**

     Converts a character into its corresponding compass direction.

     <p>Supported characters are {@code 'n'}, {@code 's'},

     {@code 'e'} and {@code 'o'}. Any other character is mapped

     to {@link #UNKNOWN}.</p>

     @param ch character representing a compass direction

     @return the corresponding compass direction, or {@link #UNKNOWN}

     if the character is not recognized


     */
    static Compass charToCompass(char ch) {
        Compass bearing;
        switch (ch) {
            case 'n':
                bearing = NORTH;
                break;
            case 's':
                bearing = SOUTH;
                break;
            case 'e':
                bearing = EAST;
                break;
            case 'o':
                bearing = WEST;
                break;
            default:
                bearing = UNKNOWN;
        }

        return bearing;


    }
}