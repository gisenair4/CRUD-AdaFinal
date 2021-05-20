package DAO;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import model.User;

public interface UserDAO extends JpaRepository<User, Long> {

	Optional<User> findByNameUser(String nameUser);

	Boolean existByNameUser(String nameUser);

	Boolean existByEmail(String email);

	public void save(String email, String nameUser, String password);
}
