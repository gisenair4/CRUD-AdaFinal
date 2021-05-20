package DAO;

import org.springframework.data.repository.CrudRepository;

import model.Representative;

public interface RepresentativeDAO extends CrudRepository<Representative, Long> {

	public void save(String nameRepre, String lastNameRepre, String typeDocumentation, String numberDocumentation,
			String positionRepre, String email);
}
