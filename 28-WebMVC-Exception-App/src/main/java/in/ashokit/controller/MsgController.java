package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MsgController {
	
    @GetMapping("/welcome")
	public String getWelcome(Model model) {
    	
    	int i =10/0;
		model.addAttribute("msg","Welcome to AbhiWebsite");
		
		return "index";
	}
    
   // @ExceptionHandler(value =ArithmeticException.class)// for only divide by zero exception
    @ExceptionHandler(value =Exception.class) // for all type of exception 
    public String handleException(Exception e,Model model) {
    	
    	model.addAttribute("msg","Some Exception Occur  ");
    	
    	return "exView";
    }
}
