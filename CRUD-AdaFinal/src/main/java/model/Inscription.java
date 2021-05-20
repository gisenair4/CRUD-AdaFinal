package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "inscription")
public class Inscription {

	@Id
	@Column(name = "idinscrption")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idInscription;

	private Boolean scholarship;
	private Boolean scholarshipCategory;
	private double porcentScholarShip;

	public Long getIdInscription() {
		return idInscription;
	}

	public void setIdInscription(Long idInscription) {
		this.idInscription = idInscription;
	}

	public Boolean getScholarship() {
		return scholarship;
	}

	public void setScholarship(Boolean scholarship) {
		this.scholarship = scholarship;
	}

	public Boolean getScholarshipCategory() {
		return scholarshipCategory;
	}

	public void setScholarshipCategory(Boolean scholarshipCategory) {
		this.scholarshipCategory = scholarshipCategory;
	}

	public double getPorcentScholarShip() {
		return porcentScholarShip;
	}

	public void setPorcentScholarShip(double porcentScholarShip) {
		this.porcentScholarShip = porcentScholarShip;
	}

}
