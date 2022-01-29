package com.ielink.geo.controller;

import com.ielink.geo.controller.dto.RegionDto;
import com.ielink.geo.controller.dto.RegionTo;
import com.ielink.geo.controller.dto.RegionTo;
import com.ielink.geo.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping(value = "/region-config")
@CrossOrigin(origins = "*")
public class RegionController {

    @Autowired
    private RegionService regionService;

    @GetMapping
    public List<RegionTo> getSailePoints() {
        return regionService.getRegions();
        //TODO for null and others
    }

    @GetMapping("/names")
    public List<RegionDto> getRegionsName() {
         return regionService.getRegionDto();
        //TODO for null and others

    }

    @PostMapping
    public void createSailePoints(@RequestBody RegionTo regionTo) {
        regionService.createRegions(regionTo);
        //TODO check
    }

    @GetMapping("/{regionID}")
    public RegionTo getRegionById(@PathVariable(name = "regionID") long regionID) {
        try {
            return regionService.getRegionById(regionID);
        } catch (NoSuchElementException e) {
            return null;//TODO
        }

    }

    @GetMapping("/by-country/{countryId}")
    public List<RegionTo> getCountrysRegions(@PathVariable(name = "countryId") long countryId) {
        try {
            return regionService.getRegionByCountryId(countryId);
        } catch (NoSuchElementException e) {
            return null;//TODO
        }

    }

    @DeleteMapping("/{regionID}")
    public String deleteEmployee(@PathVariable(name = "regionID") long regionID) {
        return regionService.deleteRegionById(regionID);
    }

    @PutMapping("/{regionID}")
    public RegionTo update(@PathVariable(name = "regionID") long regionID,
                             @RequestBody RegionTo regionTo) {
        return regionService.updateRegion(regionTo, regionID);
    }



}
