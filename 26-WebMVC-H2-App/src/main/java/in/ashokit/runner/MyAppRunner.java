package in.ashokit.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import in.ashokit.entity.Contact;
import in.ashokit.repo.ContactRepo;

@Component
public class MyAppRunner implements ApplicationRunner {
  
	@Autowired
	private ContactRepo repo;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		Contact c1 = new Contact();
		c1.setName("John");
		c1.setPhno((long)32234561);
		
		Contact c2 = new Contact();
		c2.setName("Bratin");
		c2.setPhno((long)23232323);
	}
}
