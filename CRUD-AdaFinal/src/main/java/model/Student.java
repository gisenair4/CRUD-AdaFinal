package model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "student")
public class Student {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "namestudent", nullable = false, length = 100)
	private String nameStudent;
	@Column(name = "lastnamestudent", nullable = false, length = 100)
	private String lastNameStudent;

	@Column(name = "gender", nullable = false, length = 20)
	private String gender;
	@NotNull
	private Date dateOfBirth;
	@Column(name = "homeadress", nullable = false, length = 100)
	private String homeAddress;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNameStudent() {
		return nameStudent;
	}

	public void setNameStudent(String nameStudent) {
		this.nameStudent = nameStudent;
	}

	public String getLastNameStudent() {
		return lastNameStudent;
	}

	public void setLastNameStudent(String lastNameStudent) {
		this.lastNameStudent = lastNameStudent;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

}
