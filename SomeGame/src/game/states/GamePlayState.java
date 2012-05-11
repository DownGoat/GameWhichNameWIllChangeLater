package game.states;

import java.util.ArrayList;
import java.util.Iterator;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import game.entities.Enemy;
import game.entities.Entity;
import game.entities.Player;
import game.entities.Projectile;
/**
 * The state that contains the gameplay and the game container
 * @author Stefan Klaus
 */
public class GamePlayState extends BasicGameState {
	private int stateID = -1;
	
	private Player player;
	
	private ArrayList<Entity> entities;

	private ArrayList<Enemy> enemies;

	private ArrayList<Projectile> projectiles;
	
	private long score;

	private boolean pauseState = false;

	public GamePlayState(int stateID) {
		this.stateID = stateID;
	}

	@Override
	public void init(GameContainer gc, StateBasedGame sbg)
			throws SlickException {
		gc.setVSync(true);
		
		player = new Player();
		entities = new ArrayList<Entity>();
		enemies = new ArrayList<Enemy>();
		projectiles = new ArrayList<Projectile>();
		
		
	}

	@Override
	public void render(GameContainer gc, StateBasedGame arg1, Graphics arg2)
			throws SlickException {
		Iterator<Enemy> i = enemies.iterator();
		while (i.hasNext()) {
			Enemy em = i.next();
			
			if(player.intersects(em)){
				i.remove();
				System.out.println("Enemy collidet with player");
			}
			
		}

		Iterator<Projectile> ip = projectiles.iterator();
		while (ip.hasNext()) {
			Projectile projectile = ip.next();
		
			if(player.intersects(projectile)){
				i.remove();
				System.out.println("Projectile collided with player");
			}
		
		}

	}

	@Override
	public void update(GameContainer arg0, StateBasedGame arg1, int arg2)
			throws SlickException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
