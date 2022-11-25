package apibuilder;

import java.util.HashMap;
import java.util.Map;

public class RequestPayLoad {
	
public String registerUserUserPayload() {
		
		return "{\r\n"
				+ "    \"email\": \"eve.holt@reqres.in\",\r\n"
				+ "    \"password\": \"pistol\"\r\n"
				+ "}";
	}
	
public String registerUserUserPayload(String email, String password) {
	
	return "{\r\n"
			+ "    \"email\": \""+email+"\",\r\n"
			+ "    \"password\": \""+password+"\"\r\n"
			+ "}";
}


  public Map<String, String> createUserPayLoad(String name, String job) {
	  Map<String, String> createUserPayload = new HashMap<String, String>();
  
     createUserPayload.put("name", name);
     createUserPayload.put("job", job);
     
     return createUserPayload;
  }

}
