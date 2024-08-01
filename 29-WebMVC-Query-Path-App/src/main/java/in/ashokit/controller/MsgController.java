package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MsgController {
  
	// Query Parameter 
	@GetMapping("/welcome")
	@ResponseBody  // if we pass url like http://localhost:8080/welcome?name=Abhi
	public String welcomeMethod(@RequestParam("name")String name)
	{
		return name + ", Welcome to Abhi Website";
	}
	
	
	// Path Parameter
	@GetMapping("/greet/{name}")  // link should look like this http://localhost:8080/greet/Abhi
	public String greetMethod(@PathVariable("name")String name , Model model)
	{
		model.addAttribute("msg",name +", Good Morning ");
		return "index";
	}
}
