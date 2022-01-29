package com.ielink.geo.model;

import javax.persistence.*;

@Entity
@Table(name = "province")
public class Province {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long provinceId;

    @Column(name = "province_name")
    private String provinceName;

    @Column(name = "province_code")
    private String provinceCode;

    @Column(name = "region_id")
    private Long provinceFather;

    public Province() {
    }

    public Province(String provinceName, String provinceCode, Long provinceFather) {
        this.provinceName = provinceName;
        this.provinceCode = provinceCode;
        this.provinceFather = provinceFather;
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

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public Long getProvinceFather() {
        return provinceFather;
    }

    public void setProvinceFather(Long provinceFather) {
        this.provinceFather = provinceFather;
    }
}
