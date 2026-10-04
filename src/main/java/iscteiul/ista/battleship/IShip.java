package iscteiul.ista.battleship;

import iscteiul.ista.battleship.Compass;
import iscteiul.ista.battleship.IPosition;

import java.util.List;

/**

 Represents a ship in the Battleship game.

 <p>A ship has a category, a size, a position and a bearing.

 It occupies one or more positions on the board and can be

 shot at by the opponent.</p>
 */
public interface IShip {

    /**

     Returns the category of this ship.

     @return the ship category
     */
    String getCategory();

    /**

     Returns the size of this ship.

     @return the number of positions occupied by the ship
     */
    Integer getSize();

    /**

     Returns all positions occupied by this ship.

     @return the positions occupied by the ship
     */
    List<IPosition> getPositions();

    /**

     Returns the position used to identify this ship.

     @return the ship's position
     */
    IPosition getPosition();

    /**

     Returns the bearing of this ship.

     @return the ship's bearing
     */
    Compass getBearing();

    /**

     Determines whether the ship is still floating.

     @return {@code true} if the ship is still floating;

     {@code false} otherwise


     */
    boolean stillFloating();

    /**

     Returns the topmost position occupied by the ship.

     @return the topmost occupied position
     */
    int getTopMostPos();

    /**

     Returns the bottommost position occupied by the ship.

     @return the bottommost occupied position
     */
    int getBottomMostPos();

    /**

     Returns the leftmost position occupied by the ship.

     @return the leftmost occupied position
     */
    int getLeftMostPos();

    /**

     Returns the rightmost position occupied by the ship.

     @return the rightmost occupied position
     */
    int getRightMostPos();

    /**

     Determines whether the ship occupies the specified position.

     @param pos position to check

     @return {@code true} if the ship occupies the position;

     {@code false} otherwise


     */
    boolean occupies(IPosition pos);

    /**

     Determines whether this ship is too close to another ship.

     @param other ship to check against

     @return {@code true} if the ships are too close;

     {@code false} otherwise


     */
    boolean tooCloseTo(IShip other);

    /**

     Determines whether this ship is too close to the specified position.

     @param pos position to check

     @return {@code true} if the ship is too close to the position;

     {@code false} otherwise


     */
    boolean tooCloseTo(IPosition pos);

    /**

     Shoots the specified position.

     @param pos position to shoot
     */
    void shoot(IPosition pos);
}