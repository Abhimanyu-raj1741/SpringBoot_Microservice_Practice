package in.ashokit.service;

import in.ashokit.PersonRepo;
import in.ashokit.entity.*;import jakarta.persistence.Id;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    
	@Autowired
	private PersonRepo personrepo;
	
	public PersonService(PersonRepo personrepo) {
		// TODO Auto-generated constructor stub
		this.personrepo=personrepo;
	}
	
	public void getPerson() {
		
		PersonPK pks = new PersonPK();
		pks.setPersonId(101);
		pks.setPassportNum("QWXP2135YU");
		Optional<Person> findById = personrepo.findById(pks);
		
		if(findById.isPresent()) {
			Person person = findById.get();
			System.out.println(person);
		}
		else 
		{
			System.out.println("Record not found ");
		}
	}
	
	public void savePerson() {
		PersonPK pks = new PersonPK();
		pks.setPersonId(101);
		pks.setPassportNum("QWXP2135YU");
		
		Person p = new Person();
		p.setName("Abhimayu Kumar");
		p.setEmail("abhimanyu.raj1741@gmail.com");
		p.setGender("Male");
		
		p.setPersonPk(pks);
		
		personrepo.save(p);
		
		System.out.println("Person Saved...");
		
	
		
	}
	
}
