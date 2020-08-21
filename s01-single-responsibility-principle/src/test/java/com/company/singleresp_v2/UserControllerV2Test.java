package com.company.singleresp_v2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.company.singleresp.Main;
import com.company.singleresp_v2.UserControllerV2;

import static org.assertj.core.api.Assertions.assertThat;

class UserControllerV2Test {

	UserControllerV2 controller; 
	
	@BeforeEach
	void init() {
		controller = new UserControllerV2();
	}
	
	@Test
	public void testCreateUser_validUserJson() throws Exception {
		UserControllerV2 controller = new UserControllerV2();
		//Check with valid JSON
		String response = controller.createUser(Main.VALID_USER_JSON);	
		
		assertThat(response).isEqualTo("SUCCESS");
	}


	@Test
	public void testCreateUser_invalidUserJson() throws Exception {
		String response = controller.createUser(Main.INVALID_USER_JSON);

		assertThat(response).isEqualTo("ERROR");
	}

}
