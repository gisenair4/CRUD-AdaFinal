package service;

import java.util.List;

import model.Representative;

public interface RepresentativeService {

	public Representative get(long idRepresentation);

	public List<Representative> getAll();

	public void post(Representative representative);

	public void put(Representative representative, long idRepresentation);

	public void delete(long idRepresentation);

	public void put(Representative representative, String nameRepre, String lastNameRepre, String typeDocumentation,
			String numberDocumentation, String positionRepre, String email);

}
