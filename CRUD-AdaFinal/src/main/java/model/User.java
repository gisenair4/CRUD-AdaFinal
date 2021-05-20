package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

	@Id
	@Column(name = "iduser")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUser;

	@Column(name = "email", nullable = false, length = 40)
	private String email;
	@Column(name = "nameuser", nullable = false, length = 100)
	private String nameUser;
	@Column(name = "password", nullable = false, length = 100)
	private String password;

	public User() {

	}

	public User(String nameUser, String email, String password) {
		this.nameUser = nameUser;
		this.email = email;
		this.password = password;
	}

	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNameUser() {
		return nameUser;
	}

	public void setNameUser(String nameUser) {
		this.nameUser = nameUser;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
