package apiTest;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import apibuilder.RequestPayLoad;
import apiconfig.APIEndpoints;
import apiconfig.RequestHeaders;
import apivalidation.APIValidation;
import baseTest.BaseTest;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PostApiTest extends BaseTest {
	RequestPayLoad reqPayLoad = new RequestPayLoad();

	RequestHeaders reqHeader = new RequestHeaders();

	@Test
	public void registerUser() {

		Response response = given()
				.headers(reqHeader.requestHeaders())
				.body(reqPayLoad.registerUserUserPayload("eve.holt@reqres.in", "pistol")).when()
				.post(APIEndpoints.apiEndpoints.REGISTER_USER)
				.then()
				.extract()
				.response();

		System.out.println(response.asPrettyString());

		APIValidation.validateStatuscode(response, 200);

	}

	@Test
	public void _testCreateUserAPI() {

		Response response = given().headers(reqHeader.requestHeaders())
				.body(reqPayLoad.createUserPayLoad("morpheus", "leader")).post(APIEndpoints.apiEndpoints.CREATE_USER)
				.then().extract().response();
		
		APIValidation.validateStatuscode(response, 201);
		
	}
}
