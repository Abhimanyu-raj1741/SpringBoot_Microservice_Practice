package in.ashokit.Dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import com.mysql.cj.jdbc.Driver;
public class BookDaoImpl implements BookDao {
    
	private JdbcTemplate jdbctemplate;
	
    DriverManagerDataSource das;
     
      
	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}

	@Override
	public boolean save() {
		// TODO Auto-generated method stub
		String sql="insert into book values(3,'HTML,CSS',8000)";
		jdbctemplate.execute(sql);
		return true ;
	}

}
