package com.galaxy.commands;

import com.galaxy.Process.Merchant;

public class UnknownCommand implements ICommand {

	@Override
	public void executeCommand(Merchant merchant, String commandString) {
		merchant.informUnknownCommand();
	}

}
