package mypackage;

public class RemoteLoader {

	public static void main(String[] args) {

		RemoteControl remoteControl = new RemoteControl();
		
		// Create all the devices in their proper location
		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		CeilingFan ceilingFan= new CeilingFan("Living Room");
		GarageDoor garageDoor= new GarageDoor();
		Stereo stereo = new Stereo("Living Room");

		//Create all the light command objects
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
		
		// Create the On and Off for the ceiling fan
		CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
		
		// Create the Up and Down commands for the Garage
		GarageDoorOpenCommand garageDoorUp = new GarageDoorOpenCommand(garageDoor);
		GarageDoorDownCommand garageDoorDown= new GarageDoorDownCommand(garageDoor);
		
		// Create the stereo nOn and Off commands
		StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
		StereoOffCommand stereoOff= new StereoOffCommand(stereo);
		
		// Now that we've got all our commands, we can load them into the remote slots
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
		remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
		remoteControl.setCommand(3, stereoOnWithCD, stereoOff);
		remoteControl.setCommand(4, garageDoorUp, garageDoorDown);
		
		System.out.println(remoteControl);
		
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		
		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);
		
		remoteControl.onButtonWasPushed(2);
		remoteControl.offButtonWasPushed(2);
		
		remoteControl.onButtonWasPushed(3);
		remoteControl.offButtonWasPushed(3);
		
		remoteControl.onButtonWasPushed(4);
		remoteControl.offButtonWasPushed(4);
		
		remoteControl.undoButtonWasPushed(4);
	}

}
