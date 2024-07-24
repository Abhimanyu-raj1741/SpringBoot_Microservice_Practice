package in.ashokit.Service;

import java.lang.StackWalker.Option;
import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import in.ashokit.repo.*;
import in.ashokit.entity.*;
@Service
public class PersonService {
    
	@Autowired
	private PersonRepo perrepo;
	
	@Autowired
	private PassportRepo passrepo;
	
	public void getPerson() {
		perrepo.findById(1);
		
	}
	
	public void savePerson() {
		Person p = new Person();
		p.setName("Marsh");
		p.setGender("Male");
		
		Passport pp = new Passport();
		pp.setPassportNum("TPSXQP5345");
		pp.setIssueDate(LocalDate.now());
		pp.setExpDate(LocalDate.now().plusYears(10));
		
		// associating person with passport
		p.setPassport(pp);
		
		//  associating passport with person 
		pp.setPerson(p);
		
		
		// saving person record (parent)  
		// when we save the parent along with the parent child will also save
		// no need to call save method to two records 
		perrepo.save(p);
		
		
	}
}
