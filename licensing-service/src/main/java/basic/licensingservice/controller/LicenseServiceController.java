package basic.licensingservice.controller;

import basic.licensingservice.domain.License;
import basic.licensingservice.service.LicenseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/organizations/{organizationId}/licenses")
@RequiredArgsConstructor
public class LicenseServiceController {
    private final LicenseService licenseService;

    @GetMapping("/{licenseId}")
    public ResponseEntity<License> getLicenseWithStatusCode(@PathVariable Long organizationId,
                                                            @PathVariable Long licenseId) {
        return ResponseEntity.status(200)
                .body(licenseService.getLicense(licenseId));
    }
}
