package in.ashokit.generators;

import java.sql.Connection;
import java.sql.Statement;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class OrderIdFGenerator implements IdentifierGenerator{

	@Override
	public Object generate(SharedSessionContractImplementor session, Object object) {
		// TODO Auto-generated method stub
		String prefix="OD";
		String suffix ="";
		
		
		return prefix+suffix;
	}
}
