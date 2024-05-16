package telran.java52.accouting.service;

import org.modelmapper.ModelMapper;

import telran.java52.accounting.dao.UserRepository;
import telran.java52.accouting.dto.RolesDto;
import telran.java52.accouting.dto.UserDto;
import telran.java52.accouting.dto.UserEditDto;
import telran.java52.accouting.dto.UserRegisterDto;


public class UserAccountServiceImpl implements UserAccountService {
   
	final UserRepository userRepository;
	final ModelMapper modelMapper ;
	
	@Override
	public UserDto register(UserRegisterDto userRegisterDto) {
		//регистр это новый аккаунт
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto getUser(String login) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto removeUser(String login) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto updateUser(String login, UserEditDto userEditDto) {
		// TODO Auto-generated method stub
		return null;
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
