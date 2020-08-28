package com.udemy.factorymethod.ex1;

import com.udemy.factorymethod.ex1.message.Message;
import com.udemy.factorymethod.ex1.message.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new TextMessage();
	}



}
