package com.coffeepoweredcrew.bridge.e2;

import org.junit.jupiter.api.Test;

import com.coffeepoweredcrew.bridge.e2.EmailMessageSender;
import com.coffeepoweredcrew.bridge.e2.Message;
import com.coffeepoweredcrew.bridge.e2.MessageSender;
import com.coffeepoweredcrew.bridge.e2.TextMessage;
import com.coffeepoweredcrew.bridge.e2.TextMessageSender;

/**
 * https://springframework.guru/gang-of-four-design-patterns/bridge-pattern/
 * @author alper
 *
 */
class MessageTest {

	@Test
	public void testSend() throws Exception {
		MessageSender textMessageSender = new TextMessageSender();
		Message textMessage = new TextMessage(textMessageSender);
		textMessage.send();
		
		MessageSender emailMessageSender = new EmailMessageSender();
		Message emailMessage = new TextMessage(emailMessageSender);
		emailMessage.send();
	}

}
