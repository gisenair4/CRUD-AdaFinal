package DAO;

import org.springframework.data.repository.CrudRepository;

import model.Inscription;

public interface InscriptionDAO extends CrudRepository<Inscription, Long> {

	public void save(boolean scholarship, boolean scholarshipCategory, double porcentScholarShip);
	// List<Inscription> findByFinishedTrue();

	// List<Inscription> findByFinishedFalse();

	// List<Inscription> findByWhitScholarshipTrue();

	// List<Inscription> findByStudent(Student student);

}
