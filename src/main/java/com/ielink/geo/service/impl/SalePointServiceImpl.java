package com.ielink.geo.service.impl;

import com.ielink.geo.controller.dto.GeoFilteredTo;
import com.ielink.geo.controller.dto.SalePointsTo;
import com.ielink.geo.dao.RegionDao;
import com.ielink.geo.service.SalePointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class SalePointServiceImpl implements SalePointService {

    @Autowired
    private RegionDao regionDao;

    @Override
    public List<SalePointsTo> getSalePoints(GeoFilteredTo geoFilteredTo) {
        //TODO do a filter on PV in Database
        SalePointsTo salepoint = new SalePointsTo(1L, "IELINK", "",
                "SOUTH HOLLAND", "DEN HAAG",
                "DEN HAAG", "2511BZ",
                "12345678", "12345-34564",
                "www.ertt.com", "2021-08-08T12:00:00");

        return Collections.singletonList(salepoint);
    }

}
