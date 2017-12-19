package Receiver;

public class Light {
	
	boolean on;
	
	public Light() {
		this.on = false;
	}

	public void on() {
		if (!this.on) {
			System.out.println("The light turns on.");
			this.on = true;
		} else {
			System.out.println("The light is already on.");
		}
		
	}
	
	public void off() {
		if (this.on) {
			System.out.println("The light turns off.");
			this.on = false;
		} else {
			System.out.println("The light is already off.");
		}
	}

}
