package servlet_basic.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PatientDto {
	@Id
	private int id;
	private String name;
	private String email;
	private String password;
	private long phonenumber;
	private String gender;
	private String country;
	private String checkbox;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCheckbox() {
		return checkbox;
	}
	public void setCheckbox(String checkbox) {
		this.checkbox = checkbox;
	}
	@Override
	public String toString() {
		return "PatientDto [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password
				+ ", phonenumber=" + phonenumber + ", gender=" + gender + ", country=" + country + ", checkbox="
				+ checkbox + "]";
	}
	
	
	

}
