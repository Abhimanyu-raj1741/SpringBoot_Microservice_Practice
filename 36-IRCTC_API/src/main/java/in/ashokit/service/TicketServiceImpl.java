package in.ashokit.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import in.ashokit.binding.Passenger;
import in.ashokit.binding.Ticket;
import in.ashokit.repo.TicketRepo;

@Service
public class TicketServiceImpl implements TicketService {
   
	@Autowired
	private TicketRepo ticketRepo;
	
	@Override
	public Ticket bookTicket(Passenger passenger) {
		// TODO Auto-generated method stub
		Ticket t = new Ticket();
		BeanUtils.copyProperties(passenger,t);
		// it is converting the passenger data to ticket object 
		t.setTicetStatus("Confirmed");
		
		Ticket savedTicket = ticketRepo.save(t);
		
		return savedTicket;
	}

	@Override
	public Ticket getTicket(Integer ticketid) {
		// TODO Auto-generated method stub
	   return ticketRepo.findById(ticketid).orElseThrow();
	}

	@Override
	public List<Ticket> getTicket() {
		// TODO Auto-generated method stub
		
		return ticketRepo.findAll();
	}

}
