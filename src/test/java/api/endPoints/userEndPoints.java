package api.endPoints;

import static io.restassured.RestAssured.*;
import io.restassured.response.*;
import api.payloads.user;
import io.restassured.http.ContentType;


public class userEndPoints {
	
	public static Response createUserEP(user payload) {
		
		Response response=given().
			accept(ContentType.JSON).
			contentType(ContentType.JSON).
			body(payload).
			log().all().
		when().
			post(routes.create_user_url);
		
		return response;
		
	}
	
	public static Response retrieveUserEP(String userName) {
		
		Response response=given().
			accept(ContentType.JSON).
			pathParam("username", userName).
			log().all().
		when().
			get(routes.get_user_url);
		
		return response;
		
	}
	
	public static Response updateUserEP(String userName, user payload) {
		
		Response response=given().
			accept(ContentType.JSON).
			contentType(ContentType.JSON).
			pathParam("username", userName).
			body(payload).
			log().all().
		when().
			put(routes.update_user_url);
		
		return response;
		
		
	}
	
	public static Response deleteUserEP(String userName) {
		
		Response response=given().
			accept(ContentType.JSON).
			pathParam("username", userName).
			log().all().
		when().
			delete(routes.delete_user_url);
		
		return response;
		
		
	}

}
