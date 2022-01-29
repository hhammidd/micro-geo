package com.ielink.geo.service;

import com.ielink.geo.controller.dto.CountresTreeGeoTo;
import com.ielink.geo.controller.dto.ProvinceTo;
import com.ielink.geo.controller.dto.RegionTo;
import com.ielink.geo.controller.dto.TreeGeoTo;

import java.util.List;

public interface TreeGeoService {

    List<RegionTo> getRegionsByNationId(long nationID);

    List<ProvinceTo> getProvincesByRegionId(long regionID);

    CountresTreeGeoTo getTreeGeo();
}
