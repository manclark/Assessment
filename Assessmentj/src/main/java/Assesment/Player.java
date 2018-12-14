package Assesment;

public class Player {

	private double playerPositionX;
	private double playerPositionY;

	public Player(double playerPositionX, double playerPositionY) {
		this.playerPositionX = playerPositionX;
		this.playerPositionY = playerPositionY;
	}

	public double getPlayerPositionX() {
		return playerPositionX;
	}

	public void setPlayerPositionX(double playerPositionX) {
		this.playerPositionX = playerPositionX;
	}

	public double getPlayerPositionY() {
		return playerPositionY;
	}

	public void setPlayerPositionY(double playerPositionY) {
		this.playerPositionY = playerPositionY;
	}

}