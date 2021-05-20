package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DAO.RolDAO;
import model.Rol;

@Service
public class RolImplements implements RolServices {
	@Autowired
	private RolDAO rolDAO;

	@Override
	public Rol get(long id) {
		return rolDAO.findById(id).get();
	}

	@Override
	public List<Rol> getAll() {
		return (List<Rol>) rolDAO.findAll();
	}

	@Override
	public void post(Rol rol) {
		rolDAO.save(rol);
	}

	@Override
	public void put(Rol rol, long id) {

		rolDAO.findById(id).ifPresent((x) -> {
			rol.setId(id);
			rolDAO.save(rol);
		});
	}

	@Override
	public void delete(long id) {

		rolDAO.deleteById(id);
	}

}