package apiMethods;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestPostMethod {

	
	@Test
	void postRequest()
	{
		//get the uri
		RestAssured.baseURI = "https://reqres.in/api";
	
		//Request object
		RequestSpecification httpRequest = RestAssured.given();
		
		//Request payload
		JSONObject requestparams = new JSONObject();
		requestparams.put("name", "jessiPink");
		requestparams.put("job", "test");
		requestparams.put("email", "jesspink@gmail.com");
		
		httpRequest.header("Content-Type","application/json");
		httpRequest.body(requestparams.toJSONString());
		
		
		//Respone Object
		Response response = httpRequest.request(Method.POST, "/users");
		
		//print response body in console
		String responseBody = response.getBody().asString();
		System.out.println("the response body is: " +responseBody);
		
		
		//Validate response status code
		int statusCode = response.getStatusCode();
		System.out.println("status code is: " +statusCode);
		Assert.assertEquals(statusCode, 201);
		
		
		//print email from json response
		System.out.println("email id is: " + response.jsonPath().get("email"));
	
	}
}
