package in.ashokit.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class QuoteService {

	
	public void getProducts() {
		
		String apiurl="https://api.restful-api.dev/objects/";
		
		RestTemplate rt = new RestTemplate();// it is a predefined class available in webMVC
		
		ResponseEntity<String> Res =rt.getForEntity(apiurl,String.class );
		
		int value = Res.getStatusCode().value();
		
		if(value==200) {
			String body=Res.getBody();
		System.out.println(body);
		
		}
		
	}
}
