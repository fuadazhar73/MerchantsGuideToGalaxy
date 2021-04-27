package com.galaxy.commands;

import com.galaxy.Process.Merchant;

public class QuestionCommand implements ICommand{

	@Override
	public void executeCommand(Merchant merchant, String commandString) {
		merchant.delegateQuestion(commandString);
	}

}
