package bartnik.localization.GeoLocalization.controllers;

import bartnik.localization.GeoLocalization.dto.LocalizationRequestDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocalizationController {

    public ResponseEntity<?> saveLocalization(@RequestBody LocalizationRequestDto localization){
        return ResponseEntity.ok("Information has been stored");
    }
}
