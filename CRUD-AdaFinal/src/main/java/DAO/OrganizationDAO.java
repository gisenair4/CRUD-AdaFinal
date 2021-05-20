package DAO;

import java.util.Date;

import org.springframework.data.repository.CrudRepository;

import model.Organization;

public interface OrganizationDAO extends CrudRepository<Organization, Long> {

	public void save(String nameOrganization, String cuil, String adressOrganization, String category, Date yearFuntion,
			String telephone);
}
