package vn.edu.ifi.secrak.service.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import vn.edu.ifi.secrak.entity.User;
import vn.edu.ifi.secrak.repository.UserRepository;

@Service
@RestController
public class UserServiceImp implements UserService {
	
	@Autowired
	private UserRepository userRepo ; 
	
	public UserServiceImp(UserRepository userRepository) {
		this.userRepo = userRepository; 
	}

	@Override
    @RequestMapping(value = "/api/secrak/save/user", method = RequestMethod.POST)
	public User saveUser(User user) {
	    return userRepo.save(user);
    }

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
    @RequestMapping(value = "/api/user/update/", method = RequestMethod.PUT)
	public void deletUser(User user) {
		//
	}

	@Override
    @RequestMapping(value = "/api/secrak/get/user/{id}", method = RequestMethod.GET)
	public User getUserById(@PathVariable Long id) {
	    return userRepo.findById(id).get();
	}

	@Override
    @RequestMapping(value = "/api/secrak/get/user/login/{login}", method = RequestMethod.GET)
    public User getUserByLogin(@PathVariable String login){
	    return userRepo.findByUserLogin(login);
    }

    @Override
	@RequestMapping(value = "/api/secrak/get/user", method = RequestMethod.GET)
	public List<User> getAllUser() {
		return userRepo.findAll();
	}

    @Override
    @RequestMapping(value = "/api/secrak/user/password{login}", method = RequestMethod.GET)
    public String getUserPassword(@PathVariable String login) {
        return userRepo.findByUserLogin(login).getUserPassword();
    }

    @Override
	public void setUserLogin(User user, String login) {
		user.setUserLogin(login);
	}

	@Override
    @RequestMapping(value = "/api/secrak/save/user/password", method = RequestMethod.PUT)
	public void setUserPassword(User user, String password) {
		user.setUserPassword(password);
	}




}
