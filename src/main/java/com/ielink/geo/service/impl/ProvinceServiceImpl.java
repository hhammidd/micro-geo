package com.ielink.geo.service.impl;

import com.ielink.geo.controller.dto.ProvinceDto;
import com.ielink.geo.controller.dto.ProvinceTo;
import com.ielink.geo.dao.ProvinceDao;
import com.ielink.geo.model.Province;
import com.ielink.geo.model.ProvinceRegionTo;
import com.ielink.geo.service.ProvinceService;
import com.ielink.geo.service.coverter.ProvinceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProvinceServiceImpl implements ProvinceService {

    @Autowired
    private ProvinceDao provinceDao;

    @Autowired
    private ProvinceMapper provinceMapper;

    @Override
    public List<ProvinceTo> getProvinces() {
        List<Province> provinces = provinceDao.findAll();
        List<ProvinceTo> provinceTos = new ArrayList<>();

        for (Province province : provinces) {
            ProvinceTo employeeTo = provinceMapper.convertToDto(province);
            provinceTos.add(employeeTo);
        }
        return provinceTos;
    }

    @Override
    public List<ProvinceDto> getProvinceNames() {

        List<Province> provinces = provinceDao.findAll();
        List<ProvinceDto> provinceTos = new ArrayList<>();

        for (Province province : provinces) {
            ProvinceDto provinceDto = provinceMapper.convertToDtoNew(province);
            provinceTos.add(provinceDto);
        }
        return provinceTos;
    }


    @Override
    public void createProvinces(ProvinceTo provinceTo) {
        Province province = provinceMapper.convertToDomain(provinceTo);
        provinceDao.save(province);
        //TODO Add check
    }

    @Override
    public ProvinceTo getProvinceById(long provinceID) {
        return provinceMapper.convertToDto(provinceDao.findById(provinceID).get());
    }

    @Override
    public List<ProvinceTo> getProvincenByRegionyId(long regionID) {
        List<Province> provinces = provinceDao.findByProvinceFather(regionID);
        List<ProvinceTo> provinceTos = new ArrayList<>();
        provinces.forEach(province ->
                provinceTos.add(provinceMapper.convertToDto(province)));

        return provinceTos;
    }

    @Override
    public String deleteProvinceById(long provinceID) {
        Optional<Province> employee = provinceDao.findById(provinceID);
        if (employee != null) {
            provinceDao.deleteById(provinceID);
            return "deleted";
        } else {
            return "not deleted";
        }
    }

    @Override
    public ProvinceTo updateProvince(ProvinceTo provinceTo, long provinceID) {
        Province province = provinceMapper.convertToDomain(provinceTo);
        province.setProvinceId(provinceID);
        return provinceMapper.convertToDto(provinceDao.save(province));
    }

    @Override
    public void insertCSV(MultipartFile file) {
        List<ProvinceRegionTo> provinceRegionTos = new ArrayList<>();

        if (!file.isEmpty()) {
            try {
                byte[] bytes = file.getBytes();

                ByteArrayInputStream inputFilestream = new ByteArrayInputStream(bytes);
                BufferedReader br = new BufferedReader(new InputStreamReader(inputFilestream));
                String line = "";
                while ((line = br.readLine()) != null) {
                    ProvinceRegionTo provinceRegionTo = new ProvinceRegionTo();

                    // cut the lan lat
                    String[] columns = line.split(",", -1);
                    provinceRegionTo.setProvince(columns[0]);
                    provinceRegionTo.setMunicipilaty(columns[1]);


                    provinceRegionTos.add(provinceRegionTo);

                }
                br.close();


                System.out.println("");


            } catch (Exception e) {
                e.getMessage();
            }

        }
    }

}
