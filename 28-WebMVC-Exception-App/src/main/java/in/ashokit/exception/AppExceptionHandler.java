package in.ashokit.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import in.ashokit.controller.ProductNotFoundException;

@ControllerAdvice
public class AppExceptionHandler {
	
	@ExceptionHandler(value = ProductNotFoundException.class)
    public String handleProductEx(ProductNotFoundException pne)
    {
	    //logic 
		
		return "exView";
		
    }
	 
	
	
	
     // it become global exception handle
	 @ExceptionHandler(value =Exception.class) // for all type of exception 
	    public String handleException(Exception e,Model model) {
	        
		 
	    	model.addAttribute("msg","Some Exception Occur  ");
	    	
	    	return "exView";
	    }
}
