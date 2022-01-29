package com.ielink.geo.controller.dto;

public class RegionTo {
    private Long regionId;
    private String regionName;
    private String regionCode;
    private Long nationId;

    public RegionTo() {
    }

    public RegionTo(Long regionId, String regionName, String regionCode, Long nationId) {
        this.regionId = regionId;
        this.regionName = regionName;
        this.regionCode = regionCode;
        this.nationId = nationId;
    }

    public Long getRegionId() {
        return regionId;
    }

    public void setRegionId(Long regionId) {
        this.regionId = regionId;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public Long getNationId() {
        return nationId;
    }

    public void setNationId(Long nationId) {
        this.nationId = nationId;
    }
}
