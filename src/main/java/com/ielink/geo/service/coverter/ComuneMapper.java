package com.ielink.geo.service.coverter;

import com.ielink.geo.controller.dto.ComuneDto;
import com.ielink.geo.controller.dto.ComuneTo;
import com.ielink.geo.model.Comune;
import org.springframework.stereotype.Component;

@Component
public class ComuneMapper {

    public ComuneTo convertToDto(Comune comune) {
        ComuneTo comuneTo = new ComuneTo();

        comuneTo.setComuneId(comune.getComuneId());
        comuneTo.setComuneName(comune.getComuneName());
        comuneTo.setComuneCode(comune.getComuneCode());
        comuneTo.setProvinceId(comune.getComuneFather());

        return comuneTo;
    }

    public ComuneDto convertToDtoNew(Comune comune) {
        ComuneDto comuneTo = new ComuneDto();

        comuneTo.setComuneId(comune.getComuneId());
        comuneTo.setComuneName(comune.getComuneName());

        return comuneTo;
    }

    public Comune convertToDomain(ComuneTo comuneTo) {
        Comune comune = new Comune();
        comune.setComuneId(null);
        comune.setComuneName(comuneTo.getComuneName());
        comune.setComuneCode(comuneTo.getComuneCode());
        comune.setComuneFather(comuneTo.getProvinceId());

        return comune;
    }


}
