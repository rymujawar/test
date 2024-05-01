package restTest;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;



public class GetandPost {
	//@Test
	public void get() {
		baseURI="https://reqres.in/api";
		given().
		get("/users?page=2").
		then().
		statusCode(200).
		body("data[1].first_name", equalTo("Lindsay")).
		body("data.first_name", hasItems("George"));
	}
@Test
public void testPost() {
	Map<String, Object> map=new HashMap<String, Object>();
	/*map.put("name", "Riyaj");
	map.put("job", "IAS");
	System.out.println(map);*/
//			OR
	JSONObject request= new JSONObject(); //4 hashmap, org.json, pojo, external json.
	request.put("name", "Riyaj");
	request.put("job", "IAS");
	System.out.println(request.toJSONString());
	baseURI="https://reqres.in/api";
	given().header("Content-type","application/json")
	.contentType(ContentType.JSON).accept(ContentType.JSON).
	body(request.toJSONString()).
	when().
	post("/users").
	then().statusCode(201).log().all();
}
}
