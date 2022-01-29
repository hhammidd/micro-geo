package com.ielink.geo.controller.dto;

public class ComuneTreeTo {
    private Long id;
    private String countryName;
    private Boolean isChecked;
    private Boolean isPlanType;
    private Long claimId;

    public ComuneTreeTo(Long id, String countryName, Boolean isChecked, Boolean isPlanType, Long claimId) {
        this.id = id;
        this.countryName = countryName;
        this.isChecked = isChecked;
        this.isPlanType = isPlanType;
        this.claimId = claimId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Boolean getChecked() {
        return isChecked;
    }

    public void setChecked(Boolean checked) {
        isChecked = checked;
    }

    public Boolean getPlanType() {
        return isPlanType;
    }

    public void setPlanType(Boolean planType) {
        isPlanType = planType;
    }

    public Long getClaimId() {
        return claimId;
    }

    public void setClaimId(Long claimId) {
        this.claimId = claimId;
    }
}


