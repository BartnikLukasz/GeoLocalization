package bartnik.localization.GeoLocalization.domain;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Digits;
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

    @Column(name = "device_id", length = 16)
    @Size(min = 8, max = 16)
    private String deviceId;

    @Column(name = "longitude")
    @Digits(integer = 9, fraction = 6)
    private BigDecimal longitude;

    @Column(name = "latitude")
    @Digits(integer = 9, fraction = 6)
    private BigDecimal latitude;

    @Column(name = "date")
    private LocalDateTime date;
}
