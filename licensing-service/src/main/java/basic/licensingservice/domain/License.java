package basic.licensingservice.domain;

import lombok.Builder;
import lombok.ToString;

import java.util.Objects;

@ToString(of = {"id", "organizationId", "productName", "licenseType"})
public class License {
    private Long id;
    private Long organizationId;
    private String productName;
    private String licenseType;

    public Long getId() {
        return id;
    }

    public Long getOrganizationId() {
        return organizationId;
    }

    public String getProductName() {
        return productName;
    }

    public String getLicenseType() {
        return licenseType;
    }

    @Override
    public boolean equals(Object o) {
        if(o == this)
            return true;
        if(!(o instanceof License))
            return false;
        License license = (License) o;
        return Objects.equals(id, license.id) && Objects.equals(organizationId, license.organizationId)
                && Objects.equals(productName, license.productName) && Objects.equals(licenseType, license.licenseType);
    }

    @Override
    public int hashCode() {
        int result = id == null ? 0 : id.hashCode();
        result = result * 31 + organizationId.hashCode();
        result = result * 31 + productName.hashCode();
        result = result * 31 + licenseType.hashCode();
        return result;
    }

    @Builder(builderMethodName = "genLicense")
    public License(Long id, Long organizationId, String productName, String licenseType) {
        this.id = id;
        this.organizationId = organizationId;
        this.productName = productName;
        this.licenseType = licenseType;
    }
}
