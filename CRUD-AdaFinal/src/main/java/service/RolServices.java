package service;

import java.util.List;

import model.Rol;

public interface RolServices {

	public Rol get(long id);

	public List<Rol> getAll();

	public void post(Rol rol);

	public void put(Rol rol, long id);

	public void delete(long id);

}
