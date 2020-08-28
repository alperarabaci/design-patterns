package com.udemy.factorymethod.ex1;

import com.udemy.factorymethod.ex1.message.JSONMessage;
import com.udemy.factorymethod.ex1.message.Message;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new JSONMessage();
	}
	
}
