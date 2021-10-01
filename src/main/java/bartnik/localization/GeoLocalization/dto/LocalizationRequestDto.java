package bartnik.localization.GeoLocalization.dto;

import lombok.Data;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Data
public class LocalizationRequestDto {

    @NotBlank
    @Size(min = 8, max = 16)
    private String deviceId;

    @NotNull
    @Digits(integer = 9, fraction = 6)
    private BigDecimal longitude;

    @NotNull
    @Digits(integer = 9, fraction = 6)
    private BigDecimal latitude;
}
