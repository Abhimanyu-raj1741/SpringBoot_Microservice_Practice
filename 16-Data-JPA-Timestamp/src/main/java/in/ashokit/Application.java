package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.Service.ProductService;
import in.ashokit.entity.Product;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext cntxt=  SpringApplication.run(Application.class, args);
		
		ProductService  pro=cntxt.getBean(ProductService.class);
		
		pro.saveProduct();
		
		
	}

}
