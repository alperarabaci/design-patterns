package com.coffeepoweredcrew.decorator;

import org.apache.commons.text.StringEscapeUtils;

//Decorator. Implements component interface
public class HtmlEncodedMessage implements Message{

	private Message message;
	
	public HtmlEncodedMessage(Message message) {
		this.message = message;
	}
	
	@Override
	public String getContent() {	
		return StringEscapeUtils.escapeHtml4(message.getContent()) ;
	}

}
