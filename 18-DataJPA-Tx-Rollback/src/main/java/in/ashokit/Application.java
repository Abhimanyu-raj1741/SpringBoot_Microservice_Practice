package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.Service.EmpService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext cntxt = SpringApplication.run(Application.class, args);
		EmpService eps = cntxt.getBean(EmpService.class);
		
        eps.saveEmp();		
	}

}
