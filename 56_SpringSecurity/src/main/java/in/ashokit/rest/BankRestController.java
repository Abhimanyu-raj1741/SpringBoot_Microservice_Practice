package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankRestController {
    
	
	
	@GetMapping("/about")
	public String about() {
		
		
		return "We are in the banking since 2000";
	}
	
	
	@GetMapping("/contact")
	public String contactUs() {
		
		return "plz call :: +91-9985396677";
	}
	
	@GetMapping("/deposite")
	public String deposit()
	{
		
		return "Deposite Success...";
	}
	
	@GetMapping("/withdraw")
	public String withDraw() {
		
		
		return "withDraw Successfully";
	}
}
