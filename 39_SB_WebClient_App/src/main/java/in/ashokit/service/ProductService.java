package in.ashokit.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import in.ashokit.binding.Product;
import reactor.core.publisher.Mono;

@Service
public class ProductService {
	
	
	public Mono<Product> getProductNew(){
		
		String url="https://api.restful-api.dev/objects/2";
		WebClient web = WebClient.create();
		
		return web.get().uri(url).retrieve().bodyToMono(Product.class);
	
	}
	

	public Mono<String> getProduct(String pid)
	{
		String url="https://api.restful-api.dev/objects/2";
		
		WebClient web = WebClient.create();
		
		web.post()
		.uri(url)
		.body(null)
		.retrieve()
		.bodyToMono(String.class);
		
		Mono<String> bodyToMono= web.get() // for the get request 
				.uri(url)  // from which url
				.retrieve() //  i want response from the body
				.bodyToMono(String.class);// response will store to string variable
				
		
		return bodyToMono;
		
	}
}
