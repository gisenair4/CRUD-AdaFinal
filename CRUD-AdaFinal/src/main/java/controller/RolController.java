package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Rol;
import service.RolImplements;

@RestController
public class RolController {

	@Autowired
	RolImplements rolServices;

	@GetMapping("/rol")
	public List<Rol> getAllRol() {
		return rolServices.getAll();

	}

	@GetMapping("/rol/{id}")
	public Rol getOne(@PathVariable(value = "id") long id) {
		return rolServices.get(id);
	}

	@PostMapping("/rol")
	public void add(Rol rol) {
		rolServices.post(rol);
	}

	@PutMapping("/rol/{id}")
	public void update(Rol rol, @PathVariable(value = "id") long id) {
		rolServices.put(rol, id);
	}

	@DeleteMapping("/rol/{id}")
	public void delete(@PathVariable(value = "id") long id) {
		rolServices.delete(id);
	}
}
