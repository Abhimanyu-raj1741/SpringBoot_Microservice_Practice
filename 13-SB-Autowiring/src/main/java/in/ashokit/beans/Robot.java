package in.ashokit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Robot {
   
	public Robot() {
		// TODO Auto-generated constructor stub
		System.out.println("Robot :: Constructor ");
	}
	// What we can do here we can declare it like 
	// private IChip chip64 -- This is ByType 
	// by giving bean name we will identify the particular bean 
	// and solve the ambiguity problem 
	// This is ByType 
	
	
	// so there is another way we can use instead of changing the name everywhere we can 
	// This is BYName
	@Autowired
	//@Qualifier("chip64") // By Name 
	private IChip chip;
	
	public void doWork() {
		System.out.println("Injected :: "+chip.getClass().getName());
		
		boolean status = chip.process();
		if(status) {
			System.out.println("Robot is working........");
		}
		else 
		{
			System.out.println("Robot is having fault........");
		}
	}
}
