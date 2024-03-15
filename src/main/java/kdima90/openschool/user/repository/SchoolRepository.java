package kdima90.openschool.user.repository;

import kdima90.openschool.user.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SchoolRepository extends JpaRepository<School, UUID> {}
