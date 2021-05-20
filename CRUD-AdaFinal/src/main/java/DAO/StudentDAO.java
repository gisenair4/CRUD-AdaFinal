package DAO;

import org.springframework.data.repository.CrudRepository;

import model.Student;

public interface StudentDAO extends CrudRepository<Student, Long> {

}
