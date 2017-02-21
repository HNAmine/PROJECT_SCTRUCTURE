package org.rimtelecom.services.implementation;

import java.util.List;

import org.rimtelecom.dtos.UserAddDTO;
import org.rimtelecom.dtos.UserInfoDTO;
import org.rimtelecom.entities.User;
import org.rimtelecom.repositories.UserRepository;
import org.rimtelecom.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImplementation implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public UserInfoDTO addUser(UserAddDTO user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUser(long idUser) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
