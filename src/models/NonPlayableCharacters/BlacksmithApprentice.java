package models.NonPlayableCharacters;

import interfaces.Command;

public class BlacksmithApprentice {
	
	Command command;
	
	public BlacksmithApprentice() {}
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void orderConfirmed() {
		command.execute();
	}
}
