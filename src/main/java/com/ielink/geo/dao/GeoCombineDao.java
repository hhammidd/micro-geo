package com.ielink.geo.dao;

import com.ielink.geo.model.GeoCombine;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GeoCombineDao extends JpaRepository<GeoCombine, Long> {
    List<GeoCombine> findByRegionId(Integer regionId);

    List<GeoCombine> findByProvinceId(Integer provinceId);

    List<GeoCombine> findByComuneId(Integer comuneId);
}
