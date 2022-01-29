package com.ielink.geo.controller.dto;

public class ComuneDto {
    private Long comuneId;
    private String comuneName;

    public ComuneDto() {
    }

    public ComuneDto(Long comuneId, String comuneName) {
        this.comuneId = comuneId;
        this.comuneName = comuneName;
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
}