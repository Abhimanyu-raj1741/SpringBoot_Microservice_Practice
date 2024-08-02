package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import in.ashokit.bindin.User;

@Controller
public class UserController {

	
	@GetMapping("/")
	public String loadForm(Model model) {
		model.addAttribute("user",new User());
		return "index";
	}
	
	@GetMapping("/user")
	public String handleSubmit(User user ,Model model) {
		
		System.out.println(user);
		model.addAttribute("msg","User saved");
		return "index";
	}
	
}
