package mypackage;

public class MacroOnCommand implements Command {
	MacroCommand macroCommand;

	public MacroOnCommand(MacroCommand macroCommand) {
		this.macroCommand = macroCommand;
	}

	public void execute() {
		macroCommand.on();
	}

	public void undo() {
		macroCommand.off();
	}
}
