package in.ashokit.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.binding.Product;

@RestController 
public class ProductRestController {
   
	@GetMapping("/product")
	public ResponseEntity<Product> getProduct(){
		
		int i =19/0;
		Product p = new Product();
	    p.setId(1);
	    p.setName("Mouse");
	    p.setPrice(500.50);
		
		return new ResponseEntity<> (p,HttpStatus.OK);
	}
}
