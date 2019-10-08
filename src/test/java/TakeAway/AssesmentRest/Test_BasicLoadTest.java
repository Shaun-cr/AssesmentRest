package TakeAway.AssesmentRest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

public class Test_BasicLoadTest {
	
	@Test(invocationCount = 100, threadPoolSize = 5)
	  public void getAlbumsBasicLoadTest() {
		  
		  	System.out.printf("%n[START] Thread Id : %s is started!", Thread.currentThread().getId());
		  
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
			
			System.out.printf("%n[END] Thread Id : %s", Thread.currentThread().getId());
	  }

}
