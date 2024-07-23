package in.ashokit;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Employee;
import in.ashokit.service.EmpService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context =  SpringApplication.run(Application.class, args);
		
		EmpService empService =context.getBean(EmpService.class);
		
		//empService.saveEmployee();
		//empService.saveEmps();
		//empService.getEmp(101);
		//empService.getEmps(Arrays.asList(101,102,103));
		//empService.getAllEmps();
		//empService.AllFindByMethods();
		 empService.callCaustomeQueries();
	     
	}

}
