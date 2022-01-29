package com.ielink.geo.model;

import javax.persistence.*;

@Entity
@Table(name = "comune")
public class Comune {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long comuneId;

    @Column(name = "comune_name")
    private String comuneName;

    @Column(name = "comune_code")
    private String comuneCode;

    @Column(name = "province_id")
    private Long comuneFather;

    public Comune() {
    }

    public Comune(String comuneName, String comuneCode, Long comuneFather) {
        this.comuneName = comuneName;
        this.comuneCode = comuneCode;
        this.comuneFather = comuneFather;
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

    public String getComuneCode() {
        return comuneCode;
    }

    public void setComuneCode(String comuneCode) {
        this.comuneCode = comuneCode;
    }

    public Long getComuneFather() {
        return comuneFather;
    }

    public void setComuneFather(Long comuneFather) {
        this.comuneFather = comuneFather;
    }
}
