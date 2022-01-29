package com.ielink.geo.controller;

import com.ielink.geo.controller.dto.ComuneDto;
import com.ielink.geo.controller.dto.ComuneTo;
import com.ielink.geo.controller.dto.ComuneTo;
import com.ielink.geo.controller.dto.ProvinceTo;
import com.ielink.geo.service.ComuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping(value = "/comune-config")
@CrossOrigin(origins = "*")
public class ComuneController {

    @Autowired
    private ComuneService comuneService;

    @GetMapping
    public List<ComuneTo> getComuni() {
        return comuneService.getComunes();
        //TODO for null and others
    }

    @GetMapping("/names")
    public List<ComuneDto> getComuniNames() {
        return comuneService.getComunesName();
        //TODO for null and others
    }

    @PostMapping
    public void createSailePoints(@RequestBody ComuneTo comuneTo) {
        comuneService.createComunes(comuneTo);
        //TODO check
    }

    @GetMapping("/{comuneID}")
    public ComuneTo getComuneById(@PathVariable(name = "comuneID") long comuneID) {
        try {
            return comuneService.getComuneById(comuneID);
        } catch (NoSuchElementException e) {
            return null;//TODO
        }

    }

    @GetMapping("/by-province/{provinceId}")
    public List<ComuneTo> getComuneByProvinceId(@PathVariable(name = "provinceId") long provinceId) {
        try {
            return comuneService.getComuneByProvinceId(provinceId);
        } catch (NoSuchElementException e) {
            return null;//TODO
        }

    }

    @DeleteMapping("/{comuneID}")
    public String deleteEmployee(@PathVariable(name = "comuneID") long comuneID) {
        return comuneService.deleteComuneById(comuneID);
    }

    @PutMapping("/{comuneID}")
    public ComuneTo update(@PathVariable(name = "comuneID") long comuneID,
                        @RequestBody ComuneTo comuneTo) {
        return comuneService.updateComune(comuneTo, comuneID);
    }


}
