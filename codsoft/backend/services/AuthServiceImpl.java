package codsoft.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import codsoft.backend.dtos.SignupRequest;
import codsoft.backend.dtos.UserDTO;
import codsoft.backend.models.User;
import codsoft.backend.repositories.UserRepository;

@Service
public class AuthServiceImpl implements AuthService {
	
	@Autowired
	private UserRepository userRepository;
	
	
	@Override
	public UserDTO createUser(SignupRequest signupRequest) {
		   User user = new User();
	        user.setName(signupRequest.getName());
	        user.setEmail(signupRequest.getEmail());
	        user.setPassword(new BCryptPasswordEncoder().encode(signupRequest.getPassword()));
	        User createdUser = userRepository.save(user);
	        UserDTO userDTO = new UserDTO();
	        userDTO.setId(createdUser.getId());
	        userDTO.setEmail(createdUser.getEmail());
	        userDTO.setName(createdUser.getName());
	        return userDTO;
	    }
	
	}


