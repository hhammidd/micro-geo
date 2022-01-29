package com.ielink.geo.controller;

import com.ielink.geo.controller.dto.ProvinceDto;
import com.ielink.geo.controller.dto.ProvinceTo;
import com.ielink.geo.controller.dto.ProvinceTo;
import com.ielink.geo.controller.dto.RegionTo;
import com.ielink.geo.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping(value = "/province-config")
@CrossOrigin(origins = "*")
public class ProvinceController {

    @Autowired
    private ProvinceService provinceService;

    @GetMapping
    public List<ProvinceTo> getProvinces() {
        return provinceService.getProvinces();
        //TODO for null and others
    }

    @GetMapping("/names")
    public List<ProvinceDto> getProvinceNames() {
        return provinceService.getProvinceNames();
        //TODO for null and others
    }

    @PostMapping
    public void createSailePoints(@RequestBody ProvinceTo provinceTo) {
        provinceService.createProvinces(provinceTo);
        //TODO check
    }

    @GetMapping("/{provinceID}")
    public ProvinceTo getProvinceById(@PathVariable(name = "provinceID") long provinceID) {
        try {
            return provinceService.getProvinceById(provinceID);
        } catch (NoSuchElementException e) {
            return null;//TODO
        }

    }

    @GetMapping("/by-region/{regionId}")
    public List<ProvinceTo> getCountrysRegions(@PathVariable(name = "regionId") long regionId) {
        try {
            return provinceService.getProvincenByRegionyId(regionId);
        } catch (NoSuchElementException e) {
            return null;//TODO
        }

    }

    @DeleteMapping("/{provinceID}")
    public String deleteEmployee(@PathVariable(name = "provinceID") long provinceID) {
        return provinceService.deleteProvinceById(provinceID);
    }

    @PutMapping("/{provinceID}")
    public ProvinceTo update(@PathVariable(name = "provinceID") long provinceID,
                           @RequestBody ProvinceTo provinceTo) {
        return provinceService.updateProvince(provinceTo, provinceID);
    }

    @RequestMapping(value = "/upload", method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<Object> uploadGeo(@RequestParam("file") MultipartFile file) {

        try {
            provinceService.insertCSV(file);
            return new ResponseEntity<>("File is uploaded sucessfully", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
