package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Student;
import service.StudentImplements;

@RestController
public class StudentController {
	@Autowired
	StudentImplements studentService;

	@GetMapping("/students")
	public List<Student> getAllStudent() {
		return studentService.getAll();

	}

	@GetMapping("/student/{id}")
	public Student getOne(@PathVariable(value = "id") long id) {

		return studentService.get(id);
	}

	@PostMapping("/student")
	public void add(Student student) {
		studentService.post(student);
	}

	@PutMapping("/student/{id}")
	public void update(Student student, @PathVariable(value = "id") long id) {
		studentService.put(student, id);
	}

	@DeleteMapping("/student/{id}")
	public void delete(@PathVariable(value = "id") long id) {
		studentService.delete(id);

	}
}
