package rbadia.voidspace.model;
import java.awt.Rectangle;

/**
 * Represents a bullet fired by a ship.
 */
public class Bullet extends Rectangle {
	private static final long serialVersionUID = 1L;
	
	private int bulletWidth = 8;
	private int bulletHeight = 8;
	private int speed = 12;

	/**
	 * Creates a new bullet above the ship, centered on it
	 * @param ship
	 */
	public Bullet(Ship ship) {
		this.setLocation(ship.x + ship.width/2 - bulletWidth/2,
				ship.y - bulletHeight);
		this.setSize(bulletWidth, bulletHeight);
	}
	
	/**
	 * Creates a new enemy bullet above the ship, centered on it
	 * @param enemy ship
	 */

	public Bullet(EnemyShip enemyShip) {
		speed = 8;
		this.setLocation(enemyShip.x + enemyShip.width/2 - bulletWidth/2,
				enemyShip.y - bulletHeight + enemyShip.height);
		this.setSize(bulletWidth, bulletHeight);
	}

	public Bullet(ReaperShip reaperShip) {
		speed = 4;
		this.setLocation(reaperShip.x + reaperShip.width/2 - bulletWidth/2,
				reaperShip.y - (bulletHeight+37) + reaperShip.height);
		this.setSize(bulletWidth, bulletHeight+37);
	}

	public Bullet(BossShip bossShip) {
		speed = 2;
		this.setLocation(bossShip.x + bossShip.width/2 - (bulletWidth+17)/2,
				bossShip.y - (bulletHeight+27) + bossShip.height);
		this.setSize(bulletWidth+17, bulletHeight+27);
	}

	/**
	 * Return the bullet's speed.
	 * @return the bullet's speed.
	 */
	public int getSpeed() {
		return speed;
	}

	/**
	 * Set the bullet's speed
	 * @param speed the speed to set
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
