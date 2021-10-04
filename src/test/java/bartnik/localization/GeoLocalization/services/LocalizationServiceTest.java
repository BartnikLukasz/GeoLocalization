package bartnik.localization.GeoLocalization.services;

import bartnik.localization.GeoLocalization.domain.LocalizationEntity;
import bartnik.localization.GeoLocalization.dto.LocalizationRequestDto;
import bartnik.localization.GeoLocalization.mappers.LocalizationMapper;
import bartnik.localization.GeoLocalization.repositories.LocalizationRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.math.BigDecimal;

import static org.mockito.Mockito.*;

@ExtendWith(SpringExtension.class)
class LocalizationServiceTest {

    @MockBean
    private LocalizationRepository localizationRepository;

    @MockBean
    private LocalizationMapper localizationMapper;

    private LocalizationService localizationService;

    @BeforeEach
    void setUp() {
        localizationService = new LocalizationService(localizationRepository, localizationMapper);
    }

    @Test
    void save_should_call_mapper_and_repository() {
        when(localizationMapper.mapLocalizationDtoToLocalizationEntity(any(LocalizationRequestDto.class))).thenReturn(new LocalizationEntity());

        localizationService.save(new LocalizationRequestDto("device123", new BigDecimal(49.3565), new BigDecimal(50.255)));

        verify(localizationMapper, times(1)).mapLocalizationDtoToLocalizationEntity(any(LocalizationRequestDto.class));
        verify(localizationRepository, times(1)).save(any(LocalizationEntity.class));
    }
}