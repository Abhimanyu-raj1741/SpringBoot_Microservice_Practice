package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller   // it is web component it is going to take  the request and give the response 
//for us 
public class MsgController {
   
	@GetMapping("/greet")
	public ModelAndView getMsg2() {
		
		 ModelAndView mav =  new ModelAndView();
		 mav.addObject("msg2","Good Morning....!");
		 mav.setViewName("index");
		return mav;
	}
	
	
	@GetMapping("/welcome")
	public ModelAndView getMsg1() {
		
		ModelAndView mav  = new ModelAndView();
		
		mav.addObject("msg1", "Welcome to Ashok IT");
		mav.addObject("msg3","Weclome Abhimanyu Kumar");
		mav.setViewName("index");
		
		return mav ;
		
		
	}
}
