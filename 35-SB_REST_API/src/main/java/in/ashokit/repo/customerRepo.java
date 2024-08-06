package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import in.ashokit.binding.*;
public interface customerRepo extends JpaRepository<Customer,Integer> {

}
