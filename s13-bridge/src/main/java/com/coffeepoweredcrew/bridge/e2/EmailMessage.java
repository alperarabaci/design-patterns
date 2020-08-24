package com.coffeepoweredcrew.bridge.e2;

public class EmailMessage extends Message {
	public EmailMessage(MessageSender messageSender) {
		super(messageSender);
	}

	@Override
	public void send() {
		messageSender.sendMessage();
	}
}