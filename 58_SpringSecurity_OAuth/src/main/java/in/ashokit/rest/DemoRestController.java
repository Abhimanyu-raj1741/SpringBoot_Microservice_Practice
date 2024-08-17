package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
 
	@GetMapping("/")
	public String welcome() {
		
		return "Welcome to Ashok IT";
	}
}
