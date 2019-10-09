package TakeAway.AssesmentRest;

import org.testng.Reporter;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.junit.Before;

public class Test_GetUsers extends Base{
	

	
		@Test(priority = 1 )
		public void getUsersIsReturningRecords() {
			given().log().ifValidationFails().
			when()
			    .get("https://jsonplaceholder.typicode.com/users").
		    then().log().ifValidationFails().statusCode(200)
			    .and()
			    	.body("id",hasSize(10))
			    .and()
			    	.body("name",hasSize(10))
			    .and()
			    	.body("username",hasSize(10))
			    .and()
			    	.body("email",hasSize(10))
				 .and()
			    	.body("address.street",hasSize(10))
				 .and()
			        .body("address.geo.lat",hasSize(10))
				 .and()
			        .body("company.name",hasSize(10))
			    ;  
			
		    }
		
		@Test(priority = 1 ) 
		  public void getFirstUserRecordAndConfirmAllReturnedData() {

				given().log().ifValidationFails().
				when()
				    .get("https://jsonplaceholder.typicode.com/users/1").
			    then().log().ifValidationFails().statusCode(200)
				    .and()
				    	.body("id", equalTo(1))
				    .and()
				    	.body("name", equalTo("Leanne Graham"))
					.and()
				    	.body("username", equalTo("Bret"))
				    .and()
				    	.body("email", equalTo("Sincere@april.biz"))
					.and()
				    	.body("address.street", equalTo("Kulas Light"))
					.and()
				    	.body("address.suite", equalTo("Apt. 556"))
					.and()
				    	.body("address.city", equalTo("Gwenborough"))
					.and()
				    	.body("address.zipcode", equalTo("92998-3874"))
					.and()
			    		.body("address.geo.lat", equalTo("-37.3159"))
		    		.and()
			    		.body("address.geo.lng", equalTo("81.1496"))
					.and()
			    		.body("phone", equalTo("1-770-736-8031 x56442"))
		    		.and()
			    		.body("website", equalTo("hildegard.org"))	
					.and()
			    		.body("company.name", equalTo("Romaguera-Crona"))
		    		.and()
			    		.body("company.catchPhrase", equalTo("Multi-layered client-server neural-net"))
					.and()
			    		.body("company.bs", equalTo("harness real-time e-markets"))
				    ;    		
		  }

		
		@Test(priority = 3 ) 
		public void logRespondsTimeOnGettingAllUsers() {
		    Response response = RestAssured.post("https://jsonplaceholder.typicode.com/users");
		    long timeInMilliSeconds = response.time();
		    System.out.println("Responds time , POST 'https://jsonplaceholder.typicode.com/users' is: " + timeInMilliSeconds + " in MilliSeconds");
		}
		
       
}
 