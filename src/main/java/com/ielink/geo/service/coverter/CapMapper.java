package com.ielink.geo.service.coverter;

import com.ielink.geo.controller.dto.CapTo;
import com.ielink.geo.model.Cap;
import org.springframework.stereotype.Component;

@Component
public class CapMapper {

    public CapTo convertToDto(Cap cap) {
        CapTo capTo = new CapTo();

        capTo.setCapId(cap.getCapId());
        capTo.setCapName(cap.getCapName());
        capTo.setCapCode(cap.getCapCode());
        capTo.setComuneId(cap.getCapFather());

        return capTo;
    }

    public Cap convertToDomain(CapTo capTo) {
        Cap cap = new Cap();
        cap.setCapId(null);
        cap.setCapName(capTo.getCapName());
        cap.setCapCode(capTo.getCapCode());
        cap.setCapFather(capTo.getComuneId());

        return cap;
    }
}
