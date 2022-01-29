package com.ielink.geo.service.impl;

import com.ielink.geo.controller.dto.RegionDto;
import com.ielink.geo.controller.dto.RegionTo;
import com.ielink.geo.dao.RegionDao;
import com.ielink.geo.model.Region;
import com.ielink.geo.service.RegionService;
import com.ielink.geo.service.coverter.RegionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RegionServiceImpl implements RegionService {

    @Autowired
    private RegionDao regionDao;

    @Autowired
    private RegionMapper regionMapper;

    @Override
    public List<RegionTo> getRegions() {
        List<Region> regions = regionDao.findAll();
        List<RegionTo> regionTos = new ArrayList<>();

        for (Region region : regions) {
            RegionTo employeeTo = regionMapper.convertToDto(region);
            regionTos.add(employeeTo);
        }
        return regionTos;
    }

    @Override
    public List<RegionDto> getRegionDto() {
        List<Region> regions = regionDao.findAll();
        List<RegionDto> regionTos = new ArrayList<>();

        for (Region region : regions) {
            RegionDto regionDto = regionMapper.convertToDtoNew(region);
            regionTos.add(regionDto);
        }
        return regionTos;
    }

    @Override
    public void createRegions(RegionTo regionTo) {
        Region region = regionMapper.convertToDomain(regionTo);
        regionDao.save(region);
        //TODO Add check
    }

    @Override
    public RegionTo getRegionById(long regionID) {
        return regionMapper.convertToDto(regionDao.findById(regionID).get());
    }

    @Override
    public List<RegionTo> getRegionByCountryId(long regionID) {
        List<Region> regions = regionDao.findByRegionFather(regionID);
        List<RegionTo> regionTos  = new ArrayList<>();
        regions.forEach( region ->
                regionTos.add(regionMapper.convertToDto(region)));

        return regionTos;
    }

    @Override
    public String deleteRegionById(long regionID) {
        Optional<Region> employee = regionDao.findById(regionID);
        if (employee != null) {
            regionDao.deleteById(regionID);
            return "deleted";
        } else {
            return "not deleted";
        }
    }

    @Override
    public RegionTo updateRegion(RegionTo regionTo, long regionID) {
        Region region = regionMapper.convertToDomain(regionTo);
        region.setRegionId(regionID);
        return regionMapper.convertToDto(regionDao.save(region));
    }



}
