package in.ashokit.PerRepo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import in.ashokit.entity.Person;
public interface PersonRepo extends JpaRepository<Person,Integer> {
 
	  // Custom Queries  -> 1) SQL 2) HQL 
	
	  // Here are HQL 
	  // here method name is not important 
      @Query("from Person")  // main query
	    public List<Person> getAllEmpsHQL();
       
      @Query("from Person where pid=:it  ")
       public Person getPerById(Integer it);
      
      // Here are SQL 
      @Query(value ="select * from Person where pgender='Female'",nativeQuery=true)
      public List<Person> getAllPerSQL();
	
	   
	
	
	// This is SQL query 
	// select * from Person where pname= :pname
	//public List<Person> findByPname(String pname);
	
	// select * from Person where pgender =:pgender
     // Here method name is important   
	public List<Person> findByPgender(String pgender);

}
