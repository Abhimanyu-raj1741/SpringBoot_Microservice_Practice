package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.service.QuoteService;
 
// not working lecture 55 webnvc
@Controller
public class ProductsController {
    
	@Autowired
	private QuoteService service;
	
	
	@GetMapping("/")
    public String index(Model model) {
    	
    	service.getProducts();
    	return "rs";
    }
}

