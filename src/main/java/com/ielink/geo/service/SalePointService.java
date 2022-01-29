package com.ielink.geo.service;

import com.ielink.geo.controller.dto.GeoFilteredTo;
import com.ielink.geo.controller.dto.SalePointsTo;

import java.util.List;

public interface SalePointService {

    List<SalePointsTo> getSalePoints(GeoFilteredTo geoFilteredTo);

}
