package com.ielink.geo.dao;

import com.ielink.geo.model.Region;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegionDao extends JpaRepository<Region, Long> {

    List<Region> findByRegionFather(Long countryId);
}
