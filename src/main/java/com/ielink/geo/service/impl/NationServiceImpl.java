package com.ielink.geo.service.impl;

import com.ielink.geo.controller.dto.NationTo;
import com.ielink.geo.controller.dto.NationTo;
import com.ielink.geo.dao.NationDao;
import com.ielink.geo.model.Nation;
import com.ielink.geo.model.Nation;
import com.ielink.geo.service.NationService;
import com.ielink.geo.service.coverter.NationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class NationServiceImpl implements NationService {

    @Autowired
    private NationDao nationDao;

    @Autowired
    private NationMapper nationMapper;

    @Override
    public List<NationTo> getNations() {
        List<Nation> nations = nationDao.findAll();
        List<NationTo> nationTos = new ArrayList<>();

        for (Nation nation : nations) {
            NationTo employeeTo = nationMapper.convertToDto(nation);
            nationTos.add(employeeTo);
        }
        return nationTos;
    }

    @Override
    public void createNations(NationTo nationTo) {
        Nation nation = nationMapper.convertToDomain(nationTo);
        nationDao.save(nation);
        //TODO Add check
    }

    @Override
    public NationTo getNationById(long nationID) {
        return nationMapper.convertToDto(nationDao.findById(nationID).get());
    }

    @Override
    public String deleteNationById(long nationID) {
        Optional<Nation> employee = nationDao.findById(nationID);
        if (employee != null) {
            nationDao.deleteById(nationID);
            return "deleted";
        } else {
            return "not deleted";
        }
    }

    @Override
    public NationTo updateNation(NationTo nationTo, long nationID) {
        Nation nation = nationMapper.convertToDomain(nationTo);
        nation.setNationId(nationID);
        return nationMapper.convertToDto(nationDao.save(nation));
    }

}
