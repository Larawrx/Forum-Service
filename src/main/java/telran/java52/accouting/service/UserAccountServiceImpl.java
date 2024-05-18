package telran.java52.accouting.service;

import java.util.stream.Stream;

import org.modelmapper.ModelMapper;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import telran.java52.accounting.dao.UserRepository;
import telran.java52.accouting.dto.RolesDto;
import telran.java52.accouting.dto.UserDto;
import telran.java52.accouting.dto.UserEditDto;
import telran.java52.accouting.dto.UserRegisterDto;



@Service
@RequiredArgsConstructor
public class UserAccountServiceImpl implements UserAccountService {
   
	final UserRepository userRepository;
	final ModelMapper modelMapper ;
	
	@Override
	public UserDto register(UserRegisterDto userRegisterDto) {
		//регистр это новый аккаунт
		 // Проверка входных данных
//        if (userRegisterDto == null) {
//            throw new IllegalArgumentException("UserRegisterDto cannot be null");
//        }
//
//        if (userRegisterDto.getFirstName() == null || userRegisterDto.getPassword() == null) {
//            throw new IllegalArgumentException("Username and Password cannot be null");
//        }
//
////        // Проверка уникальности логина пользователя
////        Stream<User> existingUser = userRepository.findByUsername(userRegisterDto.getFirstName());
////        if (existingUser.isPresent()) {
////            throw new IllegalArgumentException("Username already exists");
////        }
//
//        // Создание нового пользователя
//        User user = modelMapper.map(userRegisterDto, User.class);
//        // Зашифровать пароль перед сохранением
////        user.setPassword(passwordEncoder.encode(userRegisterDto.getPassword()));
//
//        // Сохранение нового пользователя в базе данных
//        User savedUser = userRepository.save(user);
//
//        // Преобразование объекта пользователя в объект UserDto
//        UserDto userDto = modelMapper.map(savedUser, UserDto.class);
//
//        // Вернуть объект UserDto
//        return userDto;
		return null;
    }

	

	@Override
	public UserDto getUser(String login) {
		User user = userRepository.findById(login).orElseThrow(UserNotFoundException::new);
		 UserDto userDto = modelMapper.map(user, UserDto.class);
		return userDto;
	}

	@Override
	public UserDto removeUser(String login) {
	User user = userRepository.findById(login).orElseThrow(UserNotFoundException::new);
		userRepository.deleteById(login);
	return modelMapper.map(login, UserDto.class);
	}

	@Override
	public UserDto updateUser(String login, UserEditDto userEditDto) {
		User user = userRepository.findById(login).orElseThrow(UserNotFoundException::new);
		String lastName = userEditDto.getLastName();
		if (lastName !=null) {
			user.setName(lastName);
		}
		String firsName = userEditDto.getFirstName();
		if (firsName != null) {
			user.setName(firsName);
		}
		user = userRepository.save(user);
		return modelMapper.map(user, UserDto.class);
	}

	@Override
	public RolesDto changeRolesList(String login, String role, boolean isAddRole) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void changePassword(String login, String newPassword) {
		// TODO Auto-generated method stub

	}

}
