package com.ielink.geo.service.impl;

import com.ielink.geo.controller.dto.CityTo;
import com.ielink.geo.dao.CityDao;
import com.ielink.geo.model.City;
import com.ielink.geo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao cityDao;

    @Override
    public List<CityTo> getAllCities() {
        List<City> cities = cityDao.findAll();
        List<CityTo> cityTos = new ArrayList<>();

        for (City city : cities) {
            CityTo cityTo = new CityTo(city.getCityId(),
                    city.getCityName(),
                    city.getCityCode(),
                    city.getProvinceId());
            cityTos.add(cityTo);
        }
        return cityTos;
    }
}
