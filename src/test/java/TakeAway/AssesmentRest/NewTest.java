package TakeAway.AssesmentRest;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class NewTest {
  @Test
  public void testGetAlbumsHas100Records() {
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
