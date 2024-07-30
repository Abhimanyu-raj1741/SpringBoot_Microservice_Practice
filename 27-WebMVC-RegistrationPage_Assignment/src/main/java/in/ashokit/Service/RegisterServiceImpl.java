package in.ashokit.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import in.ashokit.Repo.*;
import in.ashokit.entity.Register;

@Service
public class RegisterServiceImpl implements RegisterService  {
     
    @Autowired
	private RegRepo regrepo;
	
	public boolean IsRegister(Register R)
	{
		Register reg = regrepo.save(R);
		
		return reg.getRid()!=null;
	}
	
	
	public List<Register> Register_dtls(){
		
		return regrepo.findAll();
	}
	
}
