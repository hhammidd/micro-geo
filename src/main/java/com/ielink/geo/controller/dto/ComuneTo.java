package com.ielink.geo.controller.dto;

public class ComuneTo {
    private Long comuneId;
    private String comuneName;
    private String comuneCode;
    private Long provinceId;

    public ComuneTo() {
    }

    public ComuneTo(Long comuneId, String comuneName, String comuneCode, Long provinceId) {
        this.comuneId = comuneId;
        this.comuneName = comuneName;
        this.comuneCode = comuneCode;
        this.provinceId = provinceId;
    }

    public Long getComuneId() {
        return comuneId;
    }

    public void setComuneId(Long comuneId) {
        this.comuneId = comuneId;
    }

    public String getComuneName() {
        return comuneName;
    }

    public void setComuneName(String comuneName) {
        this.comuneName = comuneName;
    }

    public String getComuneCode() {
        return comuneCode;
    }

    public void setComuneCode(String comuneCode) {
        this.comuneCode = comuneCode;
    }

    public Long getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
    }
}
