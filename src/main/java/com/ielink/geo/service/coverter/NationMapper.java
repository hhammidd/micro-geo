package com.ielink.geo.service.coverter;

import com.ielink.geo.controller.dto.NationTo;
import com.ielink.geo.model.Nation;
import org.springframework.stereotype.Component;

@Component
public class NationMapper {

    public NationTo convertToDto(Nation nation) {
        NationTo nationTo = new NationTo();

        nationTo.setNationId(nation.getNationId());
        nationTo.setNationName(nation.getNationName());
        nationTo.setNationCode(nation.getNationCode());
        nationTo.setNationFather(nation.getNationFather());

        return nationTo;
    }

    public Nation convertToDomain(NationTo nationTo) {
        Nation nation = new Nation();
        nation.setNationId(null);
        nation.setNationName(nationTo.getNationName());
        nation.setNationCode(nationTo.getNationCode());
        nation.setNationFather(nationTo.getNationFather());

        return nation;
    }
}
