package com.ielink.geo.controller;

import com.ielink.geo.controller.dto.GeoCombineTo;
import com.ielink.geo.service.GeoCombineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/geo-combine")
@CrossOrigin(origins = "*")
public class GeoCombineController {

    @Autowired
    private GeoCombineService geoCombineService;

    @PostMapping
    public List<Long> getGeoCombineIds(@RequestBody GeoCombineTo geoCombineTo) {
        return geoCombineService.getGeoCombineIds(geoCombineTo);
        //TODO for null and others
    }
}
