package TakeAway.AssesmentRest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Test_BasicLoadTest extends Base{
	
	@Test(invocationCount = 10, threadPoolSize = 2)
	  public void getAlbumsBasicLoadTest() {
		  
		  	System.out.printf("%n[START] Thread Id : %s is started!", Thread.currentThread().getId());
		  
		    Response response = RestAssured.get("https://jsonplaceholder.typicode.com/users");
		    assertEquals(response.getStatusCode(), 200);
		    long timeInMilliSeconds = response.time();	
			System.out.println(timeInMilliSeconds);
			System.out.printf("%n[END] Thread Id : %s", Thread.currentThread().getId() + ", Responds time (ms) is =  " + timeInMilliSeconds);
	  }

}
