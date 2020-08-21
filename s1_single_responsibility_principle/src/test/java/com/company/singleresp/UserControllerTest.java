package com.company.singleresp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class UserControllerTest {

	UserController controller; 
	
	@BeforeEach
	void init() {
		controller = new UserController();
	}
	
	@Test
	public void testCreateUser_validUserJson() throws Exception {
		UserController controller = new UserController();
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
