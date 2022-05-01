package com.ielink.geo.controller.dto;

public class RegionTo {
    private Long regionId;
    private String regionName;
    private String regionCode;
    private int codeGeo;
    private Long nationId;

    public RegionTo() {
    }


    public RegionTo(Long regionId, String regionName, String regionCode, int codeGeo, Long nationId) {
        this.regionId = regionId;
        this.regionName = regionName;
        this.regionCode = regionCode;
        this.codeGeo = codeGeo;
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

    public int getCodeGeo() {
        return codeGeo;
    }

    public void setCodeGeo(int codeGeo) {
        this.codeGeo = codeGeo;
    }

    public Long getNationId() {
        return nationId;
    }

    public void setNationId(Long nationId) {
        this.nationId = nationId;
    }
}
