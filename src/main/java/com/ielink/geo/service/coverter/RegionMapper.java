package com.ielink.geo.service.coverter;

import com.ielink.geo.controller.dto.RegionDto;
import com.ielink.geo.controller.dto.RegionTo;
import com.ielink.geo.model.Region;
import org.springframework.stereotype.Component;

@Component
public class RegionMapper {

    public RegionTo convertToDto(Region region) {
        RegionTo regionTo = new RegionTo();

        regionTo.setRegionId(region.getRegionId());
        regionTo.setRegionName(region.getRegionName());
        regionTo.setRegionCode(region.getRegionCode());
        regionTo.setNationId(region.getRegionFather());

        return regionTo;
    }

    public Region convertToDomain(RegionTo regionTo) {
        Region region = new Region();
        region.setRegionId(null);
        region.setRegionName(regionTo.getRegionName());
        region.setRegionCode(regionTo.getRegionCode());
        region.setRegionFather(regionTo.getNationId());

        return region;
    }

    public RegionDto convertToDtoNew(Region region) {
        RegionDto regionTo = new RegionDto();

        regionTo.setRegionId(region.getRegionId());
        regionTo.setRegionName(region.getRegionName());

        return regionTo;
    }
}
