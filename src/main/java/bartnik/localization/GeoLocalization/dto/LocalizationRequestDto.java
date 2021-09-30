package bartnik.localization.GeoLocalization.dto;

import lombok.Data;

@Data
public class LocalizationRequestDto {

    private String deviceId;

    private Double longitude;

    private Double latitude;
}
