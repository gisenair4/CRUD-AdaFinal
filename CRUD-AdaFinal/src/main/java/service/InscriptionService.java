package service;

import java.util.List;

import model.Inscription;

public interface InscriptionService {
	public Inscription get(long idInscription);

	public List<Inscription> getAll();

	public void post(Inscription inscription);

	public void put(Inscription inscription, long idInscription);

	public void delete(long idInscription);

	public Boolean put(Inscription inscription, boolean scholarship, boolean scholarshipCategory,
			double porcentScholarShip);
}
