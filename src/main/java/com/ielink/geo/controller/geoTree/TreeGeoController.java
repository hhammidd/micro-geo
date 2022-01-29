package com.ielink.geo.controller.geoTree;

import com.ielink.geo.controller.dto.CountresTreeGeoTo;
import com.ielink.geo.controller.dto.ProvinceTo;
import com.ielink.geo.controller.dto.RegionTo;
import com.ielink.geo.controller.dto.TreeGeoTo;
import com.ielink.geo.service.TreeGeoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping(value = "/tree-geo")
@CrossOrigin(origins = "*")
public class TreeGeoController {

    @Autowired
    private TreeGeoService treeGeoService;

    @GetMapping(path = "/{nationID}")
    public List<RegionTo> getRegionsByNationId(@PathVariable long nationID) {
        try {
            return treeGeoService.getRegionsByNationId(nationID);
        } catch (NoSuchElementException e) {
            return null;//TODO
        }
    }

    @RequestMapping(value = {"/regionID"}, method = RequestMethod.GET)
    public List<ProvinceTo> getProvincesByRegionId(@PathVariable(name = "regionID") long regionID) {
        try {
            return treeGeoService.getProvincesByRegionId(regionID);
        } catch (NoSuchElementException e) {
            return null;//TODO
        }
    }


    @GetMapping()
    public CountresTreeGeoTo getTreeGeo() {
        try {
            return treeGeoService.getTreeGeo();
        } catch (NoSuchElementException e) {
            return null;//TODO
        }
    }


}
