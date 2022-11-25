package apivalidation;

import org.testng.Assert;

import io.restassured.response.Response;

public class APIValidation {

	public static void validateStatuscode(Response response, int expectedcode) {
		Assert.assertEquals(response.getStatusCode(), expectedcode);
	}
}
