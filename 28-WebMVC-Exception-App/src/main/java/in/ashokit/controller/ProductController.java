package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {
	
   @GetMapping("/product")
   public String getProduct() {
	   
	   try {
		   // logic
		   throw new ProductNotFoundException("Invalid Data");
	   }
	   catch (Exception e)
	   {
		   // loggers
	   }
	   
	   
	   return "index";
   }
}
