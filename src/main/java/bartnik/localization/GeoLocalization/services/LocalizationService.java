package bartnik.localization.GeoLocalization.services;

import bartnik.localization.GeoLocalization.domain.LocalizationEntity;
import bartnik.localization.GeoLocalization.dto.LocalizationRequestDto;
import bartnik.localization.GeoLocalization.mappers.LocalizationMapper;
import bartnik.localization.GeoLocalization.repositories.LocalizationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class LocalizationService {

    private final LocalizationRepository localizationRepository;
    private final LocalizationMapper localizationMapper;

    public void save(LocalizationRequestDto request){
        localizationRepository.save(localizationMapper.mapLocalizationDtoToLocalizationEntity(request));
    }
}
