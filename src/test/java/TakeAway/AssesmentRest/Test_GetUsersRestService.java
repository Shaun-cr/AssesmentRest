package TakeAway.AssesmentRest;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Test_GetUsersRestService {
	
		@Test
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
}
