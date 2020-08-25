package com.coffeepoweredcrew.flyweight.ex1;

import java.util.HashMap;
import java.util.Map;

//Flyweight factory. Returns shared flyweight based on key
public class ErrorMessageFactory {
	
	//This serves as key for getting flyweight instance
	public enum ErrorType {GenericSystemError, PageNotFoundError, ServerError}
	
	private static final ErrorMessageFactory FACTORY = new ErrorMessageFactory();

	public static ErrorMessageFactory getInstance() {
		return FACTORY;
	}
	
	private Map<ErrorType, SystemErrorMessage> errorMessages = new HashMap<>();
	
	private ErrorMessageFactory() {
		SystemErrorMessage messageGeneric = new SystemErrorMessage("A generic error of type $errorCode occured. Please refer to :\n", "http://google.com/q=");
		errorMessages.put(ErrorType.GenericSystemError, messageGeneric);
		
		SystemErrorMessage messagePageNotFound = new SystemErrorMessage("Page not found. An error type $errorCode occured. Please refer to :\n", "http://google.com/q=");
		errorMessages.put(ErrorType.PageNotFoundError, messagePageNotFound);
		
		SystemErrorMessage messageServerError = new SystemErrorMessage("A generic error of type  $errorCode occured. Please refer to :\n", "http://google.com/q=");
		errorMessages.put(ErrorType.ServerError, messageServerError);
	}
	
	public SystemErrorMessage getError(ErrorType type) {
		return errorMessages.get(type);
	}
	
	public UserBannedErrorMessage getUserBannedMessage(String caseId) {
		return new UserBannedErrorMessage(caseId);
	}
}
