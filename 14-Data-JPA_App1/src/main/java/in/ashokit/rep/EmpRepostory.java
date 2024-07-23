package in.ashokit.rep;
import in.ashokit.entity.Employee;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepostory extends CrudRepository<Employee,Integer>{
	
	@Query("from Employee")
    public List<Employee> getAllEmpsHQL();  // HQL Query
	
	@Query("from Employee where eid = :id")
	public Employee getEmpById(Integer id);  // HQL Query
	
	@Query(value = "select * from employee",nativeQuery = true)
	// nativeQuery is specify that it is SQL query simple plain query
	
	public List<Employee> findByEname(String ename);
	
	// select * from employee where ename =: ename
	//public List<Employee> findByEname(String ename);
	
	// select * from employee where esalary =: esalary
	public List<Employee> findByEsalary(Double salary);
	
	// select * from employee where esalary >= : esalary 
	public List<Employee> findByEsalaryGreaterThanEqual(Double salary);
	
	
}
