package com.ielink.geo.controller;

import com.ielink.geo.controller.dto.GeoFilteredTo;
import com.ielink.geo.controller.dto.SalePointsTo;
import com.ielink.geo.service.SalePointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/geo-filter")
@CrossOrigin(origins = "*")
public class GeoFilterController {

    @Autowired
    private SalePointService salePointService;


    @PostMapping
    public List<SalePointsTo> getFilteredPointSale(@RequestBody GeoFilteredTo geoFilteredTo) {
        return salePointService.getSalePoints(geoFilteredTo);
    }

}
