
package orig2011.v7;
/**
* Common superclass for all game model classes.
*
* Constructors of subclasses should initiate matrix elements and additional,
* game-dependent fields.
*/
public interface GameModel extends IObservable {
	
public GameTile getGameboardState(int x, int y);
public GameTile getGameboardState(Position pos);
public int getUpdateSpeed();
public void gameUpdate(int lastKey) throws GameOverException;
}