package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import in.ashokit.binding.*;

@Controller
public class UserController {
     
	@GetMapping("/user")
	 public ModelAndView loadFrom() {
		 
		  ModelAndView mvc = new ModelAndView();
		  mvc.addObject("userObj", new User());
		  mvc.setViewName("index");
		  
		  
		 return mvc;
	 }
	
	@PostMapping("/user")
	public ModelAndView handleUserFromSubmit(User user) {
		
		System.out.println(user);
		// TODO : save data in DB
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg","User Details Saved ");
		mav.setViewName("success");
		
		return mav;
	}
}
