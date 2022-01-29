package com.ielink.geo.model;

import javax.persistence.*;

@Entity
@Table(name = "geo_combine_it")
public class GeoCombine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long geoCombineId;

    @Column(name = "region_id")
    private Integer regionId;

    @Column(name = "province_id")
    private Integer provinceId;

    @Column(name = "comune_id")
    private Integer comuneId;

    public GeoCombine() {
    }

    public GeoCombine(Integer regionId, Integer provinceId, Integer comuneId) {
        this.regionId = regionId;
        this.provinceId = provinceId;
        this.comuneId = comuneId;
    }

    public Long getGeoCombineId() {
        return geoCombineId;
    }

    public void setGeoCombineId(Long geoCombineId) {
        this.geoCombineId = geoCombineId;
    }

    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public Integer getComuneId() {
        return comuneId;
    }

    public void setComuneId(Integer comuneId) {
        this.comuneId = comuneId;
    }
}
