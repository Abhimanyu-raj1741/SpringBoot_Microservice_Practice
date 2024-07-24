package in.ashokit.Service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Product;
import in.ashokit.repo.ProductRepo;

@Service
public class ProductService {
    @Autowired
	private ProductRepo prorepo;
	
	public ProductService(ProductRepo prorepo) {
		// TODO Auto-generated constructor stub
		this.prorepo= prorepo;
		
	}
	
	public void saveProduct() {
		Product p = new Product();
		// p.setPid(4);   we are not setting primary key manually it should be auto gernerated 
		// if we are doing this then it will give error , it will consider null so 
		
		p.setName("HDD");
		p.setPrice(5000.00);
		p.setCreatedDate(LocalDate.now()); // we can do like this as well but the problem is 
		// when you are doing this we have to do so many times that would be hactic
		
		
		
		prorepo.save(p);
		
		System.out.println(" Product saved.....");
		
	}
   
	
}
