package kdima90.openschool.user.service;

import kdima90.openschool.user.dto.UserDto;
import kdima90.openschool.user.dto.UserResponseEntity;
import kdima90.openschool.user.entity.School;
import kdima90.openschool.user.entity.User;
import kdima90.openschool.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
  private final ConversionService conversionService;
  private final UserRepository userRepository;
  private final SchoolServiceImpl schoolServiceImpl;

  @Transactional
  @Override
  public User save(UserDto userDto) {
    User user = new User();
    user.setFirstname(userDto.getFirstname());
    user.setLastname(userDto.getLastname());
    user.setStreet(userDto.getStreet());
    user.setStreetNumber(userDto.getStreetNumber());
    user.setPostalCode(userDto.getPostalCode());
    user.setCity(userDto.getCity());
    user.setFederalState(userDto.getFederalState());
    user.setLocale(userDto.getLocale());
    user.setEmail(userDto.getEmail());

    Optional<School> schoolById =
        schoolServiceImpl.findSchoolById(UUID.fromString(userDto.getSchoolId()));
    if (schoolById.isPresent()) {
      user.setSchool(schoolById.get());
    } else {
      throw new RuntimeException("School not found");
    }
    User savedUser = userRepository.save(user);
    return savedUser;
  }
}
