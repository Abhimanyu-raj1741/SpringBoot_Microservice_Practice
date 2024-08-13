package in.ashokit.filter;

import java.util.List;
import java.util.Set;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

@Component
public class MyFilter implements GlobalFilter {

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		// TODO Auto-generated method stub
		System.out.println("Filter () - executed....");
		ServerHttpRequest request = exchange.getRequest();
		HttpHeaders headers = request.getHeaders();
		Set<String> keySet = headers.keySet();
		
		// validate request
		//boolean isValid = true;
	    
		/*
		 * if(!isValid) { throw new RuntimeException("Invalid Request"); }
		 */
		// if token comes in header then only we sent the request 
		if(!keySet.contains("tokens")) {
			throw new RuntimeException("Invalid Request");
		}
	    List<String> list = headers.get("tokens");
		
	    if(!list.get(0).equals("abhi@123")) {
	    	throw new RuntimeException("Invalid Token");
	    }
		
//		keySet.forEach(key->{
//			List<String> values =headers.get(key);
//			System.out.println(key + " :: " + values);
//		});
		System.out.println("-----------------------------");
		return chain.filter(exchange);
		
	}
}
