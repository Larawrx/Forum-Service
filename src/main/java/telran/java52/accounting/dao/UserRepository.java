package telran.java52.accounting.dao;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import telran.java52.accouting.model.Role;



public interface UserRepository extends MongoRepository<User, String> {
	//hw
	Stream<User> findById();
	
	Stream<User> findByUsername(String login);
	
	Stream <User> findByRolesIn(Enum<Role> role);

	//	Optional<UserDto> findById();
	
	}

