package com.doodooapi.api.admin.controller.admin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.doodooapi.api.admin.controller.admin.dto.AdminDTO;
import com.doodooapi.api.admin.service.AdminService;
import com.doodooapi.api.common.ResponseEntity;

import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * 관리자 컨트롤러
 */


@RestController
@RequestMapping("/api/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    /**관리자 등록 */
    @PostMapping("/adminRegister")
    public ResponseEntity adminRegister(@RequestBody AdminDTO.CommonDTO requestDto) throws Exception  {
        return adminService.adminRegister(requestDto);
    }
    


}
