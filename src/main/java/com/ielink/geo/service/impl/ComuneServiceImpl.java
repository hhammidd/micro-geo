package com.ielink.geo.service.impl;

import com.ielink.geo.controller.dto.ComuneDto;
import com.ielink.geo.controller.dto.ComuneTo;
import com.ielink.geo.dao.ComuneDao;
import com.ielink.geo.model.Comune;
import com.ielink.geo.service.ComuneService;
import com.ielink.geo.service.coverter.ComuneMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ComuneServiceImpl implements ComuneService {

    @Autowired
    private ComuneDao comuneDao;

    @Autowired
    private ComuneMapper comuneMapper;

    @Override
    public List<ComuneTo> getComunes() {
        List<Comune> comunes = comuneDao.findAll();
        List<ComuneTo> comuneTos = new ArrayList<>();

        for (Comune comune : comunes) {
            ComuneTo employeeTo = comuneMapper.convertToDto(comune);
            comuneTos.add(employeeTo);
        }
        return comuneTos;
    }

    @Override
    public List<ComuneDto> getComunesName() {
        List<Comune> comunes = comuneDao.findAll();
        List<ComuneDto> comuneTos = new ArrayList<>();

        for (Comune comune : comunes) {
            ComuneDto comuneDto = comuneMapper.convertToDtoNew(comune);
            comuneTos.add(comuneDto);
        }
        return comuneTos;    }

    @Override
    public void createComunes(ComuneTo comuneTo) {
        Comune comune = comuneMapper.convertToDomain(comuneTo);
        comuneDao.save(comune);
        //TODO Add check
    }

    @Override
    public ComuneTo getComuneById(long comuneID) {
        return comuneMapper.convertToDto(comuneDao.findById(comuneID).get());
    }

    @Override
    public String deleteComuneById(long comuneID) {
        Optional<Comune> employee = comuneDao.findById(comuneID);
        if (employee != null) {
            comuneDao.deleteById(comuneID);
            return "deleted";
        } else {
            return "not deleted";
        }
    }

    @Override
    public ComuneTo updateComune(ComuneTo comuneTo, long comuneID) {
        Comune comune = comuneMapper.convertToDomain(comuneTo);
        comune.setComuneId(comuneID);
        return comuneMapper.convertToDto(comuneDao.save(comune));
    }

    @Override
    public List<ComuneTo> getComuneByProvinceId(long provinceId) {
        List<Comune> comuni = comuneDao.findByComuneFather(provinceId);
        List<ComuneTo> comuniTO = new ArrayList<>();
        comuni.forEach(province ->
                comuniTO.add(comuneMapper.convertToDto(province)));

        return comuniTO;
    }


}
