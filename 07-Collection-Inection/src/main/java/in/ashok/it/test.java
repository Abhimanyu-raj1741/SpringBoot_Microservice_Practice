package in.ashok.it;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 */
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
       Student student =  context.getBean(Student.class);
       
       System.out.println(student);
       System.out.println(student.hashCode());
	}

}
