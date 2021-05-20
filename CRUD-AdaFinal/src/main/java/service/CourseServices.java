package service;

import java.util.List;

import model.Course;

public interface CourseServices {
	public Course get(long id);

	public List<Course> getAll();

	public void post(Course course);

	public void put(Course course, long id);

	public void delete(long id);

}
