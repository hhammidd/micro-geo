package com.ielink.geo.model;

import javax.persistence.*;

@Entity
@Table(name = "nation")
public class Nation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long nationId;

    @Column(name = "nation_name")
    private String nationName;

    @Column(name = "nation_code")
    private String nationCode;

    @Column(name = "nation_father")
    private Long nationFather;

    public Nation() {
    }

    public Nation(String nationName, String nationCode, Long nationFather) {
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
