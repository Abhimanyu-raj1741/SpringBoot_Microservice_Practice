package in.ashokit;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {
	
	@GetMapping("/welcome")
	@ResponseBody
	public String welcome(Model model )
	{
		
		return "Welcome to Spring Boot";
	}

}
