package com.ielink.geo.dao;

import com.ielink.geo.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityDao extends JpaRepository<City, Long> {
}
