package telran.java52.accounting.dao;

import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import telran.java52.accouting.dto.UserDto;
import telran.java52.student.model.Student;

public interface UserRepository extends MongoRepository<User, String> {
	//hw
//	Stream<UserDto> findById();
//	
//	Stream<User> findByUsername(String login);
	Optional<UserDto> findById();
	
	}

