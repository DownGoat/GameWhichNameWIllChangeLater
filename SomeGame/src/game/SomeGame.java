package game;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

/**
 * 
 * @author Stefan
 *
 */
public class SomeGame {
	public static final int MAINMENUSTATE = 0;
	public static final int GAMEPLAYSTATE = 1;
	public static final int SETTINGSSTATE = 2;
	public static final int PAUSESTATE = 3;
	public static final int GAMEOVERSTATE = 4;

	public static int frameWidth;
	public static int frameHeight;

	public SomeGame(String name, int frameWidth, int frameHeight) {
		/*super(name);

		this.addState(new MainMenuState(MAINMENUSTATE));
		this.addState(new GamePlayState(GAMEPLAYSTATE));
		this.addState(new SettingsState(SETTINGSSTATE));
		this.addState(new PauseState(PAUSESTATE));
		this.addState(new GameOverState(GAMEOVERSTATE));*/

		SomeGame.frameHeight = frameHeight;
		SomeGame.frameWidth = frameWidth;

	//	this.enterState(MAINMENUSTATE);
	}

	@Override
	/*public void initStatesList(GameContainer gc) throws SlickException {
		this.getState(MAINMENUSTATE).init(gc, this);
		this.getState(GAMEPLAYSTATE).init(gc, this);
		this.getState(SETTINGSSTATE).init(gc, this);
		this.getState(PAUSESTATE).init(gc, this);
		this.getState(GAMEOVERSTATE).init(gc, this);
	}*/
}

}
