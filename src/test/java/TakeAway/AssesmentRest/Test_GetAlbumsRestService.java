package TakeAway.AssesmentRest;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Test_GetAlbumsRestService {
  @Test
  public void testIsReturningARequest() {
	    given().
	    when().
	        get("https://jsonplaceholder.typicode.com/albums").
	    then().
	        assertThat().
	        statusCode(200).
	        and().
	        body("id",hasSize(100));
	        		
  }
}