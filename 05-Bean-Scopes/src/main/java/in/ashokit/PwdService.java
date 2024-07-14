package in.ashokit;

import java.util.Base64;
import java.util.Base64.Encoder;

public class PwdService {
	public PwdService() {
		// TODO Auto-generated constructor stub
		System.out.println(" PwdService :: Constructor ");
	}
  
 public String encryptPwd(String pwd) {
	 
	Encoder encoder =Base64.getEncoder();
	byte[] encodedPwd = encoder.encode(pwd.getBytes());
	
	return new String(encodedPwd);
 }
}
