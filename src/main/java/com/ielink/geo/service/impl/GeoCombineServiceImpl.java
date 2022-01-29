package com.ielink.geo.service.impl;

import com.ielink.geo.controller.dto.GeoCombineTo;
import com.ielink.geo.dao.GeoCombineDao;
import com.ielink.geo.model.GeoCombine;
import com.ielink.geo.service.GeoCombineService;
import com.ielink.geo.service.coverter.ComuneMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class GeoCombineServiceImpl implements GeoCombineService {

    @Autowired
    private GeoCombineDao geoCombineDao;

    @Autowired
    private ComuneMapper comuneMapper;

    @Override
    public List<Long> getGeoCombineIds(GeoCombineTo geoCombineTo) {


        // Regions
        List<Long> geoCombineIds = new ArrayList<>();
        for (Integer k: geoCombineTo.getRegions()) {
            geoCombineDao.findByRegionId(k)
                    .forEach( geoCombine -> geoCombineIds.add(geoCombine.getGeoCombineId()));
        }

        System.out.println("After 1" + geoCombineIds.size());
        //Province
        for (Integer k: geoCombineTo.getProvinces()) {
            geoCombineDao.findByProvinceId(k)
                    .forEach( geoCombine -> geoCombineIds.add(geoCombine.getGeoCombineId()));
        }

        System.out.println("After 2" + geoCombineIds.size());
        // Comune
        for (Integer k: geoCombineTo.getComunes()) {
            geoCombineDao.findByComuneId(k)
                    .forEach( geoCombine -> geoCombineIds.add(geoCombine.getGeoCombineId()));
        }

        System.out.println("After 3" + geoCombineIds.size());
        List<Long> distinctGeoCombine = geoCombineIds.stream().distinct().collect(Collectors.toList());
        System.out.println("After distinct" + geoCombineIds.size());

        return distinctGeoCombine;
    }
}
