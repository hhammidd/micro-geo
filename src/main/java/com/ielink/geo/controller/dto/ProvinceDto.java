package com.ielink.geo.controller.dto;

public class ProvinceDto {
    private Long provinceId;
    private String provinceName;

    public ProvinceDto() {
    }

    public ProvinceDto(Long provinceId, String provinceName) {
        this.provinceId = provinceId;
        this.provinceName = provinceName;
    }

    public Long getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }
}
