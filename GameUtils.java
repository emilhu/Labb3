package orig2011.v7;
import java.awt.Dimension;

public class GameUtils {

	public Dimension getGameboardSize() {
		return Constants.getGameSize();
	}		
	
	protected void setGameboardState(int x, int y, GameTile tile, GameTile[][] board) {
		board[x][y] = tile;
	}
	
	protected void setGameboardState(Position pos, GameTile tile, GameTile[][] board) {
		board[pos.getX()][pos.getY()] = tile;
	}	

}