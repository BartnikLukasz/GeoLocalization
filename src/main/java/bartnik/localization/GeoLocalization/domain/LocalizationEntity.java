package bartnik.localization.GeoLocalization.domain;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "localization")
public class LocalizationEntity {

    @Id
    @GeneratedValue
    private Long id;

    @NotBlank
    @Column(name = "device_id", length = 16)
    @Size(min = 8, max = 16)
    private String deviceId;

    @NotNull
    @Column(name = "longitude")
    @Digits(integer = 9, fraction = 6)
    private BigDecimal longitude;

    @NotNull
    @Column(name = "latitude")
    @Digits(integer = 9, fraction = 6)
    private BigDecimal latitude;

    @NotNull
    @Column(name = "date")
    private LocalDateTime date;
}
