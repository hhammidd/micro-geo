package com.ielink.geo.service;

import com.ielink.geo.controller.dto.NationTo;

import java.util.List;

public interface NationService {

    List<NationTo> getNations();

    void createNations(NationTo nationTo);

    NationTo getNationById(long nationID);

    String deleteNationById(long nationID);

    NationTo updateNation(NationTo nationTo, long nationID);
}
