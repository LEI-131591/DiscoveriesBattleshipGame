/**
 *
 */
package iscteiul.ista.battleship;

import java.util.List;

/**

 Represents a Battleship game.

 <p>Provides operations for firing shots and retrieving game statistics,

 including hits, repeated shots, invalid shots and sunk ships.</p>
 */
public interface IGame {

    /**

     Fires a shot at the specified position.

     @param pos position to fire at

     @return the ship hit by the shot, or {@code null} if no ship was hit
     */
    IShip fire(IPosition pos);

    /**

     Returns all positions at which shots have been fired.

     @return the list of positions that have been shot
     */
    List<IPosition> getShots();

    /**

     Returns the number of repeated shots.

     @return the number of shots fired at positions that had already been shot
     */
    int getRepeatedShots();

    /**

     Returns the number of invalid shots.

     @return the number of invalid shots
     */
    int getInvalidShots();

    /**

     Returns the number of successful shots.

     @return the number of hits
     */
    int getHits();

    /**

     Returns the number of ships that have been sunk.

     @return the number of sunk ships
     */
    int getSunkShips();

    /**

     Returns the number of ships that are still in play.

     @return the number of remaining ships
     */
    int getRemainingShips();

    /**

     Prints the positions where valid shots can be fired.
     */
    void printValidShots();

    /**

     Prints the fleet and its current state.
     */
    void printFleet();
}