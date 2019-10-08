package TakeAway.AssesmentRest;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Test_AddRecord {
  
	private static String requestParameters = "{\n" +
	        "  \"title\": \"takeaway\",\n" +
	        "  \"body\": \"time to order food\",\n" +
	        "  \"userId\": \"2019\"\n" +
	        "}";
	
  
  	@Test
  	public static void testAddRecordAndConfirmRespond() {
  		  
	    given().log().ifValidationFails()
		    .contentType(ContentType.JSON)
		    .body(requestParameters).
		when()
			.post("https://jsonplaceholder.typicode.com/posts").
		then().log().ifValidationFails().statusCode(201).
			and().
				body("title", equalTo("takeaway")).
			and().
				body("body", equalTo("time to order food")).
			and().
				body("userId",equalTo("2019")).
			and().
				body("id", equalTo(101))
				;       
  	}
  	
  	
}