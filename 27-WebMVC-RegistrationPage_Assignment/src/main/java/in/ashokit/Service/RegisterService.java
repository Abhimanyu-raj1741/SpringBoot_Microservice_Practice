package in.ashokit.Service;
import java.util.List;
import in.ashokit.entity.*;
public interface  RegisterService {
   
	public boolean IsRegister(Register R);
	
	public List<Register> Register_dtls();
}
