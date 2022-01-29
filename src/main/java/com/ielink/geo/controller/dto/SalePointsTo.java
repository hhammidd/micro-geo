package com.ielink.geo.controller.dto;

import java.util.List;

public class SalePointsTo {
    private Long salePointId;
    private String name1;
    private String name2;
    private String region;
    private String province;
    private String comune;
    private String cap;
    private String tell;
    private String langlat;
    private String webSite;
    private String lastUpdate;

    public SalePointsTo() {
    }

    public SalePointsTo(Long salePointId, String name1, String name2, String region, String province, String comune, String cap, String tell, String langlat, String webSite, String lastUpdate) {
        this.salePointId = salePointId;
        this.name1 = name1;
        this.name2 = name2;
        this.region = region;
        this.province = province;
        this.comune = comune;
        this.cap = cap;
        this.tell = tell;
        this.langlat = langlat;
        this.webSite = webSite;
        this.lastUpdate = lastUpdate;
    }

    public Long getSalePointId() {
        return salePointId;
    }

    public void setSalePointId(Long salePointId) {
        this.salePointId = salePointId;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getComune() {
        return comune;
    }

    public void setComune(String comune) {
        this.comune = comune;
    }

    public String getCap() {
        return cap;
    }

    public void setCap(String cap) {
        this.cap = cap;
    }

    public String getTell() {
        return tell;
    }

    public void setTell(String tell) {
        this.tell = tell;
    }

    public String getLanglat() {
        return langlat;
    }

    public void setLanglat(String langlat) {
        this.langlat = langlat;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
