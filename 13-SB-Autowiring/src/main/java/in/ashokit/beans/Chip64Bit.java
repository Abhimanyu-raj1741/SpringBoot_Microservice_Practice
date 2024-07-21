package in.ashokit.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("chip64")
@Primary
public class Chip64Bit implements IChip {

	public Chip64Bit() {
		System.out.println("64Bit Chip :: Constructor");
	}
	
	@Override
	public boolean process() {
		// TODO Auto-generated method stub
		System.out.println("Chip64bit processing started....");
        return true;
	}

}
