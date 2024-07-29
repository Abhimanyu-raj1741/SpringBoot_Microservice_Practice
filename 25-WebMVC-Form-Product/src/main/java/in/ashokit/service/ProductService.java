package in.ashokit.service;
import java.util.List;

import in.ashokit.entity.*;
public interface ProductService {

	 public boolean saveProduct(Product p );
	 public List<Product> getAllProducts();
}
