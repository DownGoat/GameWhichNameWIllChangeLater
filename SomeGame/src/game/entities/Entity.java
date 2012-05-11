package game.entities;

import org.newdawn.slick.geom.Rectangle;

public interface Entity {
	/**
	 * Draws the GameObject to the screen. 
	 */
	void draw();

	/**
	 * 
	 * @return X coordinate.
	 */
	float getX();

	/**
	 * 
	 * @return Y Coordinate.
	 */
	float getY();

	int getWidth();

	int getHeight();

	/**
	 * Updates the GameObjects position on the screen.
	 * @param x The X coordinate.
	 * @param y The Y coordinate.
	 */
	void updatePosition(float x, float y);

	boolean intersects(Entity ent);

	Rectangle getRect();
}
