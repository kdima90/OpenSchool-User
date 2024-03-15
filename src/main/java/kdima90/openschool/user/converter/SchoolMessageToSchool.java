package kdima90.openschool.user.converter;

import kdima90.openschool.user.dto.SchoolMessage;
import kdima90.openschool.user.entity.School;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class SchoolMessageToSchool implements Converter<SchoolMessage, School> {
    @Override
    public School convert(SchoolMessage schoolMessage) {
        School school = new School();
        school.setId(schoolMessage.getId());
        school.setName(schoolMessage.getName());
        school.setStreet(schoolMessage.getStreet());
        school.setStreetNumber(schoolMessage.getStreetNumber());
        school.setPostalCode(schoolMessage.getPostalCode());
        school.setCity(schoolMessage.getCity());
        school.setFederalState(schoolMessage.getFederalState());
        school.setLocale(schoolMessage.getLocale());
        return school;
    }
}
