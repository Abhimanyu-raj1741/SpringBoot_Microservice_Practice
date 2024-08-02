package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class DemoController {
	
	@GetMapping("/welcome")
	public String welcome(Model model) {
		
		model.addAttribute("msg","This is for JSp ");
		return "index";
	}

}
