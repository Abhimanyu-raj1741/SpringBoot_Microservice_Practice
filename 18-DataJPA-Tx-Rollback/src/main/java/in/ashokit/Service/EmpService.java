package in.ashokit.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.Repo.*;
import in.ashokit.entity.Address;
import in.ashokit.entity.Emp;
import jakarta.transaction.Transactional;

@Service
public class EmpService {
	
	@Autowired
	private EmpRepo emprepo;

	@Autowired
    private AddressRepo addrRepo;
	
	@Transactional(rollbackOn=Exception.class) // it will maintain the atomicity
	//if any Exception occur in method then you roll back the transaction 
	// either all should be executed or none should be executed
	public void saveEmp() {
		Emp e = new Emp();
		e.setName("Shila");
		e.setSalary(5000.00);
		
		Emp savedEmp = emprepo.save(e); // saving emp data
		System.out.println(savedEmp);
		//------------------First Query------------------------
		
		int i =10/0;  // it will create an error  so ,that the second query will not execute
		// so,it break the rule of atomcity 
		
	
		
		Address addr = new Address();
		addr.setCity("Gardwa");
		addr.setCountry("India");
		addr.setState("Jharkhand");
		addr.setEid(savedEmp.getEid());
		
		addrRepo.save(addr); // saving address data 
		//-------------------Second Query---------------------
		
	}
	

}
