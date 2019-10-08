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

public class Test_Test_AddRecordAlternative {
  @Test
  public void testAddRecordAndConfirmRespondStatus() {
	  
		
	  RestAssured.baseURI ="https://jsonplaceholder.typicode.com/posts";
	  RequestSpecification request = RestAssured.given();
	  
	  JsonObject requestParams = new JsonObject();
	  requestParams.put("title","takeaway"); 
	  requestParams.put("body","time to order food" );
	  requestParams.put("userId", 2019);
	  
	// Add a header stating the Request body is a JSON
	  request.header("Content-type", "application/json; charset=UTF-8");
	   
	  // Add the Json to the body of the request
	  request.body(requestParams.toJson());
	   
	  // Post the request and check the response
	  Response response = request.post();
	  
	  int statusCode = response.getStatusCode();
	  Response r = response.peek();
	  System.out.println(r);
	  String statusCodeConverted = (String.valueOf(statusCode)).trim();
	  
	  System.out.println(statusCodeConverted);
	  Assert.assertEquals(statusCodeConverted, "201");
	 
  }
}
