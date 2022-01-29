package com.ielink.geo.service;

import com.ielink.geo.controller.dto.RegionDto;
import com.ielink.geo.controller.dto.RegionTo;

import java.util.List;

public interface RegionService {

    List<RegionTo> getRegions();

    void createRegions(RegionTo regionTo);

    RegionTo getRegionById(long regionID);

    List<RegionTo> getRegionByCountryId(long countryId);

    String deleteRegionById(long regionID);

    RegionTo updateRegion(RegionTo regionTo, long regionID);

    List<RegionDto> getRegionDto();
}
