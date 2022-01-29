package com.ielink.geo.controller.dto;

public class CityTo {
    private Long cityId;
    private String cityName;
    private int cityCode;
    private Long provinceId;

    public CityTo() {
    }

    public CityTo(Long cityId, String cityName, int cityCode, Long provinceId) {
        this.cityId = cityId;
        this.cityName = cityName;
        this.cityCode = cityCode;
        this.provinceId = provinceId;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public Long getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
    }
}
