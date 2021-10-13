package bartnik.localization.GeoLocalization.controllers;

import bartnik.localization.GeoLocalization.dto.LocalizationRequestDto;
import bartnik.localization.GeoLocalization.services.LocalizationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
class LocalizationController {

    private final LocalizationService localizationService;

    @PostMapping
    public ResponseEntity<?> saveLocalization(@Valid @RequestBody LocalizationRequestDto localization) {
        localizationService.save(localization);
        return ResponseEntity.ok("Information has been stored");
    }
}
