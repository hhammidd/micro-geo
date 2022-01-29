package com.ielink.geo.controller;

import com.ielink.geo.controller.dto.CityTo;
import com.ielink.geo.service.CityService;
import com.ielink.geo.service.PostalcodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping(value = "/postalcode")
@CrossOrigin(origins = "*")
public class PostalcodeController {

    @Autowired
    private PostalcodeService postalcodeService;

    @RequestMapping(value = "/upload", method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<Object> uploadGeo(@RequestParam("file") MultipartFile file) {

        try {
            postalcodeService.insertCSV(file);
            return new ResponseEntity<>("File is uploaded sucessfully", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }




}
