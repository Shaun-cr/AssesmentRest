package TakeAway.AssesmentRest;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Test_GetUsersRestService {
  @Test
  public void testIsReturningARequest() {
	    given().
	    when().
	        get("https://jsonplaceholder.typicode.com/users").
	    then().
	        assertThat().
	        statusCode(200).
	        and().
	        body("id",hasSize(10));
	        		
  }
}
