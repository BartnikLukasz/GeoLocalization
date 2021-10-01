package bartnik.localization.GeoLocalization.controllers;

import bartnik.localization.GeoLocalization.dto.LocalizationRequestDto;
import bartnik.localization.GeoLocalization.services.LocalizationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class LocalizationController {

    private final LocalizationService localizationService;

    @PostMapping
    public ResponseEntity<?> saveLocalization(@RequestBody @Valid LocalizationRequestDto localization){
        localizationService.save(localization);
        return ResponseEntity.ok("Information has been stored");
    }
}
