package com.ielink.geo.controller.dto;

import java.util.List;

public class GeoCombineTo {
    private List<Integer> regions;
    private List<Integer> provinces;
    private List<Integer> comunes;

    public GeoCombineTo() {
    }

    public GeoCombineTo(List<Integer> regions, List<Integer> provinces, List<Integer> comunes) {
        this.regions = regions;
        this.provinces = provinces;
        this.comunes = comunes;
    }

    public List<Integer> getRegions() {
        return regions;
    }

    public void setRegions(List<Integer> regions) {
        this.regions = regions;
    }

    public List<Integer> getProvinces() {
        return provinces;
    }

    public void setProvinces(List<Integer> provinces) {
        this.provinces = provinces;
    }

    public List<Integer> getComunes() {
        return comunes;
    }

    public void setComunes(List<Integer> comunes) {
        this.comunes = comunes;
    }
}
