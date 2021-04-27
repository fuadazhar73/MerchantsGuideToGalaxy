package com.galaxy.commands;

import com.galaxy.Process.Merchant;

public interface ICommand {
	public void executeCommand(final Merchant merchant, String commandString);
}
