package DAO;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import model.Course;

public interface CourseDAO extends CrudRepository<Course, Long> {

	List<Course> findByOpenTrue();

	List<Course> findByCategory();

	List<Course> findBymodalityCourse();

	List<Course> findBynameCourseStartingWith(String category);

}
