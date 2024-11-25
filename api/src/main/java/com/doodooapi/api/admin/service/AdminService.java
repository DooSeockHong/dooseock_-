package com.doodooapi.api.admin.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.doodooapi.api.admin.controller.admin.dto.AdminDTO;
import com.doodooapi.api.admin.entity.Admin;
import com.doodooapi.api.admin.repository.AdminRepository;
import com.doodooapi.api.common.ResponseEntity;
import com.doodooapi.api.enums.ResponseStatus;

import lombok.extern.slf4j.Slf4j;

/** 공부용이었습니다. */

@Slf4j
@Service
public class AdminService {

    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private AdminRepository adminRepository;

    /** 관리자 등록 */
    public ResponseEntity adminRegister (AdminDTO.CommonDTO commonDTO) throws Exception {
        /** dto를 entity에 복사 */
        Admin adminEntity = modelMapper.map(commonDTO, Admin.class);
        adminRepository.save(adminEntity);
        log.info("adminEntity is {} ",adminEntity);
        return ResponseEntity.of(ResponseStatus.SUCCESS, "성공");
    }

}
