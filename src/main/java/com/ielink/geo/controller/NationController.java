package com.ielink.geo.controller;

import com.ielink.geo.controller.dto.NationTo;
import com.ielink.geo.controller.dto.NationTo;
import com.ielink.geo.service.NationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping(value = "/nation-config")
@CrossOrigin(origins = "*")
public class NationController {

    @Autowired
    private NationService nationService;

    @GetMapping
    public List<NationTo> getNations() {
        return nationService.getNations();
        //TODO for null and others
    }

    @PostMapping
    public void createSailePoints(@RequestBody NationTo nationTo) {
        nationService.createNations(nationTo);
        //TODO check
    }

    @GetMapping("/{nationID}")
    public NationTo getNationById(@PathVariable(name = "nationID") long nationID) {
        try {
            return nationService.getNationById(nationID);
        } catch (NoSuchElementException e) {
            return null;//TODO
        }

    }

    @DeleteMapping("/{nationID}")
    public String deleteEmployee(@PathVariable(name = "nationID") long nationID) {
        return nationService.deleteNationById(nationID);
    }

    @PutMapping("/{nationID}")
    public NationTo update(@PathVariable(name = "nationID") long nationID,
                           @RequestBody NationTo nationTo) {
        return nationService.updateNation(nationTo, nationID);
    }
}
