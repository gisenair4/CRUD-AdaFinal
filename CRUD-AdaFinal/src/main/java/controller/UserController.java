package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import model.User;
import service.UserImplements;

@RestController
public class UserController {

	@Autowired
	UserImplements userServices;

	@GetMapping("user")
	public List<User> getAll() {
		return userServices.getAll();
	}

	@GetMapping("/user/{idUser}")
	public User getOne(@PathVariable(value = "idUser") long idUser) {
		return userServices.get(idUser);
	}

	@PostMapping("/user")
	public void add(User user) {
		userServices.post(user);
	}

	@PutMapping("/user/{idUser}")
	public void update(User user, @PathVariable(value = "idUser") long idUser) {
		userServices.put(user, idUser);
	}

	@DeleteMapping("/user/{idUser}")
	public void delete(@PathVariable(value = "idUser") long idUser) {
		userServices.delete(idUser);
	}
}
