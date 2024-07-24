package in.ashokit.PerService;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import in.ashokit.PerRepo.PersonRepo;
import in.ashokit.entity.Person;

@Service
public class PersonService {

	private PersonRepo perRepo;

	public PersonService(PersonRepo perRepo) {
		// TODO Auto-generated constructor stub
		this.perRepo = perRepo;

	}
	
   
	public void callCustomQueries() {
		//List<Person> ps = perRepo.getAllEmpsHQL();
		//Person pr = perRepo.getPerById(102);
		//System.out.println(pr);
		List<Person> ps = perRepo.getAllPerSQL();
		ps.forEach(System.out::println);
		
	}
	
	/*
	public void toCheck(Integer id) {
		Boolean ans = perRepo.existsById(id);
		if (ans) {
			System.out.println(" The data is Found");
		} else {
			System.out.println("The Data is not Found");
		}
	}

	public void FindByMethods() {
		// List<Person> ps = perRepo.findByPname("Abhimanyu Kumar");
		List<Person> ps = perRepo.findByPgender("Female");
		ps.forEach(System.out::println);
	}

	public void checkHowMany() {
		int count = (int) perRepo.count();
		System.out.println("There is total Record are  " + count);
	}

	
	  public void FindByID(Integer id) {
	  
	  Optional<Person> ps= perRepo.findById(id);
	  
	  if(ps.isPresent()) { System.out.println("Record Found"); 
	  Person pp =ps.get(); System.out.println(pp); } else {
	 System.out.println("Record Not Found"); } }
	  
	  public void SavePerson() { 
		  Person p1 = new
	  Person(101,"Abhimanyu Kumar","Male","04/10/1999"); 
		  Person p2 = new Person(102,"Sneha Pandey","Female","05/05/1999");
		  Person p3 = new Person(103,"Maya Devi","Female","04/11/1999");
		  Person p4 = new Person(104,"Roshan Kumar","Male","02/10/1999");
	  
	  List<Person> ps = Arrays.asList(p1,p2,p3,p4);
	  
	  perRepo.saveAll(ps); System.out.println(" Person Data are saved ");
	  
	  }
	 */
	
}
