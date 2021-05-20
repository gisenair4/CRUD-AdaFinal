package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DAO.UserDAO;
import model.User;

@Service
public class UserImplements implements UserServices {

	@Autowired
	private UserDAO userDAO;

	@Override
	public User get(long idUser) {
		return userDAO.findById(idUser).get();
	}

	@Override
	public List<User> getAll() {
		return (List<User>) userDAO.findAll();
	}

	@Override
	public void post(User user) {

		userDAO.save(user);
	}

	@Override
	public void put(User user, long idUser) {

		userDAO.findById(idUser).ifPresent((x) -> {
			user.setIdUser(idUser);
			userDAO.save(user);
		});
	}

	@Override
	public void delete(long idUser) {

		userDAO.deleteById(idUser);
	}

	@Override
	public void put(User user, String email, String nameUser, String password) {

		user.setEmail(email);
		user.setNameUser(nameUser);
		user.setPassword(password);
		userDAO.save(email, nameUser, password);
	}

}
