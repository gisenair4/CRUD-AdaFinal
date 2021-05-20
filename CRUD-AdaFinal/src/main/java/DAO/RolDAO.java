package DAO;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import model.NameRol;
import model.Rol;

public interface RolDAO extends JpaRepository<Rol, Long> {

	Optional<Rol> findByNameRol(NameRol nameRol);
}
