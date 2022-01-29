package com.ielink.geo.model;


import javax.persistence.*;

@Entity
@Table(name = "city_nl")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long cityId;

    @Column(name = "city_name")
    private String cityName;

    @Column(name = "city_code")
    private int cityCode;

    @Column(name = "province_nl_id")
    private Long provinceId;

    @Column(name = "date_ins")
    private String dataIns;

    public City() {
    }

    public City(String cityName, int cityCode, Long provinceId, String dataIns) {
        this.cityName = cityName;
        this.cityCode = cityCode;
        this.provinceId = provinceId;
        this.dataIns = dataIns;
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

    public String getDataIns() {
        return dataIns;
    }

    public void setDataIns(String dataIns) {
        this.dataIns = dataIns;
    }
}
