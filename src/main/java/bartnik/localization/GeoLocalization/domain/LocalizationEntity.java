package bartnik.localization.GeoLocalization.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
@Entity
public class LocalizationEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String deviceId;

    private Double longitude;

    private Double latitude;

    private LocalDateTime date;
}
