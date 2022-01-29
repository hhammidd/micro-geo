package com.ielink.geo.service;

import com.ielink.geo.controller.dto.ProvinceDto;
import com.ielink.geo.controller.dto.ProvinceTo;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ProvinceService {

    List<ProvinceTo> getProvinces();

    void createProvinces(ProvinceTo provinceTo);

    ProvinceTo getProvinceById(long provinceID);

    List<ProvinceTo> getProvincenByRegionyId(long regionId);

    String deleteProvinceById(long provinceID);

    ProvinceTo updateProvince(ProvinceTo provinceTo, long provinceID);

    void insertCSV(MultipartFile file);

    List<ProvinceDto> getProvinceNames();
}
