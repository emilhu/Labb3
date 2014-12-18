package orig2011.v3;
import java.awt.Dimension;

public abstract class GameUtils implements GameModel{

	public Dimension getGameboardSize() {
		return Constants.getGameSize();
	}		
}