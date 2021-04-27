package com.galaxy.questions;

import com.galaxy.Process.Merchant;

public class HowManyQuestion implements IQuestion {

	@Override
	public void answerQuestion(Merchant merchant, String questionString) {
		merchant.answerHowManyQuestion(questionString);
	}

}
