package com.ielink.geo.service;

import org.springframework.web.multipart.MultipartFile;

public interface PostalcodeService {
    void insertCSV(MultipartFile file);
}
