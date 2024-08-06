package in.ashokit.service;

import in.ashokit.binding.Passenger;
import in.ashokit.binding.Ticket;
import java.util.*;

public interface TicketService {

	public Ticket bookTicket(Passenger passenger);
	
	public Ticket getTicket(Integer ticket);
	
	public List<Ticket> getTicket();
}
