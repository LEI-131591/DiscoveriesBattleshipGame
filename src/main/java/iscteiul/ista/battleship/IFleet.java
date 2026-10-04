/**
 *
 */
package iscteiul.ista.battleship;

import java.util.List;

/**

 Represents the fleet of ships in a Battleship game.

 <p>The fleet contains all ships in the game and provides operations

 for adding, retrieving and querying ships.</p>
 */
public interface IFleet {

    /**

     The size of the game board.
     */
    int BOARD_SIZE = 10;

    /**

     The total number of ships in the fleet.
     */
    int FLEET_SIZE = 10;

    /**

     Returns all ships in the fleet.

     @return the list of ships in the fleet
     */
    List<IShip> getShips();

    /**

     Adds a ship to the fleet.

     @param s ship to add

     @return {@code true} if the ship was successfully added;

     {@code false} otherwise


     */
    boolean addShip(IShip s);

    /**

     Returns all ships belonging to the specified category.

     @param category ship category to search for

     @return the ships matching the specified category
     */
    List<IShip> getShipsLike(String category);

    /**

     Returns all ships that have not yet been sunk.

     @return the ships that are still floating
     */
    List<IShip> getFloatingShips();

    /**

     Returns the ship occupying the specified position.

     @param pos position to search for

     @return the ship occupying the position, or {@code null}

     if no ship occupies it


     */
    IShip shipAt(IPosition pos);

    /**

     Prints the current status of the fleet.
     */
    void printStatus();
}