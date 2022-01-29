package com.ielink.geo.service.impl;

import com.ielink.geo.dao.CapDao;
import com.ielink.geo.model.ProvinceRegionTo;
import com.ielink.geo.service.PostalcodeService;
import com.ielink.geo.service.coverter.CapMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

@Service
public class PostalcodeServiceImpl implements PostalcodeService {

    @Autowired
    private CapDao capDao;

    @Autowired
    private CapMapper capMapper;


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
