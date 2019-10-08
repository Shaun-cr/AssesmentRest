package TakeAway.AssesmentRest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.cliftonlabs.json_simple.JsonObject;

import io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Test_Post2 {
  
  
  private static String payload = "{\n" +
	        "  \"title\": \"takeaway\",\n" +
	        "  \"body\": \"time to order food\",\n" +
	        "  \"userId\": \"2019\"\n" +
	        "}";
  	@Test
	    public static void postsTypicode() {
  		
  	//with().body(new O(5.25f, 1, 13.1f, "X"));        
    given().log().all()
	    .contentType(ContentType.JSON)
	    .body(payload).
	when()
		.request("POST", "https://jsonplaceholder.typicode.com/posts").
		//.post("https://jsonplaceholder.typicode.com/posts").
	then().statusCode(201).
		and().
			body("title", equalTo("takeaway")).
		and().
			body("body", equalTo("time to order food")).
		and().
			body("userId",equalTo("2019")).
		and().
			body("id", equalTo(101))
			.log().all()
			;
		


            
            
}
}