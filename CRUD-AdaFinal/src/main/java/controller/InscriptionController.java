package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Inscription;
import service.InscriptionImplements;

@RestController
public class InscriptionController {
	@Autowired
	InscriptionImplements inscriptionService;

	@GetMapping("inscription")
	public List<Inscription> getAllInscription() {
		return inscriptionService.getAll();
	}

	@GetMapping("/inscription/{idInscription}")
	public Inscription getOne(@PathVariable(value = "idInscription") long idInscription) {
		return inscriptionService.get(idInscription);

	}

	@PostMapping("/inscription")
	public void add(Inscription inscription) {
		inscriptionService.post(inscription);
	}

	@PutMapping("/inscription/{id}")
	public void update(Inscription inscription, @PathVariable(value = "idInscription") long idInscription) {
		inscriptionService.put(inscription, idInscription);
	}

	@DeleteMapping("/inscription/{idInscription}")
	public void delete(@PathVariable(value = "idInscription") long idInscription) {
		inscriptionService.delete(idInscription);
	}
}
