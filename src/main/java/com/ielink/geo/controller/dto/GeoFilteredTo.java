package com.ielink.geo.controller.dto;

import java.util.List;

public class GeoFilteredTo {
    private Long geoId;
    private String field;
    private String country;
//    private List<String> regions;
//    private List<String> provinces;
//    private List<String> comunes;
//    private List<String> caps;
    private String regions;
    private String provinces;
    private String comunes;
    private String caps;

    public GeoFilteredTo() {
    }

    public GeoFilteredTo(Long geoId, String field, String country, String regions, String provinces, String comunes, String caps) {
        this.geoId = geoId;
        this.field = field;
        this.country = country;
        this.regions = regions;
        this.provinces = provinces;
        this.comunes = comunes;
        this.caps = caps;
    }
}
