package com.ielink.geo.controller.dto;

public class NationTo {
    private Long nationId;
    private String nationName;
    private String nationCode;
    private Long nationFather;

    public NationTo() {
    }

    public NationTo(Long nationId, String nationName, String nationCode, Long nationFather) {
        this.nationId = nationId;
        this.nationName = nationName;
        this.nationCode = nationCode;
        this.nationFather = nationFather;
    }

    public Long getNationId() {
        return nationId;
    }

    public void setNationId(Long nationId) {
        this.nationId = nationId;
    }

    public String getNationName() {
        return nationName;
    }

    public void setNationName(String nationName) {
        this.nationName = nationName;
    }

    public String getNationCode() {
        return nationCode;
    }

    public void setNationCode(String nationCode) {
        this.nationCode = nationCode;
    }

    public Long getNationFather() {
        return nationFather;
    }

    public void setNationFather(Long nationFather) {
        this.nationFather = nationFather;
    }
}
