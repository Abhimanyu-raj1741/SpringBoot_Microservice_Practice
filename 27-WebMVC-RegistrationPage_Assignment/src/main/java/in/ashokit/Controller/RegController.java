package in.ashokit.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import in.ashokit.Service.RegisterService;

import in.ashokit.entity.Register;

@Controller
public class RegController {
    
	@Autowired
	private RegisterService regservice;
	
	@GetMapping("/")
	public ModelAndView loadForm() {
		
		ModelAndView mav= new ModelAndView();
		mav.addObject("robj",new Register());
		mav.setViewName("index");
		
		return mav;
	}
	
	@PostMapping("/success")
	public ModelAndView saveForm(Register robj) {
		ModelAndView mav = new ModelAndView();

		boolean status = regservice.IsRegister(robj);
		if (status) {
			mav.addObject("smsg", "Registeration Successfull.....");
		} else {
			mav.addObject("emsg", "Registeration Failed......");
		}

		
		mav.setViewName("success");
		return mav;
	}
	@PostMapping("/login")
	public ModelAndView loginForm() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("login");
		return mav;
	}
	
	
}
