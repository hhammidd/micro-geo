package com.ielink.geo.service.coverter;

import com.ielink.geo.controller.dto.ProvinceDto;
import com.ielink.geo.controller.dto.ProvinceTo;
import com.ielink.geo.model.Province;
import org.springframework.stereotype.Component;

@Component
public class ProvinceMapper {

    public ProvinceTo convertToDto(Province province) {
        ProvinceTo provinceTo = new ProvinceTo();

        provinceTo.setProvinceId(province.getProvinceId());
        provinceTo.setProvinceName(province.getProvinceName());
        provinceTo.setProvinceCode(province.getProvinceCode());
        provinceTo.setRegionId(province.getProvinceFather());

        return provinceTo;
    }

    public ProvinceDto convertToDtoNew(Province province) {
        ProvinceDto provinceTo = new ProvinceDto();

        provinceTo.setProvinceId(province.getProvinceId());
        provinceTo.setProvinceName(province.getProvinceName());

        return provinceTo;
    }

    public Province convertToDomain(ProvinceTo provinceTo) {
        Province province = new Province();
        province.setProvinceId(null);
        province.setProvinceName(provinceTo.getProvinceName());
        province.setProvinceCode(provinceTo.getProvinceCode());
        province.setProvinceFather(provinceTo.getRegionId());

        return province;
    }


}
