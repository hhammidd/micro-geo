package com.ielink.geo.dao;

import com.ielink.geo.model.Nation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NationDao extends JpaRepository<Nation, Long> {
}
