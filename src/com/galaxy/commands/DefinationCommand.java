package com.galaxy.commands;

import com.galaxy.Process.Merchant;

public class DefinationCommand implements ICommand {

	@Override
	public void executeCommand(Merchant merchant, String commandString) {
		merchant.addToDictionary(commandString);
	}

}
