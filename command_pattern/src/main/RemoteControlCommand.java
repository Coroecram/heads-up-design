import Command.*;
import Invoker.RemoteControl;
import Receiver.*;

public class RemoteControlCommand {

	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl();
		Light light = new Light();
		LightOffCommand lightOff = new LightOffCommand(light);
		LightOnCommand lightOn = new LightOnCommand(light);
		
		rc.setCommand(0, lightOn, lightOff);
		rc.onButtonWasPushed(0);
		rc.offButtonWasPushed(0);
		System.out.println("\n------------------------------------------\n");
		System.out.println(rc);
	}

}
