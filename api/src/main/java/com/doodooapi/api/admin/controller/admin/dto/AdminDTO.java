package com.doodooapi.api.admin.controller.admin.dto;

import lombok.Data;

/**
 * 관리자 테이블 DTO
 */

public class AdminDTO {

    @Data
    public static class CommonDTO{
        /** 이메일 (아이디) */
        private String adminEmail;
        /** 비밀번호 (관리자) */
        private String adminPassword;
         /** 이름 */
        private String adminName;
        /** 연락처 */
        private String adminPhone;
    }



    @Data
    public static class ResponseDTO extends CommonDTO {
        /** 관리자 번호 */
        private Long adminNo;
    }

    @Data
    public static class RequestDTO extends CommonDTO {
       /** 관리자 번호 */
       private Long adminNo;
    }


    
}

