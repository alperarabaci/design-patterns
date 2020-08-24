package com.coffeepoweredcrew.facade;

import com.coffeepoweredcrew.facade.email.EmailFacade;
/* NOT NEED TO ALL THIS DEPENDENCIES
import com.coffeepoweredcrew.facade.email.Email;
import com.coffeepoweredcrew.facade.email.Mailer;
import com.coffeepoweredcrew.facade.email.Stationary;
import com.coffeepoweredcrew.facade.email.StationaryFactory;
import com.coffeepoweredcrew.facade.email.Template;
import com.coffeepoweredcrew.facade.email.Template.TemplateType;
import com.coffeepoweredcrew.facade.email.TemplateFactory;
*/

public class ClientNew {

	public static void main(String[] args) {
		Order order = new Order("101", 99.99);
		EmailFacade facade = new EmailFacade();
		
		boolean result = facade.sendOrderEmail(order);
		
		System.out.println("Order Email "+ (result?"sent!":"NOT sent..."));
		
	}
	
}
/*
 * Old code:
public class Client {

	public static void main(String[] args) {
		Order order = new Order("101", 99.99);
		
		boolean result = sendOrderEmailWithoutFacade(order);
		
		System.out.println("Order Email "+ (result?"sent!":"NOT sent..."));
		
	}

	private static boolean sendOrderEmailWithoutFacade(Order order) {
		Template template = TemplateFactory.createTemplateFor(TemplateType.Email);
		Stationary stationary = StationaryFactory.createStationary();
		Email email = Email.getBuilder()
					  .withTemplate(template)
					  .withStationary(stationary)
					  .forObject(order)
					  .build();
		Mailer mailer = Mailer.getMailer();
		return mailer.send(email);
	}
	
}
*/
