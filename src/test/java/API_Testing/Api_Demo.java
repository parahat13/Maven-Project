package API_Testing;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;




public class Api_Demo {
	
	
	@Test
	public void test1() {
		RestAssured.baseURI="https://maps.googleapis.com";
		
		given()
		.param("location", "-33.8670522,151.1957362")
		.param("radius", "500")
		.param("Key", "AIzaSyATVwC8t3exEOYxXS4JgMSDeVxdXVRxSO8")
		.when()
		 .get("/maps/api/place/nearbysearch/json")
		.then().assertThat().statusCode(200);
		
		
	}

}
