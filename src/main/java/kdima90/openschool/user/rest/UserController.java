package kdima90.openschool.user.rest;

import kdima90.openschool.user.dto.UserDto;
import kdima90.openschool.user.dto.UserRequestEntity;
import kdima90.openschool.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class UserController {

    private final UserService userServiceImpl;

    @PostMapping(value = "/api/school/{schoolId}/user")
    public ResponseEntity<?> createSchool(@PathVariable String schoolId,
            @Validated @RequestBody UserRequestEntity userRequestEntity) {
        UserDto userDto = new UserDto();
        userDto.setEmail(userRequestEntity.getEmail());
        userDto.setSchoolId(schoolId);
        userDto.setFirstname(userRequestEntity.getFirstname());
        userDto.setLastname(userRequestEntity.getLastname());
        userDto.setStreet(userRequestEntity.getStreet());
        userDto.setStreetNumber(userRequestEntity.getStreetNumber());
        userDto.setPostalCode(userRequestEntity.getPostalCode());
        userDto.setCity(userRequestEntity.getCity());
        userDto.setFederalState(userRequestEntity.getFederalState());
        userDto.setLocale(userRequestEntity.getLocale());
        return ResponseEntity.ok().body(userServiceImpl.save(userDto));
    }
}
