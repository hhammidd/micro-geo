package com.ielink.geo.dao;

import com.ielink.geo.model.Province;
import com.ielink.geo.model.Region;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProvinceDao extends JpaRepository<Province, Long> {
    List<Province> findByProvinceFather(Long regionId);

}
