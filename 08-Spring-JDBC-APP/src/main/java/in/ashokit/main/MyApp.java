package in.ashokit.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ashokit.service.BookService;
public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        ApplicationContext ctxt = new ClassPathXmlApplicationContext("Beans.xml");
        BookService bookService =  ctxt.getBean(BookService.class);
        
        
        bookService.saveBook();
	}

}
