package in.ashokit;

import in.ashokit.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  PersonRepo  extends JpaRepository<Person,PersonPK>{

}
