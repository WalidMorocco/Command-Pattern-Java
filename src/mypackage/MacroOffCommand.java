package mypackage;

public class MacroOffCommand implements Command {
	MacroCommand macroCommand;

	public MacroOffCommand(MacroCommand macroCommand) {
		this.macroCommand = macroCommand;
	}

	public void execute() {
		macroCommand.off();
	}

	public void undo() {
		macroCommand.on();
	}
}
