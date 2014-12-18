
package orig2011.v3;
import java.awt.Dimension;
/**
* Common superclass for all game model classes.
*
* Constructors of subclasses should initiate matrix elements and additional,
* game-dependent fields.
*/
public interface GameModel {
	
public GameTile getGameboardState(final Position pos);
public GameTile getGameboardState(final int x, final int y);
public Dimension getGameboardSize();
public abstract void gameUpdate(int lastKey) throws GameOverException;
}