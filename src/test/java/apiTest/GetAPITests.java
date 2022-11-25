package apiTest;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import apiconfig.APIEndpoints;
import apivalidation.APIValidation;
import baseTest.BaseTest;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class GetAPITests extends BaseTest {
	
	@Test
	public void getListUser() {
		//RestAssured.baseURI = "https://reqres.in";

		Response response = given()
				.when()
				.get(APIEndpoints.apiEndpoints.LIST_USER)
				.then()
				.extract()
				.response();

		

		APIValidation.validateStatuscode(response, 200);
		
		//Assert.assertTrue(response.getHeader("Content-Type").contains("application/json"));

//	   JsonPath jpath=	response.jsonPath();
//	    String email= jpath.get("data[1].email");
//	    System.out.println(email);
//	    Assert.assertEquals(email, "lindsay.ferguson@reqres.in");
	}
	
	@Test
	public void getListUserwithParameter() {

		Response response = given()
				.when()
				.queryParam("page", 1)
				.get(APIEndpoints.apiEndpoints.LIST_USER_WITH_PARAMETER)
				.then()
				.extract()
				.response();
		
		System.out.println(response.asPrettyString());
		APIValidation.validateStatuscode(response, 200);
	}

}
