package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Organization;
import service.OrganizationImplements;

@RestController
public class OrganizationController {

	@Autowired
	OrganizationImplements organizationService;

	@GetMapping("/organization")
	public List<Organization> getAllOrganization() {
		return organizationService.getAll();
	}

	@GetMapping("/organization/{idOrganization}")
	public Organization getOne(@PathVariable(value = "idOrganization") long idOrganization) {
		return organizationService.get(idOrganization);

	}

	@PostMapping("/organization")
	public void add(Organization organization) {
		organizationService.post(organization);
	}

	@PutMapping("/organization/{idOrganization")
	public void update(Organization organization, @PathVariable(value = "idOrganization") long idOrganization) {
		organizationService.put(organization, idOrganization);

	}

	@DeleteMapping("/organization/{idOrganization")
	public void delete(@PathVariable(value = "idOrganization") long idOrganization) {
		organizationService.delete(idOrganization);
	}
}
