package org.rimtelecom.services;

import java.util.List;

import org.rimtelecom.dtos.UserAddDTO;
import org.rimtelecom.dtos.UserInfoDTO;
import org.rimtelecom.entities.User;

/**
 * @author Amine HANANE
 *
 */
public interface UserService {

	UserInfoDTO addUser(UserAddDTO user);

	User getUser(long idUser);

	List<User> getAllUsers();
}
