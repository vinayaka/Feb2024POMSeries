package restassured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;

public class DynamicJson {
	
	@Test
	public void AddBook()
	{
		RestAssured.baseURI="http://126.10.245.166";
		given().header("content Type","application/json").
		body(DEFAULT_BODY_ROOT_PATH)
	}
}
