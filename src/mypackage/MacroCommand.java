package mypackage;

public class MacroCommand {
	Light light;
	Stereo stereo;
	GarageDoor garageDoor;
	CeilingFan ceilingFan;
	
	public MacroCommand(Light light, Stereo stereo, GarageDoor garageDoor, CeilingFan ceilingFan) {
		super();
		this.light = light;
		this.stereo = stereo;
		this.garageDoor = garageDoor;
		this.ceilingFan = ceilingFan;
	}

	public void on() {
		System.out.println("\nNight Mode is On:");
		light.on();
		stereo.on();
		garageDoor.down();
		ceilingFan.high();
	}
	
	public void off() {
		System.out.println("\nNight Mode is Off:");
		light.off();
		stereo.off();
		garageDoor.up();
		ceilingFan.off();
	}
}
