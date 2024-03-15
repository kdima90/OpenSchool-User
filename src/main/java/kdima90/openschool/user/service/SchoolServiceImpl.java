package kdima90.openschool.user.service;

import kdima90.openschool.user.dto.SchoolMessage;
import kdima90.openschool.user.entity.School;
import kdima90.openschool.user.repository.SchoolRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class SchoolServiceImpl {
    private final ConversionService conversionService;
    private final SchoolRepository schoolRepository;

    @Transactional
    public void saveSchool(SchoolMessage schoolMessage){
        schoolRepository.save(conversionService.convert(schoolMessage, School.class));
    }

    @Transactional
    public Optional<School> findSchoolById(UUID id){
        return schoolRepository.findById(id);
    }
}
