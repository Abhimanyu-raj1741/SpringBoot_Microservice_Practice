package in.ashokit.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import in.ashokit.dao.UserDao;



@Service
public class UserService {
  
	@Autowired
	private UserDao userDao;
	// so as you can see we are doing field injection 
	// and IOC container violating the OPS principal by accessing the private variable from
	// so , its not recommended to use field injection 
	// so IOC use reflection for access private variable 
	
	
	
	
	// @Autowired
	// This is setter Injection of dependent class UserDao to UserService Target Class
	/*
	 * public void setUserDao(UserDao userDao) {
	 * System.out.println("SetUserDao() -- called....."); this.userDao = userDao; }
	 */
	/*
	 * public UserService() { // TODO Auto-generated constructor stub // so,if we
	 * don't mention the @Autowire annotation then it is IOC will use the //default
	 * Constructor then it will create null Pointer Exception
	 * System.out.println("UserService::default - Constructor");
	 * 
	 * }
	 */
	/*
	 * @Autowired // if it is only one parameterize constructor then we don't have
	 * to write @Autowire Annotation // if there is more than two parameterize
	 * Constructor then we have to use @AutoWired public UserService(UserDao
	 * userDao) { // TODO Auto-generated constructor stub
	 * System.out.println("UserService ::param Constructor"); this.userDao =
	 * userDao; // dependency } // *** This is Setter method Dependency Injection
	 * 
	 */
	public void getName(int id)
	{
		String findName = userDao.findName(100);
		System.out.println("Name :: "+ findName);
	}
}
