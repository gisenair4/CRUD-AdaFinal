package service;

import java.util.List;

import model.Student;

public interface StudentServices {

	public Student get(long id);

	public List<Student> getAll();

	public void post(Student student);

	public void put(Student student, long id);

	public void delete(long id);

}
