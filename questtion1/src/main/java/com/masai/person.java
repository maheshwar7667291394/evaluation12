package com.masai;

import java.util.Objects;

public class person {
	
	private Integer person_id;
	private String name ;
	private String email ;
	private int age;
	private String mobile;
	
	@Override
	public int hashCode() {
		return Objects.hash(age, email, mobile, name, person_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		person other = (person) obj;
		return age == other.age && Objects.equals(email, other.email) && Objects.equals(mobile, other.mobile)
				&& Objects.equals(name, other.name) && Objects.equals(person_id, other.person_id);
	}

	public person() {}

	public person(Integer person_id, String name, String email, int age, String mobile) {
		super();
		this.person_id = person_id;
		this.name = name;
		this.email = email;
		this.age = age;
		this.mobile = mobile;
	}

	public Integer getPerson_id() {
		return person_id;
	}

	public void setPerson_id(Integer person_id) {
		this.person_id = person_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "person [person_id=" + person_id + ", name=" + name + ", email=" + email + ", age=" + age + ", mobile="
				+ mobile + "]";
	}
	
	 
	
	

}
