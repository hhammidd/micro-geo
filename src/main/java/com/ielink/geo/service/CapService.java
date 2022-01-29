package com.ielink.geo.service;

import com.ielink.geo.controller.dto.CapTo;

import java.util.List;

public interface CapService {

    List<CapTo> getCaps();

    void createCaps(CapTo capTo);

    CapTo getCapById(long capID);

    String deleteCapById(long capID);

    CapTo updateCap(CapTo capTo, long capID);
}
