package in.ashok.it;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

   public static void main(String[] args) {
	
	   ApplicationContext ctxt = new ClassPathXmlApplicationContext("Beans.xml");
	   
	   
	   ATM atm = ctxt.getBean(ATM.class);
	   atm.withdraw();
}
}
