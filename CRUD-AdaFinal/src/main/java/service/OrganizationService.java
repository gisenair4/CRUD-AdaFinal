package service;

import java.util.Date;
import java.util.List;

import model.Organization;

public interface OrganizationService {

	public Organization get(long idOrganization);

	public List<Organization> getAll();

	public void post(Organization organization);

	public void put(Organization organization, long idOrganization);

	public void put(Organization organization, String nameOrganization, String cuil, String adressOrganization,
			String category, Date yearFuntion, String telephone);

	public void delete(long idOrganization);

}
