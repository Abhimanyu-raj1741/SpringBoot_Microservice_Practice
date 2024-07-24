package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.Service.PersonService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	 ConfigurableApplicationContext	cntxt = SpringApplication.run(Application.class, args);
	 PersonService prs = cntxt.getBean(PersonService.class);
	 
	 
//	 prs.savePerson();
//	 System.out.println("Record Inserted Succesfully...");
	 
	prs.getPerson();
	}

}
