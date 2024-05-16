package telran.java52.accouting.service;



import telran.java52.accouting.dto.RolesDto;
import telran.java52.accouting.dto.UserDto;
import telran.java52.accouting.dto.UserEditDto;
import telran.java52.accouting.dto.UserRegisterDto;
import telran.java52.post.service.PostService;

public interface UserAccountService {
	
	
	UserDto register(UserRegisterDto userRegisterDto);

	UserDto getUser(String login);

	UserDto removeUser(String login);

	UserDto updateUser(String login, UserEditDto userEditDto);

	RolesDto changeRolesList(String login, String role, boolean isAddRole);

	void changePassword(String login, String newPassword);
	

}
