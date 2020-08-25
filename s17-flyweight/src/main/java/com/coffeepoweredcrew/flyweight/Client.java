package com.coffeepoweredcrew.flyweight;

import com.coffeepoweredcrew.flyweight.ErrorMessageFactory.ErrorType;

public class Client {

	public static void main(String[] args) {
		SystemErrorMessage msg1 = ErrorMessageFactory.getInstance().getError(ErrorType.GenericSystemError);
		System.out.println(msg1.getText("39494"));
		
		UserBannedErrorMessage msg2 = ErrorMessageFactory.getInstance().getUserBannedMessage("8383");
		System.out.println(msg2.getText("12"));
	}

}
