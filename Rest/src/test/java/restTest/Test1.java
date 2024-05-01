package restTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.matcher.RestAssuredMatchers.*;

import io.restassured.response.Response;

public class Test1 {
	@Test
public void test1() {
	
	Response response =	get("https://reqres.in/api/users?page=2");
	System.out.println("StatusCode:"+response.getStatusCode());
	System.out.println("Response Time:"+response.getTime());
	System.out.println("Response Body:"+response.getBody().asString());
	System.out.println("Response StatusLine:"+response.getStatusLine());
	System.out.println("Response Header:"+response.getHeader("content-type"));
	int statuscode=response.getStatusCode();
	Assert.assertEquals(statuscode, 200);
	}
	@Test
	public void test2()
	{
		baseURI="https://reqres.in/api";
			
		given()
		.get("/users?page=2")
		.then()
		.statusCode(200)
		.body("data[1].id", equalTo(8))
		.log().all();
	}
}
