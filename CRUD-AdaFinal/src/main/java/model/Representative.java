package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "representative")
public class Representative {

	@Id
	@Column(name = "idrepresentation")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idRepresentation;

	@Column(name = "namerepre", nullable = false, length = 100)
	private String nameRepre;

	@Column(name = "lastnamerepre", nullable = false, length = 100)
	private String lastNameRepre;

	@Column(name = "typedocumentatio", nullable = false, length = 30)
	private String typeDocumentation;

	@Column(name = "numberdocumentation", nullable = false, length = 30)
	private String numberDocumentation;

	@Column(name = "positionrepre", nullable = false, length = 30)
	private String positionRepre;
	@Column(name = "email", nullable = false, length = 100)
	private String email;

	public Long getIdRepresentation() {
		return idRepresentation;
	}

	public void setIdRepresentation(Long idRepresentation) {
		this.idRepresentation = idRepresentation;
	}

	public String getNameRepre() {
		return nameRepre;
	}

	public void setNameRepre(String nameRepre) {
		this.nameRepre = nameRepre;
	}

	public String getLastNameRepre() {
		return lastNameRepre;
	}

	public void setLastNameRepre(String lastNameRepre) {
		this.lastNameRepre = lastNameRepre;
	}

	public String getTypeDocumentation() {
		return typeDocumentation;
	}

	public void setTypeDocumentation(String typeDocumentation) {
		this.typeDocumentation = typeDocumentation;
	}

	public String getNumberDocumentation() {
		return numberDocumentation;
	}

	public void setNumberDocumentation(String numberDocumentation) {
		this.numberDocumentation = numberDocumentation;
	}

	public String getPositionRepre() {
		return positionRepre;
	}

	public void setPositionRepre(String positionRepre) {
		this.positionRepre = positionRepre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
