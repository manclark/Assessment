package Assesment;

public class Portal {

	private double portalPositionX;
	private double portalPositionY;

	public Portal(double portalPositionX, double portalPositionY) {
		this.portalPositionX = portalPositionX;
		this.portalPositionY = portalPositionY;

	}

	public double getPortalPosition() {
		return portalPositionX;
	}

	public void setPortalPosition(double portalPosition) {
		this.portalPositionX = portalPosition;
	}

	public double getPortalPositionY() {
		return portalPositionY;
	}

	public void setPortalPositionY(double portalPositionY) {
		this.portalPositionY = portalPositionY;
	}

}
