package bartnik.localization.GeoLocalization.mappers;

import bartnik.localization.GeoLocalization.domain.LocalizationEntity;
import bartnik.localization.GeoLocalization.dto.LocalizationRequestDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public abstract class LocalizationMapper {

    @Mapping(target = "date", expression = "java(LocalDateTime.now())")
    public abstract LocalizationEntity mapLocalizationDtoToLocalizationEntity(LocalizationRequestDto localizationRequest);
}
