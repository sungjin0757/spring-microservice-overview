package basic.licensingservice.service;

import basic.licensingservice.domain.License;
import org.springframework.stereotype.Service;

@Service
public class LicenseServiceImpl implements LicenseService{

    @Override
    public License getLicense(Long licenseId) {
        return License.genLicense()
                .id(licenseId)
                .organizationId(Long.parseLong(String.valueOf(Math.round(Math.random()))))
                .licenseType("Test")
                .productName("Test")
                .build();
    }

    @Override
    public void saveLicense(License license) {

    }

    @Override
    public void updateLicense(License license) {

    }

    @Override
    public void deleteLicense(License license) {

    }
}
