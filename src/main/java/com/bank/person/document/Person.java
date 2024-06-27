package com.bank.person.document;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="person")
public class Person {
	@Id
	private String id;
	private String personType;
	private String companyName;
	private String docType;
	private String docNumber;
	private String firstName;
	private String lastName;
	private String gender;
	private String address;
	private String telephone;
	private String email;
	private Date birthday;
	private boolean isMarried;
	private boolean isActived;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPersonType() {
		return personType;
	}
	public void setPersonType(String personType) {
		this.personType = personType;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getDocType() {
		return docType;
	}
	public void setDocType(String docType) {
		this.docType = docType;
	}
	public String getDocNumber() {
		return docNumber;
	}
	public void setDocNumber(String docNumber) {
		this.docNumber = docNumber;
	}
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public boolean isMarried() {
		return isMarried;
	}
	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}
	public boolean isActived() {
		return isActived;
	}
	public void setActived(boolean isActived) {
		this.isActived = isActived;
	}
	public Person(String id, String personType, String companyName, String docType, String docNumber, String firstName,
			String lastName, String gender, String address, String telephone, String email, Date birthday,
			boolean isMarried, boolean isActived) {
		super();
		this.id = id;
		this.personType = personType;
		this.companyName = companyName;
		this.docType = docType;
		this.docNumber = docNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.address = address;
		this.telephone = telephone;
		this.email = email;
		this.birthday = birthday;
		this.isMarried = isMarried;
		this.isActived = isActived;
	}
	public Person() {
		super();
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", personType=" + personType + ", companyName=" + companyName + ", docType="
				+ docType + ", docNumber=" + docNumber + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", gender=" + gender + ", address=" + address + ", telephone=" + telephone + ", email=" + email
				+ ", birthday=" + birthday + ", isMarried=" + isMarried + ", isActived=" + isActived + "]";
	}
	
	
}
