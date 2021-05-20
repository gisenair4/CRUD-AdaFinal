package service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DAO.OrganizationDAO;
import model.Organization;

@Service
public class OrganizationImplements implements OrganizationService {

	@Autowired

	private OrganizationDAO organizationDAO;

	@Override
	public Organization get(long idOrganization) {
		return organizationDAO.findById(idOrganization).get();
	}

	@Override
	public List<Organization> getAll() {
		return (List<Organization>) organizationDAO.findAll();
	}

	@Override
	public void post(Organization organization) {
		organizationDAO.save(organization);
	}

	@Override
	public void put(Organization organization, long idOrganization) {

		organizationDAO.findById(idOrganization).ifPresent((x) -> {
			organization.setIdOrganization(idOrganization);
			organizationDAO.save(organization);
		});

	}

	@Override
	public void delete(long idOrganization) {

		organizationDAO.deleteById(idOrganization);
		// Log.info("Organization delete");
	}

	@Override
	public void put(Organization organization, String nameOrganization, String cuil, String adressOrganization,
			String category, Date yearFuntion, String telephone) {
		organization.setNameOrganization(nameOrganization);
		organization.setCuil(cuil);
		organization.setAdressOrganization(adressOrganization);
		organization.setCategory(category);
		organization.setYearFuntion(yearFuntion);
		organization.setTelephone(telephone);
		organizationDAO.save(nameOrganization, cuil, adressOrganization, category, yearFuntion, telephone);

	}

}
