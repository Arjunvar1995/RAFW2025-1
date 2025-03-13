package api.tests;

import api.endPoints.userEndPoints;
import api.payloads.user;
import io.restassured.response.*;
import org.testng.annotations.*;

public class userTests {
	

	
	user userpayload;
	
	@Test(priority=0)
	public void prepareData() {
		
		userpayload=new user();
		userpayload.setId(0);
		userpayload.setUsername("sample");
		userpayload.setFirstName("Arjun");
		userpayload.setLastName("PV");
		userpayload.setEmail("Arjun@gmail.com");
		userpayload.setPassword("Hellow");
		userpayload.setPhone("1234567898");
		
	}
	
	@Test(priority=1)
	public void testCreateUser() {
		
		Response response=userEndPoints.createUserEP(userpayload);
		response.then().log().all();
		
	}
	
	@Test(priority=2)
	public void testRetrieveUser() {
		
		Response response=userEndPoints.retrieveUserEP(userpayload.getUsername());
		response.then().log().all();
		
	}

}
