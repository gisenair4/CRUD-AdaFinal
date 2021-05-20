package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DAO.StudentDAO;
import model.Student;

@Service
public class StudentImplements implements StudentServices {

	@Autowired
	private StudentDAO studentDAO;

	@Override
	public Student get(long id) {

		return studentDAO.findById(id).get();

	}

	@Override
	public List<Student> getAll() {
		return (List<Student>) studentDAO.findAll();
	}

	@Override
	public void post(Student student) {

		studentDAO.save(student);
	}

	@Override
	public void put(Student student, long id) {

		studentDAO.findById(id).ifPresent((x) -> {
			student.setId(id);
			studentDAO.save(student);
		});
	}

	@Override
	public void delete(long id) {

		studentDAO.deleteById(id);
	}

}
