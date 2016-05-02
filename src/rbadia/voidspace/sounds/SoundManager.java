package rbadia.voidspace.sounds;

import java.applet.Applet;
import java.applet.AudioClip;

import rbadia.voidspace.main.GameScreen;

/**
 * Manages and plays the game's sounds.
 */
public class SoundManager {
	private static final boolean SOUND_ON = true;

	private AudioClip shipExplosionSound = Applet.newAudioClip(GameScreen.class.getResource(
			"/rbadia/voidspace/sounds/shipExplosion.wav"));
	private AudioClip bossExplosionSound = Applet.newAudioClip(GameScreen.class.getResource(
			"/rbadia/voidspace/sounds/bossShipExplosion.wav"));
	private AudioClip bulletSound = Applet.newAudioClip(GameScreen.class.getResource(
			"/rbadia/voidspace/sounds/laser.wav"));
	private AudioClip bossBulletSound = Applet.newAudioClip(GameScreen.class.getResource(
			"/rbadia/voidspace/sounds/bossBullet.wav"));
	private AudioClip gameMusic = Applet.newAudioClip(GameScreen.class.getResource(
			"/rbadia/voidspace/sounds/MassEffect.wav"));
	private AudioClip bossMusic = Applet.newAudioClip(GameScreen.class.getResource(
			"/rbadia/voidspace/sounds/bossBattleMusic.wav"));
	private AudioClip bossVoice = Applet.newAudioClip(GameScreen.class.getResource(
			"/rbadia/voidspace/sounds/bossVoice.wav"));
	private AudioClip victory = Applet.newAudioClip(GameScreen.class.getResource(
			"/rbadia/voidspace/sounds/victory.wav"));

	/**
	 * Plays sound for bullets fired by the ship.
	 */
	public void playBulletSound(){
		if(SOUND_ON){
			new Thread(new Runnable(){
				public void run() {
					bulletSound.play();
				}
			}).start();
		}
	}
	
	/**
	 * Plays sound for bullets fired by the boss.
	 */
	public void playBossBulletSound(){
		if(SOUND_ON){
			new Thread(new Runnable(){
				public void run() {
					bossBulletSound.play();
				}
			}).start();
		}
	}
	
	/**
	 * Plays sound for boss explosions.
	 */
	public void playBossExplosionSound(){
		if(SOUND_ON){
			new Thread(new Runnable(){
				public void run() {
					bossExplosionSound.play();
				}
			}).start();
		}
	}

	/**
	 * Plays sound for ship explosions.
	 */
	public void playShipExplosionSound(){
		if(SOUND_ON){
			new Thread(new Runnable(){
				public void run() {
					shipExplosionSound.play();
				}
			}).start();
		}
	}
	
	/**
	 * Plays the game's music
	 */
	public void playGameMusic(){
		if(SOUND_ON){
			new Thread(new Runnable(){
				public void run() {
					gameMusic.loop();
				}
			}).start();
		}
	}
	
	/**
	 * Stops the game's music
	 */
	public void stopGameMusic(){
		if(SOUND_ON){
			new Thread(new Runnable(){
				public void run() {
					gameMusic.stop();
				}
			}).start();
		}
	}

	/**
	 * Plays sound for asteroid explosions.
	 */
	public void playAsteroidExplosionSound(){
		// play sound for asteroid explosions
		if(SOUND_ON){

		}
	}

	public void playAsteroid1ExplosionSound() {
		// play sound for asteroid explosions
		if(SOUND_ON){

		}
	}

	/**
	 * plays the game cleared music
	 */
	public void playWinMusic() {
		if(SOUND_ON){
			new Thread(new Runnable(){
				public void run() {
					victory.loop();
				}
			}).start();
		}	
	}
	
	/**
	 * Stops the game cleared music
	 */
	public void stopWinMusic() {
		if(SOUND_ON){
			new Thread(new Runnable(){
				public void run() {
					victory.stop();
				}
			}).start();
		}	
	}

	/**
	 * Plays the boss' battle music
	 */
	public void playBossMusic() {
		if(SOUND_ON){
			new Thread(new Runnable(){
				public void run() {
					bossMusic.loop();
				}
			}).start();
		}		
	}
	
	/**
	 * Stop the boss' battle music
	 */
	public void stopBossMusic() {
		if(SOUND_ON){
			new Thread(new Runnable(){
				public void run() {
					bossMusic.stop();
				}
			}).start();
		}		
	}

	/**
	 * Plays the boss dialog sound effect
	 */
	public void playBossVoice() {
		if(SOUND_ON){
			new Thread(new Runnable(){
				public void run() {
					bossVoice.loop();
				}
			}).start();
		}		
	}
	
	/**
	 * Stops the boss dialog sound effect
	 */
	public void stopBossVoice() {
		if(SOUND_ON){
			new Thread(new Runnable(){
				public void run() {
					bossVoice.stop();
				}
			}).start();
		}		
	}
}
