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
@Table(name = "organization")
public class Organization {

	@Id
	@Column(name = "idorganization")
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long idOrganization;

	@Column(name = "nameorganization", nullable = false, length = 45)
	private String nameOrganization;

	@Column(name = "cuil", nullable = false, length = 40)
	private String cuil;
	@Column(name = "adessorganization", nullable = false, length = 40)
	private String adressOrganization;
	@Column(name = "category", nullable = false, length = 40)
	private String category;
	@NotNull
	private Date yearFuntion;
	@Column(name = "telephone", nullable = false, length = 40)
	private String telephone;
	private Boolean approved;

	public Long getIdOrganization() {
		return idOrganization;
	}

	public void setIdOrganization(Long idOrganization) {
		this.idOrganization = idOrganization;
	}

	public String getNameOrganization() {
		return nameOrganization;
	}

	public void setNameOrganization(String nameOrganization) {
		this.nameOrganization = nameOrganization;
	}

	public String getCuil() {
		return cuil;
	}

	public void setCuil(String cuil) {
		this.cuil = cuil;
	}

	public String getAdressOrganization() {
		return adressOrganization;
	}

	public void setAdressOrganization(String adressOrganization) {
		this.adressOrganization = adressOrganization;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Date getYearFuntion() {
		return yearFuntion;
	}

	public void setYearFuntion(Date yearFuntion) {
		this.yearFuntion = yearFuntion;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Boolean getApproved() {
		return approved;
	}

	public void setApproved(Boolean approved) {
		this.approved = approved;
	}

}
