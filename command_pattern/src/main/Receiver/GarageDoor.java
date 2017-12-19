package Receiver;

public class GarageDoor {
	
	boolean goingUp;
	boolean goingDown;
	boolean lightOn;
	
	public GarageDoor() {
		this.goingUp = false;
		this.goingDown = false;
		this.lightOn = false;
	}
	
	public void up() {
		if (!this.goingDown && !this.goingUp) {
			System.out.println("The garage door raises.");
			this.goingUp = true;
		} else if (!this.goingUp && this.goingDown) {
			System.out.println("The garage door stops.");
			this.goingDown = false;
		} else {
			System.out.println("");
		}
	}
	
	public void down() {
		if (!this.goingDown && !this.goingUp) {
			System.out.println("The garage door lowers.");
			this.goingUp = true;
		} else if (this.goingUp && !this.goingDown) {
			System.out.println("The garage door stops.");
			this.goingDown = false;
		} else {
			System.out.println("");
		}
	}
	
	public void stop() {
		this.goingDown = false;
		this.goingUp = false;
		System.out.println("The garage door stops.");
	}
	
	public void lightOn() {
		if (!this.lightOn) {
			System.out.println("The garage light turns on.");
			this.lightOn = true;
		} else {
			System.out.println("");
		}
		
	}
	
	public void off() {
		if (this.lightOn) {
			System.out.println("The garage light turns off.");
			this.lightOn = false;
		} else {
			System.out.println("");
		}
	}

}
