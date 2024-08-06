package in.ashokit.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.binding.Passenger;
import in.ashokit.binding.Ticket;
import in.ashokit.service.TicketService;

@RestController
public class TicketRestController {

	@Autowired
	private TicketService service;
	
	@PostMapping(value="/ticket",consumes="application/json",produces="application/json")
	public ResponseEntity<Ticket> bookTicket(@RequestBody Passenger passenger){
		
	 Ticket ticket = service.bookTicket(passenger);
	 
	 return new ResponseEntity<>(ticket,HttpStatus.CREATED);
	}
	
	@GetMapping(value="ticket/{tid}",produces="application/json")
	public ResponseEntity<Ticket> getTicket(@PathVariable("tid") Integer tid){
	 Ticket t = service.getTicket(tid);
	 
	 return new ResponseEntity<>(t,HttpStatus.OK);
	}
	
	@GetMapping(value="/ticket",produces="application/Json")
	public ResponseEntity<List<Ticket>> getAllTicket(){
		
		List<Ticket> ts = service.getTicket();
		
		return new ResponseEntity<>(ts,HttpStatus.OK);
		
	}
}
