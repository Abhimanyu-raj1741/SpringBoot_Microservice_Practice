package in.ashokit.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("chip32")

public class Chip32Bit implements IChip {
   

	public Chip32Bit() {
		// TODO Auto-generated method stub
		System.out.println("32Bit Chip :: Constructor");
	}
	@Override
	
	public boolean process() {
		System.out.println("Chip 32bit processing started......");
        return true;
	}

}
