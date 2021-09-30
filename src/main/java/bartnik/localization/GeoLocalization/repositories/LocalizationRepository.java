package bartnik.localization.GeoLocalization.repositories;

import bartnik.localization.GeoLocalization.domain.LocalizationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalizationRepository extends JpaRepository<LocalizationEntity, Long> {
}
