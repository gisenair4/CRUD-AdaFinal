package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DAO.InscriptionDAO;
import model.Inscription;

@Service
public class InscriptionImplements implements InscriptionService {
	@Autowired
	private InscriptionDAO inscriptionDAO;

	@Override
	public Inscription get(long idInscription) {
		return inscriptionDAO.findById(idInscription).get();
	}

	@Override
	public List<Inscription> getAll() {
		return (List<Inscription>) inscriptionDAO.findAll();
	}

	@Override
	public void post(Inscription inscription) {

		inscriptionDAO.save(inscription);
	}

	@Override
	public void put(Inscription inscription, long idInscription) {

		inscriptionDAO.findById(idInscription).ifPresent((x) -> {
			inscription.setIdInscription(idInscription);
			inscriptionDAO.save(inscription);
		});
	}

	@Override
	public void delete(long idInscription) {

		inscriptionDAO.deleteById(idInscription);
	}

	@Override
	public Boolean put(Inscription inscription, boolean scholarship, boolean scholarshipCategory,
			double porcentScholarShip) {
		inscription.setScholarship(scholarship);
		inscription.setScholarshipCategory(scholarshipCategory);
		inscription.setPorcentScholarShip(porcentScholarShip);
		inscriptionDAO.save(scholarship, scholarshipCategory, porcentScholarShip);
		return true;

	}

}
