package service;

import java.util.List;

import model.User;

public interface UserServices {

	public User get(long id);

	public List<User> getAll();

	public void post(User user);

	public void put(User user, long idUser);

	public void put(User user, String email, String nameUser, String password);

	public void delete(long idUser);

}
