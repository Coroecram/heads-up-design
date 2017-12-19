package Command;

import Receiver.CeilingFan;

public class CeilingFanPull implements Command {

	CeilingFan fan;
	
	public CeilingFanPull(CeilingFan fan) {
		this.fan = fan;
	}
	
	@Override
	public void execute() {
		this.fan.pull();
	}

}
