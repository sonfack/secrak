package vn.edu.ifi.secrak.service.user;

import java.util.List;

import vn.edu.ifi.secrak.entity.User;

public interface UserService {

	User saveUser(User user);
	
	User updateUser(User user);
	
	void deletUser(User user);

	User getUserById(Long id);

    User getUserByLogin(String login);

	List<User> getAllUser();

	void setUserLogin(User user, String login); 
	
	void setUserPassword(User user, String password);
	
	String getUserPassword(String login);
}
