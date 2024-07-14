package in.ashokit;
import java.io.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
   public static void main(String[] args)
   {
	   ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	   PwdService pwd1 = context.getBean(PwdService.class);
	   
//	   PwdService pwd2 = context.getBean(PwdService.class);
//	   
//	   System.out.println(pwd1.hashCode());
//	   System.out.println(pwd2.hashCode());
//	   String encodedPwd = pwd1.encryptPwd("abc@123");
//	   System.out.println(" Encode Password ::" + encodedPwd);
	   Engine engine = context.getBean(Engine.class);
	   engine.doWork();
	   ConfigurableApplicationContext ca= (ConfigurableApplicationContext)context;
	   ca.close();
   }
}
