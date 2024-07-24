package in.ashokit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Person {
   
	@Id
	private Integer pid;
	private String pname;
	private String pgender;
	private String pdob;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public Person(Integer pid,String pname,String pgender, String pdob) {
		
		this.pid=pid;
		this.pname=pname;
		this.pgender=pgender;
		this.pdob=pdob;
		
	}


	public Integer getPid() {
		return pid;
	}


	public void setPid(Integer pid) {
		this.pid = pid;
	}


	public String getPname() {
		return pname;
	}


	public void setPname(String pname) {
		this.pname = pname;
	}


	public String getPgender() {
		return pgender;
	}


	public void setPgender(String pgender) {
		this.pgender = pgender;
	}


	public String getPdob() {
		return pdob;
	}


	public void setPdob(String pdob) {
		this.pdob = pdob;
	}


	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", pgender=" + pgender + ", pdob=" + pdob + "]";
	}
	
	
	
	
	
	
	
	
}
