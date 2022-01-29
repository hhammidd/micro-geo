package com.ielink.geo.dao;

import com.ielink.geo.model.Comune;
import com.ielink.geo.model.Province;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ComuneDao  extends JpaRepository<Comune, Long> {
    List<Comune> findByComuneFather(Long provinceId);
}
