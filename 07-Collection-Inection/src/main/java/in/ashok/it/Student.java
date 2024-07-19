package in.ashok.it;


import java.util.*;

public class Student {
  
	private int  id;
	private String name;
	private List<String> courses;
	private Set<String> hobbies;
	private Map<Integer , String > data;
	public Map<Integer, String> getData() {
		return data;
	}

	public void setData(Map<Integer, String> data) {
		this.data = data;
	}

	public Student() {
		System.out.println(" Student :: Constructor");
	}
   
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}

	public Set<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(Set<String> hobbies) {
		this.hobbies = hobbies;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", courses=" + courses + ", hobbies=" + hobbies + ", data="
				+ data + "]";
	}

	
	
	 
	
	
	
	
}
