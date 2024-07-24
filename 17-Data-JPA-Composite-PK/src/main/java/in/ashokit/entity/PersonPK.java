package in.ashokit.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;

@Embeddable    // the class contain the variable mapped to Primary key Column 
public class PersonPK {

	private Integer personId;
	private String  passportNum;
	public Integer getPersonId() {
		return personId;
	}
	public void setPersonId(Integer personId) {
		this.personId = personId;
	}
	public String getPassportNum() {
		return passportNum;
	}
	public void setPassportNum(String passportNum) {
		this.passportNum = passportNum;
	}
	@Override
	public String toString() {
		return "PersonPK [personId=" + personId + ", passportNum=" + passportNum + "]";
	}
	
	
}
