package com.ielink.geo.service.impl;

import com.ielink.geo.controller.dto.*;
import com.ielink.geo.dao.ProvinceDao;
import com.ielink.geo.dao.RegionDao;
import com.ielink.geo.model.Province;
import com.ielink.geo.model.Region;
import com.ielink.geo.service.TreeGeoService;
import com.ielink.geo.service.coverter.ProvinceMapper;
import com.ielink.geo.service.coverter.RegionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TreeGeoServiceImpl implements TreeGeoService {

    @Autowired
    private RegionDao regionDao;

    @Autowired
    private ProvinceDao provinceDao;

    @Autowired
    private RegionMapper regionMapper;

    @Autowired
    private ProvinceMapper provinceMapper;

    @Override
    public List<RegionTo> getRegionsByNationId(long nationID) {
        List<Region> regions = regionDao.findAll();
        List<RegionTo> regionTos = new ArrayList<>();

        for (Region region : regions) {
            RegionTo employeeTo = regionMapper.convertToDto(region);
            regionTos.add(employeeTo);
        }
        return regionTos.stream().
                filter(f-> f.getNationId().equals(nationID)).collect(Collectors.toList());
    }

    @Override
    public List<ProvinceTo> getProvincesByRegionId(long regionID) {
        List<Province> provinces = provinceDao.findAll();
        List<ProvinceTo> provinceTos = new ArrayList<>();

        for (Province province : provinces) {
            ProvinceTo provinceTo = provinceMapper.convertToDto(province);
            provinceTos.add(provinceTo);
        }

        return provinceTos.stream().
                filter(f-> f.getRegionId().equals(regionID)).collect(Collectors.toList());
    }

    @Override
    public CountresTreeGeoTo getTreeGeo() {
        ComuneTreeTo comuneTreeTo1 = new ComuneTreeTo(1L, "Milan", true, true, 100L);
        ComuneTreeTo comuneTreeTo2 = new ComuneTreeTo(2L, "Coco", true, true, 100L);
        ArrayList<ComuneTreeTo> comuneTreeToMilan = new ArrayList<>();
        comuneTreeToMilan.add(comuneTreeTo1);
        comuneTreeToMilan.add(comuneTreeTo2);

        ProvinceTreeTo provinceTreeToMilan = new ProvinceTreeTo(1L, "Milan", true, true, 100L, comuneTreeToMilan);
        ProvinceTreeTo provinceTreeToBergamo = new ProvinceTreeTo(1L, "Milan", true, true, 100L, comuneTreeToMilan);
        ArrayList<ProvinceTreeTo> provinceTreeToMilans = new ArrayList<>();
        provinceTreeToMilans.add(provinceTreeToMilan);
        provinceTreeToMilans.add(provinceTreeToBergamo);

        RegionTreeTo regionTreeToMilan = new RegionTreeTo(1L, "Lombardia", true, true, 100L, provinceTreeToMilans);

        TreeGeoTo treeGeoToItaly = new TreeGeoTo(1L, "Italy", true, true, 100L, Collections.singletonList(regionTreeToMilan));



        return new CountresTreeGeoTo(Collections.singletonList(treeGeoToItaly));
    }


}
