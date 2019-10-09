package TakeAway.AssesmentRest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Test_GetAlbums extends Base{
	
  @Test(priority = 1 ) 
  public void getAlbumsIsReturningRecords() {
	  
	  	given().log().ifValidationFails().
		when()
		    .get("https://jsonplaceholder.typicode.com/albums").
	    then().log().ifValidationFails().statusCode(200)
		    .and()
		    	.body("id",hasSize(100))
		    .and()
		    	.body("userId",hasSize(100))
		    .and()
		    	.body("title",hasSize(100))
		    ;    		
  }
  
  @Test(priority = 3 ) 
  public void getFirstAlbumRecordAndConfirmAllReturnedData() {

		given().log().ifValidationFails().
		when()
		    .get("https://jsonplaceholder.typicode.com/albums/1").
	    then().log().ifValidationFails().statusCode(200)
		    .and()
		    	.body("userId", equalTo(1))
		    .and()
		    	.body("id", equalTo(1))
			.and()
		    	.body("title", equalTo("quidem molestiae enim"))
		    ;    		
  }
  
	@Test(priority = 3 ) 
	public void logRespondsTimeOnGettingAllUsers() {
	    Response response = RestAssured.post("https://jsonplaceholder.typicode.com/albums");
	    long timeInMilliSeconds = response.time();
	    System.out.println("Responds time , POST 'https://jsonplaceholder.typicode.com/albums' is: " + timeInMilliSeconds + " in MilliSeconds");
	}
  
  
  
}
