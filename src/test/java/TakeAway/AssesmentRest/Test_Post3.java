package TakeAway.AssesmentRest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.cliftonlabs.json_simple.JsonObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Test_Post3 {
	
 @Test
  public void testIsReturningARequest() {

/*
	
      //RestAssured.baseURI = "https://jsonplaceholder.typicode.com/posts";
      given()//.urlEncodingEnabled(true)
      //.contentType(ContentType.JSON)
      .param("title", "takeaway")
          //.param("title", "takeaway")
          //.param("body", "time to order food")
          //.param("userId", 2019)
      .header("Content-Type", "application/json").
          when()
          
          	.post("https://jsonplaceholder.typicode.com/posts")
          .then().statusCode(201);
    */  
      given().
      pathParam("title","takeaway").
      pathParam("body", "time to order food").
      pathParam("userId", "2019").
  when()
  	.post("https://jsonplaceholder.typicode.com/posts").
  	
      //{raceSeason}
  then().
  
     assertThat().statusCode(201);
      
  }

	  
	  
	 
  
/*
  	@Test
	    public static void postJsonPayload() {
	        
            given()
            .contentType(ContentType.JSON)
            .body(payload).
    	when()
    		.post("https://jsonplaceholder.typicode.com/posts").
	then().
			assertThat().
			statusCode(201);
}
*/
}