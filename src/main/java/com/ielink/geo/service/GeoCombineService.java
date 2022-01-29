package com.ielink.geo.service;

import com.ielink.geo.controller.dto.GeoCombineTo;

import java.util.List;

public interface GeoCombineService {

    List<Long> getGeoCombineIds(GeoCombineTo geoCombineTo);

}
