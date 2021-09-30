package bartnik.localization.GeoLocalization.domain;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "localization")
public class LocalizationEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "device_id")
    private String deviceId;

    @Column(name = "longitude")
    private Double longitude;

    @Column(name = "latitude")
    private Double latitude;

    @Column(name = "date")
    private LocalDateTime date;
}
