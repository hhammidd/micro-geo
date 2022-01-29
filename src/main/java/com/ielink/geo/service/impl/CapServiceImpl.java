package com.ielink.geo.service.impl;

import com.ielink.geo.controller.dto.CapTo;
import com.ielink.geo.dao.CapDao;
import com.ielink.geo.model.Cap;
import com.ielink.geo.service.CapService;
import com.ielink.geo.service.coverter.CapMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CapServiceImpl implements CapService {

    @Autowired
    private CapDao capDao;

    @Autowired
    private CapMapper capMapper;

    @Override
    public List<CapTo> getCaps() {
        List<Cap> caps = capDao.findAll();
        List<CapTo> capTos = new ArrayList<>();

        for (Cap cap : caps) {
            CapTo employeeTo = capMapper.convertToDto(cap);
            capTos.add(employeeTo);
        }
        return capTos;
    }

    @Override
    public void createCaps(CapTo capTo) {
        Cap cap = capMapper.convertToDomain(capTo);
        capDao.save(cap);
        //TODO Add check
    }

    @Override
    public CapTo getCapById(long capID) {
        return capMapper.convertToDto(capDao.findById(capID).get());
    }

    @Override
    public String deleteCapById(long capID) {
        Optional<Cap> employee = capDao.findById(capID);
        if (employee != null) {
            capDao.deleteById(capID);
            return "deleted";
        } else {
            return "not deleted";
        }
    }

    @Override
    public CapTo updateCap(CapTo capTo, long capID) {
        Cap cap = capMapper.convertToDomain(capTo);
        cap.setCapId(capID);
        return capMapper.convertToDto(capDao.save(cap));
    }
}
