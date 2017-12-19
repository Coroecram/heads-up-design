package Receiver;

public class CeilingFan {
	
	int speed;
	
	public CeilingFan() {
		this.speed = 0;
	}
	
	public void pull() {
		if (this.speed < 3) {
			++this.speed;
		} else {
			this.speed = 0;
		}
		
		switch (speed) {
			case 0: System.out.println("The fan turns off.");
				break;
			case 1: System.out.println("The fan spins slowly.");
				break;
			case 2: System.out.println("The fan turns moderately.");
				break;
			case 3: System.out.println("The fan is spinning out of control!");
				break;
		}
		
	}

}
