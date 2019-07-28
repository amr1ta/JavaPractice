package apiMethods;
import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestGetMethod {

	
	@Test
	void getWeatherDetails() {
		
		
		//Specify base URI
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
		
		
		//Request object
		RequestSpecification httpRequest = RestAssured.given();
		
		
		//Response Object
		Response response = httpRequest.request(Method.GET,"/Bangalore");
		
		
		//print response body in console
		String responseBody = response.getBody().asString();
		System.out.println("Response body is: " + responseBody);
		
		
		//Validate response code
		
		int responseCode = response.getStatusCode();
		System.out.println("response code is: " +responseCode);
		Assert.assertEquals(responseCode, 200);
		
		//Print response statusLine
		
		System.out.println("response status line is: "+ response.getStatusLine());
	}
}
