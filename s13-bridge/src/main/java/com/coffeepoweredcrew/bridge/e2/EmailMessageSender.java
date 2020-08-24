package com.coffeepoweredcrew.bridge.e2;

public class EmailMessageSender implements MessageSender {

	@Override
	public void sendMessage() {
		System.out.println("EmailMessageSender: Sending email message...");
	}

}