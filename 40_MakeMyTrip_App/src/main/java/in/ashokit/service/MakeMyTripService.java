package in.ashokit.service;

import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import in.ashokit.binding.*;
import reactor.core.publisher.Mono;


public class MakeMyTripService {
   
	private  final String BOOK_TICKET_URL = "http://localhost:8080/ticket";
	private  final String GET_TICKET_URL = "http://localhost:8080/tickets";
	
	public Mono<Ticket> bookTicket(Passenger p) {
		
	   // logic to send post  request 
	   
		WebClient web = WebClient.create();
		
		return web.post()
		.uri(BOOK_TICKET_URL)
		.body(BodyInserters.fromValue(p))
		.retrieve()
		.bodyToMono(Ticket.class);
		
		
	}
	
	public Mono<Ticket[]> getAllTickets(){
		
		// logic to send get request 
		WebClient wb =WebClient.create();
		return wb.get()
		.uri(GET_TICKET_URL)
		.retrieve()
		.bodyToMono(Ticket[].class);
		
	   
		
	}
}
