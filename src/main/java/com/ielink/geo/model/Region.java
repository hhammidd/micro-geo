package com.ielink.geo.model;

import javax.persistence.*;

@Entity
@Table(name = "region")
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long regionId;

    @Column(name = "region_name")
    private String regionName;

    @Column(name = "region_code")
    private String regionCode;

    @Column(name = "code_geo")
    private int codeGeo;

    @Column(name = "nation_id")
    private Long regionFather;

    public Region() {
    }

    public Region(Long regionId, String regionName, String regionCode, int codeGeo, Long regionFather) {
        this.regionId = regionId;
        this.regionName = regionName;
        this.regionCode = regionCode;
        this.codeGeo = codeGeo;
        this.regionFather = regionFather;
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

    public Long getRegionFather() {
        return regionFather;
    }

    public void setRegionFather(Long regionFather) {
        this.regionFather = regionFather;
    }
}
