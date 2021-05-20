package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Representative;
import service.RepresentativeImplements;

@RestController
public class RepresentativeController {

	@Autowired
	RepresentativeImplements representativeService;

	@GetMapping("/representatives")
	public List<Representative> getAll() {
		return representativeService.getAll();
	}

	@GetMapping("/representative/{idRepresentation}")
	public Representative getOne(@PathVariable(value = "idRepresentation") long idRepresentation) {
		return representativeService.get(idRepresentation);
	}

	@PostMapping("/representative")
	public void add(Representative representative) {
		representativeService.post(representative);
	}

	@PutMapping("/representative/{idRepresentation}")
	public void update(Representative representative, @PathVariable(value = "idRepresentation") long idRepresentation) {
		representativeService.put(representative, idRepresentation);
	}

	@DeleteMapping("/representative/{idRepresentation}")
	public void delete(@PathVariable(value = "idRepresentation") long idRepresentation) {
		representativeService.delete(idRepresentation);
	}
}
