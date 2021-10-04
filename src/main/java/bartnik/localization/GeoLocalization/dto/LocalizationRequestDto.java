package bartnik.localization.GeoLocalization.dto;

import lombok.*;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@AllArgsConstructor
@Getter
@Setter
@Builder
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
