package com.udemy.factorymethod.ex1;

import com.udemy.factorymethod.ex1.message.Message;

public class Client {

	public static void main(String[] args) {
		printMessage(new JSONMessageCreator());
		printMessage(new TextMessageCreator());
	}
	
	public static void printMessage(MessageCreator creator) {
		Message message = creator.getMessage();
		System.out.println(message);
	}
}
