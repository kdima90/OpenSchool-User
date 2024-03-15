package kdima90.openschool.user.service;

import kdima90.openschool.user.dto.UserDto;
import kdima90.openschool.user.dto.UserRequestEntity;
import kdima90.openschool.user.dto.UserResponseEntity;
import kdima90.openschool.user.entity.User;

public interface UserService {
    User save(UserDto userDto);
}
