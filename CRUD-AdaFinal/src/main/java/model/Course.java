package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "course")
public class Course {

	@Id
	@Column(name = "idcourse")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCourse;

	@Column(name = "namecourse", nullable = false, length = 45)
	private String nameCourse;

	@Column(name = "modalitycourse", nullable = false, length = 45)
	private String modalityCourse;

	@NotNull
	private Float cost;
	@NotNull
	private int hours;
	@Column(name = "category", nullable = false, length = 45)
	private String category;
	@NotNull
	private int enrolled;
	@NotNull
	private int scholarshipsNumber;

	private Organization organization;
	private Boolean open;

	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public Boolean getOpen() {
		return open;
	}

	public void setOpen(Boolean open) {
		this.open = open;
	}

	public Long getIdCourse() {
		return idCourse;
	}

	public void setIdCourse(Long idCourse) {
		this.idCourse = idCourse;
	}

	public String getNameCourse() {
		return nameCourse;
	}

	public void setNameCourse(String nameCourse) {
		this.nameCourse = nameCourse;
	}

	public String getModalityCourse() {
		return modalityCourse;
	}

	public void setModalityCourse(String modalityCourse) {
		this.modalityCourse = modalityCourse;
	}

	public Float getCost() {
		return cost;
	}

	public void setCost(Float cost) {
		this.cost = cost;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getEnrolled() {
		return enrolled;
	}

	public void setEnrolled(int enrolled) {
		this.enrolled = enrolled;
	}

	public int getScholarshipsNumber() {
		return scholarshipsNumber;
	}

	public void setScholarshipsNumber(int scholarshipsNumber) {
		this.scholarshipsNumber = scholarshipsNumber;
	}

	public Course(String nameCourse, String modalityCourse, Float cost, int hours, String category, int enrolled,
			int scholarshipsNumber) {
		super();
		this.nameCourse = nameCourse;
		this.modalityCourse = modalityCourse;
		this.cost = cost;
		this.hours = hours;
		this.category = category;
		this.enrolled = enrolled;
		this.scholarshipsNumber = scholarshipsNumber;
	}

	public Course() {
		super();
	}

}
