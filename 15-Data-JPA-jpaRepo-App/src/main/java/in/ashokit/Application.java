package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Employee;
import in.ashokit.service.EmpService;


@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext  context =	SpringApplication.run(Application.class, args);
	 
	EmpService eps = context.getBean(EmpService.class);  // always we are creating target class object
	//eps.FindAll();
	//eps.getAllEmpsSort();
	 // eps.getAllEmpsPagination();
	   eps.getAllEmpsWithFilter();
	}

}
