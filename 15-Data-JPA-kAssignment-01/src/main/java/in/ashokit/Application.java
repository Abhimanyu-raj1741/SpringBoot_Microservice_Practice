package in.ashokit;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import in.ashokit.entity.*;
import in.ashokit.PerService.*;
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
		
		PersonService prs = context.getBean(PersonService.class);
		
		//prs.SavePerson();
		//prs.FindByID(101);
		
		 //prs.toCheck(101);
		 //prs.checkHowMany();
		 // prs.FindByMethods();
		  prs.callCustomQueries();
		 
	}

}
