package com.company.singleresp_v2;

import java.io.IOException;

import com.company.singleresp.User;
import com.company.singleresp.UserPersistenceService;

//Handles incoming JSON requests that work on User resource/entity
public class UserControllerV2 {
	//Store used by controller
   
	private UserPersistenceService service = new UserPersistenceService();
    private UserValidator validator = new UserValidator();
    private JsonParser parser = new JsonParser();
    
    //Create a new user
    public String createUser(String userJson) throws IOException {
        User user = parser.parseObject(userJson, User.class);
        
		boolean isValid = validator.validateUser(user);
        
        if(!isValid) {
            return "ERROR";
        }
        service.save(user);
        
        return "SUCCESS";
    } 


}