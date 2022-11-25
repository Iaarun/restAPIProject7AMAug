package baseTest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

import io.restassured.RestAssured;
import utils.ExtentreportListeners;

@Listeners(ExtentreportListeners.class)
public class BaseTest extends ExtentreportListeners {

	@BeforeClass
	public void baseTest() {
		 RestAssured.baseURI= "https://reqres.in";	
	}
}
