package com.ielink.geo.controller;

import com.ielink.geo.controller.dto.CapTo;
import com.ielink.geo.service.CapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping(value = "/cap-config")
@CrossOrigin(origins = "*")
public class CapController {

    @Autowired
    private CapService capService;

    @GetMapping
    public List<CapTo> getCaps() {
        return capService.getCaps();
        //TODO for null and others
    }

    @PostMapping
    public void createCap(@RequestBody CapTo capTo) {
        capService.createCaps(capTo);
        //TODO check
    }

    @GetMapping("/{capID}")
    public CapTo getCapById(@PathVariable(name = "capID") long capID) {
        try {
            if (capService.getCapById(capID) !=null) {
                return capService.getCapById(capID);
            } else
                throw new  ResourceNotFoundException();

        } catch (NoSuchElementException e) {
            return null;//TODO
        }

    }

    @DeleteMapping("/{capID}")
    public String deleteEmployee(@PathVariable(name = "capID") long capID) {
        return capService.deleteCapById(capID);
    }

    @PutMapping("/{capID}")
    public CapTo update(@PathVariable(name = "capID") long capID,
                           @RequestBody CapTo capTo) {
        return capService.updateCap(capTo, capID);
    }



}
@ResponseStatus(value = HttpStatus.NOT_FOUND)
class ResourceNotFoundException extends RuntimeException{
}