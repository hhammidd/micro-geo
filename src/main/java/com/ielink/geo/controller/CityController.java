package com.ielink.geo.controller;

import com.ielink.geo.controller.dto.CityTo;
import com.ielink.geo.controller.dto.ComuneTo;
import com.ielink.geo.service.CityService;
import com.ielink.geo.service.ComuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping(value = "/city-config")
@CrossOrigin(origins = "*")
public class CityController {

    @Autowired
    private CityService cityService;

    @GetMapping
    public List<CityTo> getAllCities() {
        return cityService.getAllCities();
    }


}
