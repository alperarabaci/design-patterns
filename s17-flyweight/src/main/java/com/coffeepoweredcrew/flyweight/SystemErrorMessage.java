package com.coffeepoweredcrew.flyweight;

//A concrete Flyweight. Instance is shared
public class SystemErrorMessage implements ErrorMessage {

	private String messageTemplate;
	
	private String helpUrlBase;
	
	public SystemErrorMessage(String messageTemplate, String helpUrlBase) {
		this.messageTemplate = messageTemplate;
		this.helpUrlBase = helpUrlBase;
	}
	
	@Override
	public String getText(String code) {
		return messageTemplate.replace("$errorCode", code) + helpUrlBase + code;
	}

 }
