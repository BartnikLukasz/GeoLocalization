package bartnik.localization.GeoLocalization.mappers;

import bartnik.localization.GeoLocalization.domain.LocalizationEntity;
import bartnik.localization.GeoLocalization.dto.LocalizationRequestDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import javax.validation.Valid;

@Mapper(componentModel = "spring")
public abstract class LocalizationMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "date", expression = "java(java.time.LocalDateTime.now())")
    public abstract @Valid LocalizationEntity mapLocalizationDtoToLocalizationEntity(LocalizationRequestDto localizationRequest);
}