package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Course;
import service.CourseImplements;

@RestController
public class CourseController {

	@Autowired
	CourseImplements courseService;

	@GetMapping("/courses")

	public List<Course> getAllCourse() {
		return courseService.getAll();

	}

	@GetMapping("/course/{idCourse}")
	public Course getOne(@PathVariable(value = "idCourse") long idCourse) {
		return courseService.get(idCourse);

	}

	@PostMapping("/course")
	public void add(Course course) {
		courseService.post(course);
	}

	@PutMapping("/course/{idCourse}")
	public void update(Course course, @PathVariable(value = "idCourse") long idCourse) {
		courseService.put(course, idCourse);
	}

	@DeleteMapping("/course/{idCourse}")
	public void delete(@PathVariable(value = "idCourse") long idCourse) {
		courseService.delete(idCourse);
	}
}
