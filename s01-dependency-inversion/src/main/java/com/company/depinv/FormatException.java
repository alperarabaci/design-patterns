package com.company.depinv;

import java.io.IOException;

//Thrown by formatter
public class FormatException extends IOException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2874681572063602671L;

	public FormatException(Exception cause) {
		super(cause);
	}
}
