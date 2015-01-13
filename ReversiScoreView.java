package orig2011.v7;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class ReversiScoreView implements PropertyChangeListener{

	
	private ReversiModel reversi;
	
	public ReversiScoreView(ReversiModel reversi) {
		this.reversi = reversi;
		reversi.addObserver(this);
	}
	
	public void propertyChange(PropertyChangeEvent evt) {
		if (evt.getPropertyName() == "TurnChange") {
				System.out.println(reversi.getTurnColor() + " turn\n" + "White: " + 
				reversi.getWhiteScore() + " Black: " + reversi.getBlackScore());
		}
	}
}
