package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rol")
public class Rol {

	@Id
	@Column(name = "idrol")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idRol;
	private NameRol nameRol;

	public Rol() {

	}

	public Rol(NameRol nameRol) {

	}

	public Long getIdRol() {
		return idRol;
	}

	public void setId(Long id) {
		this.idRol = id;
	}

}
