package com.ielink.geo.model;

public class ProvinceRegionTo {
    private String province;
    private String municipilaty;

    public ProvinceRegionTo() {
    }

    public ProvinceRegionTo(String province, String municipilaty) {
        this.province = province;
        this.municipilaty = municipilaty;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getMunicipilaty() {
        return municipilaty;
    }

    public void setMunicipilaty(String municipilaty) {
        this.municipilaty = municipilaty;
    }
}
