package com.ielink.geo.model;

import javax.persistence.*;

@Entity
@Table(name = "cap")
public class Cap {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long capId;

    @Column(name = "cap_name")
    private String capName;

    @Column(name = "cap_code")
    private String capCode;

    @Column(name = "comune_id")
    private Long capFather;

    public Cap() {
    }

    public Cap(String capName, String capCode, Long capFather) {
        this.capName = capName;
        this.capCode = capCode;
        this.capFather = capFather;
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

    public Long getCapFather() {
        return capFather;
    }

    public void setCapFather(Long capFather) {
        this.capFather = capFather;
    }
}
