package in.ashokit.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.repo.*;
import in.ashokit.binding.*;

@Service
public class customerService {
 
	
	private customerRepo cusRepo;
	
	public customerService(customerRepo cusRepo) {
		// TODO Auto-generated constructor stub
		this.cusRepo=cusRepo;
		
	}
	
	
	public void SaveRecord(Customer d) {
		
		Customer e = cusRepo.save(d);
		System.out.println("Record Saved");
		System.out.println(e);
	}
	public String DeleteRecord(Integer id ) {
		
		if(cusRepo.existsById(id)) {
			cusRepo.deleteById(id);
			
			return (String)(id + "Delete Successfully");
		}
		else 
		{
			return "Delete Not Successfully";
		}
	}
	
}
