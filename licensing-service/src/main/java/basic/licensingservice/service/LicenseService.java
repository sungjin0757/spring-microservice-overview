package basic.licensingservice.service;

import basic.licensingservice.domain.License;

public interface LicenseService {
    License getLicense(Long licenseId);
    void saveLicense(License license);
    void updateLicense(License license);
    void deleteLicense(License license);
}
