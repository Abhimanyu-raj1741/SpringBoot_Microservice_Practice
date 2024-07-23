package in.ashokit.service;
import java.util.*;
import java.util.Arrays;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Employee;
import in.ashokit.rep.EmpRepostory;


@Service
public class EmpService {
   
	private EmpRepostory empRepo;
	
	public EmpService(EmpRepostory empRepo) {
		// TODO Auto-generated constructor stub
		this.empRepo =empRepo;
	}
	
	
	public void  callCaustomeQueries() {
		//List<Employee> emps = empRepo.getAllEmpsHQL();  // HQL Query 
		//emps.forEach(System.out::println);
		
		//Employee empById = empRepo.getEmpById(101);   // HQL Query 
		//System.out.println(empById);
		List<Employee> emps = empRepo.getAllEmpsHQL();   // SQL Query
		emps.forEach(System.out::println);
		
	}
	
	public void AllFindByMethods() {
	  //List<Employee> emps =	empRepo.findByEname("Harish_Kumar");
		List<Employee> emps =  empRepo.findByEsalaryGreaterThanEqual(30000.00);
	  emps.forEach(System.out::println);
	}
	
	public void getAllEmps() {
		Iterable<Employee> emps = empRepo.findAll();
		emps.forEach(System.out::println); // using method reference
	}
	
	public void getEmps(List<Integer> eids)
	{
		Iterable<Employee> emps = empRepo.findAllById(eids);
		
	   	emps.forEach(e -> System.out.println(e)); // using lamda 
		//emps.forEach(System.out::println);
		
		
	}
	
	public void getEmp(Integer eid) {
		Optional<Employee> findById= empRepo.findById(eid);
		// Optional class introduced in java 1.8 version 
		// it is container class in java which is used to hold the object 
		// if object will not available container will be empty either it will full 
		// To avoid null pointer exception we use optional 
		if(findById.isPresent())
		{
			Employee employee = findById.get();
			System.out.println(employee);
		}
		else {
			System.out.println(" Record not Found...");
		}
		
	}
	
	
	
	public void saveEmps() {
		Employee e1 = new Employee(201,"Ram",10000.00);
		Employee e2 = new Employee(202,"Shyam",50000.00);
		Employee e3 = new Employee(203,"Ashish",20000.00);
		Employee e4 = new Employee(204,"sunil",30000.00);
		
		List<Employee> emps = Arrays.asList(e1,e2,e3);
		empRepo.saveAll(emps);
		
		System.out.println(" The 4 items are saved......");
		
	}
	
	
	
	
	
	public void saveEmployee() {
		System.out.println(" Impl class : "+ empRepo.getClass().getName());
		
		// creating entity object
		Employee e = new Employee();
		e.setEid(105);
		e.setEname("Ayush_kumar");
		e.setEsalary(50000.30);
		
		// Inserting record based  on given object
		empRepo.save(e);
		
		System.out.println("Record Saved.....");
		
	}

}
