package TakeAway.AssesmentRest;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Test_GetAlbumsRestService {
	
  @Test
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
  
  @Test
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
  
  
  
}
