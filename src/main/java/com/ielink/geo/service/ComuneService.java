package com.ielink.geo.service;

import com.ielink.geo.controller.dto.ComuneDto;
import com.ielink.geo.controller.dto.ComuneTo;

import java.util.List;

public interface ComuneService {

    List<ComuneTo> getComunes();

    void createComunes(ComuneTo comuneTo);

    ComuneTo getComuneById(long comuneID);

    String deleteComuneById(long comuneID);

    ComuneTo updateComune(ComuneTo comuneTo, long comuneID);

    List<ComuneTo> getComuneByProvinceId(long provinceId);

    List<ComuneDto> getComunesName();
}
