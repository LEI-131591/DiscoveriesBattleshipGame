/**
 *
 */
package iscteiul.ista.battleship;

/**
 * @author fba
 */
/**

 Represents a position on the Battleship game board.

 <p>A position is identified by its row and column and keeps track

 of whether it is occupied and whether it has been hit.</p>
 */
public interface IPosition {

    /**

     Returns the row of this position.

     @return the row index
     */
    int getRow();

    /**

     Returns the column of this position.

     @return the column index
     */
    int getColumn();

    /**

     Determines whether this position is adjacent to another position.

     @param other position to check

     @return {@code true} if the positions are adjacent;

     {@code false} otherwise


     */
    boolean isAdjacentTo(IPosition other);

    /**

     Marks this position as occupied.
     */
    void occupy();

    /**

     Marks this position as having been hit.
     */
    void shoot();

    /**

     Determines whether this position is occupied.

     @return {@code true} if the position is occupied;

     {@code false} otherwise


     */
    boolean isOccupied();

    /**

     Determines whether this position has been hit.

     @return {@code true} if the position has been hit;

     {@code false} otherwise


     */
    boolean isHit();
}