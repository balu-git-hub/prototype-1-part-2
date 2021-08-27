package com.vitasoft.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;

import org.springframework.stereotype.Component;

@Entity
@Component
public class UserDetails {
	
	 @Id
	 @Column
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Integer id;
	 
	@Size(min = 3 , max = 20)
	@NotBlank
	@Column
	private String firstName;
	
	@Column
	private String lastName;
	
	@Column
	private String middleName;
	
	@NotBlank
	@Column
	private String address;

	@NotBlank
	@Column
	private String country;
	
	@NotBlank
	@Column
	private String state;
	
	@NotBlank
	@Column
	@Size(min = 6,max = 6, message = "postal code must be 6 digits")
	private String zipcode;
	
	@Email(message = "please enter a valid e-mail address")
	@NotBlank
	@Column
	private String email;
	
	@NotBlank
	@Size(min = 10,max = 10, message = "number must be 10 digits")
	@Column
	private String phoneNumber;
	
	
	@NotBlank
	@Column
	private String userName;
	
	@NotBlank
	@Column
	private String passWord;
	
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public @NotBlank @Size(min = 6, max = 6) String getZipcode() {
		return zipcode;
	}
	public void setZipcode(@NotBlank @Size(min = 6, max = 6) String zipcode) {
		this.zipcode = zipcode;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(@NotBlank @Size(min = 10, max = 10) String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	@Override
	public String toString() {
		return "UserDetails [firstName=" + firstName + ", lastName=" + lastName + ", middleName=" + middleName
				+ ", address=" + address + ", country=" + country + ", state=" + state + ", zipcode=" + zipcode
				+ ", email=" + email + ", phoneNumber=" + phoneNumber + ", userName=" + userName + ", passWord="
				+ passWord + "]";
	}

	
	
	

}
