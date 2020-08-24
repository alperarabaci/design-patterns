package com.coffeepoweredcrew.bridge.e2;

public abstract class Message {
	MessageSender messageSender;

	public Message(MessageSender messageSender) {
		this.messageSender = messageSender;
	}

	abstract public void send();
}