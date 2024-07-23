package in.ashokit.service;


import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import in.ashokit.entity.*;
import in.ashokit.repo.EmpRepo;
import java.util.*;

@Service
public class EmpService {

	private EmpRepo emprepo;
	
	public EmpService(EmpRepo repo) {
		// TODO Auto-generated constructor stub
		this.emprepo=repo;
	}
	public void getAllEmpsWithFilter() {
		
		Employee entity =  new Employee();
		
		// if emp name comes from ui 
		entity.setEsalary(20000.3);
		// entity.setEname("Ram"); we can use more than one entity for filteration 
		Example<Employee> example = Example.of(entity);
	    List<Employee> emps  = emprepo.findAll(example);
		
		emps.forEach(e -> System.out.println(e));
	}
	public void getAllEmpsPagination() {
		int pageSize=3;   // fixed value
		int pageNumber=1;  // will come from UI 
		
		PageRequest pg = PageRequest.of(pageNumber-1,pageSize);
		
        Page<Employee> page = emprepo.findAll(pg);
        
		List<Employee> emps  = page.getContent();
		
		emps.forEach(e -> System.out.println(e));
	}
	public void getAllEmpsSort()
	{
		Sort sort = Sort.by("ename","esalary").descending();
		List<Employee> emps = emprepo.findAll(sort);
		
		emps.forEach(System.out::println);
		
	}
	
	public void FindAll() {
		List<Employee> emps = emprepo.findAll();
		
		emps.forEach(e -> System.out.println(e));
		//emps.forEach(System.out::println);
		 
	}
	
}
