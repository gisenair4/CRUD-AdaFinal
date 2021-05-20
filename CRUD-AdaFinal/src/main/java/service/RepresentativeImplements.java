package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DAO.RepresentativeDAO;
import model.Representative;

@Service
public class RepresentativeImplements implements RepresentativeService {

	@Autowired
	private RepresentativeDAO representativeDAO;

	@Override
	public Representative get(long idRepresentation) {
		return representativeDAO.findById(idRepresentation).get();
	}

	@Override
	public List<Representative> getAll() {
		return (List<Representative>) representativeDAO.findAll();
	}

	@Override
	public void post(Representative representative) {

		representativeDAO.save(representative);

	}

	@Override
	public void put(Representative representative, long idRepresentation) {

		representativeDAO.findById(idRepresentation).ifPresent((x) -> {
			representative.setIdRepresentation(idRepresentation);
			representativeDAO.save(representative);
		});
	}

	@Override
	public void delete(long idRepresentation) {

		representativeDAO.deleteById(idRepresentation);
	}

	@Override
	public void put(Representative representative, String nameRepre, String lastNameRepre, String typeDocumentation,
			String numberDocumentation, String positionRepre, String email) {

		representative.setNameRepre(lastNameRepre);
		representative.setNameRepre(lastNameRepre);
		representative.setTypeDocumentation(typeDocumentation);
		representative.setNumberDocumentation(numberDocumentation);
		representative.setPositionRepre(positionRepre);
		representative.setEmail(email);
		representativeDAO.save(nameRepre, lastNameRepre, typeDocumentation, numberDocumentation, positionRepre, email);
	}

}
