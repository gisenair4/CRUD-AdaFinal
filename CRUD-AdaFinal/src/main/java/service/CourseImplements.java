package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import DAO.CourseDAO;
import model.Course;

public class CourseImplements implements CourseServices {
	@Autowired
	private CourseDAO courseDAO;

	@Override
	public Course get(long id) {
		return courseDAO.findById(id).get();
	}

	@Override
	public List<Course> getAll() {
		return (List<Course>) courseDAO.findAll();
	}

	@Override
	public void post(Course course) {

		courseDAO.save(course);
	}

	@Override
	public void put(Course course, long idCourse) {

		courseDAO.findById(idCourse).ifPresent((x) -> {

			course.setIdCourse(idCourse);
			courseDAO.save(course);

		});
	}

	@Override
	public void delete(long idCourse) {

		courseDAO.deleteById(idCourse);
	}

}
