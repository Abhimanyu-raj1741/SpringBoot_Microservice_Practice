package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
public class DemoRestController {
  
	@GetMapping("/data")
	@CircuitBreaker(fallbackMethod="getDataFromDB",name="abhi")
	public String getDataFromRedis() {
		
		System.out.println("Redis() - method executed......");
		
		// logic to connect with redis
		int i=10/0;
		
		return "Data fetched from the Redis Server";
	}
	
	public String getDataFromDB(Throwable t) {
		System.out.println("******** db() - method executed.......");
		
		// logic to connect with DB
		
		return "Data Fetched From DB Server";
	}
}
