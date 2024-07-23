package in.ashokit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	
		@Id
		private Integer eid;
		private String ename;
		private Double esalary;
		
		// When we are going for entity classes this constructor is mandatory
		public Employee() {
			// TODO Auto-generated constructor stub
		}
		// without this default constructor  application will not work 
		// JPA  will check for zero param constructor in the entity 
		
		public Employee(Integer eid, String ename, Double esalary) {
			
			this.eid = eid;
			this.ename = ename;
			this.esalary = esalary;
		}
		public Integer getEid() {
			return eid;
		}
		public void setEid(Integer eid) {
			this.eid = eid;
		}
		public String getEname() {
			return ename;
		}
		public void setEname(String ename) {
			this.ename = ename;
		}
		public Double getEsalary() {
			return esalary;
		}
		public void setEsalary(Double esalary) {
			this.esalary = esalary;
		}
		@Override
		public String toString() {
			return "Emplyee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + "]";
		}
		
		
		
	}

