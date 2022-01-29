package com.ielink.geo.controller.dto;

import java.util.List;

public class RegionTreeTo {
    private Long id;
    private String regionName;
    private Boolean isChecked;
    private Boolean isPlanType;
    private Long claimId;
    private List<ProvinceTreeTo> provinceTreeTos;

    public RegionTreeTo() {
    }

    public RegionTreeTo(Long id, String regionName, Boolean isChecked, Boolean isPlanType, Long claimId, List<ProvinceTreeTo> provinceTreeTos) {
        this.id = id;
        this.regionName = regionName;
        this.isChecked = isChecked;
        this.isPlanType = isPlanType;
        this.claimId = claimId;
        this.provinceTreeTos = provinceTreeTos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
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

    public List<ProvinceTreeTo> getProvinceTreeTos() {
        return provinceTreeTos;
    }

    public void setProvinceTreeTos(List<ProvinceTreeTo> provinceTreeTos) {
        this.provinceTreeTos = provinceTreeTos;
    }
}
