package com.galaxy.commands;

import com.galaxy.Process.Merchant;


public class HowMuchQuestionCommand implements ICommand {

	@Override
	public void executeCommand(Merchant merchant, String questionString) {
		merchant.answerHowMuchQuestion(questionString);
	}

}
