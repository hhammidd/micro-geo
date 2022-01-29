package com.ielink.geo.controller.dto;

public class CapTo {
    private Long capId;
    private String capName;
    private String capCode;
    private Long comuneId;

    public CapTo() {
    }

    public CapTo(Long capId, String capName, String capCode, Long comuneId) {
        this.capId = capId;
        this.capName = capName;
        this.capCode = capCode;
        this.comuneId = comuneId;
    }

    public Long getCapId() {
        return capId;
    }

    public void setCapId(Long capId) {
        this.capId = capId;
    }

    public String getCapName() {
        return capName;
    }

    public void setCapName(String capName) {
        this.capName = capName;
    }

    public String getCapCode() {
        return capCode;
    }

    public void setCapCode(String capCode) {
        this.capCode = capCode;
    }

    public Long getComuneId() {
        return comuneId;
    }

    public void setComuneId(Long comuneId) {
        this.comuneId = comuneId;
    }
}
