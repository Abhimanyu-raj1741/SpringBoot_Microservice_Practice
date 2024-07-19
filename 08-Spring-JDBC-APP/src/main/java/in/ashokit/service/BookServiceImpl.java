package in.ashokit.service;

import org.springframework.jdbc.datasource.DriverManagerDataSource;
import in.ashokit.Dao.BookDao;

public class BookServiceImpl implements BookService {
    
	private BookDao bookdao;
    
	public void setBookdao(BookDao bookdao) {
		this.bookdao = bookdao;
	}
    
    
	@Override
	public void saveBook() {
		// TODO Auto-generated method stub
       boolean status =  bookdao.save();
       if(status)
    	   System.out.println(" Record Inserted....");
       else
    	   System.out.println(" Insertion Failed....");
      }
}