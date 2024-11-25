package com.doodooapi.api.admin.entity;



import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * 관리자 테이블
 */

@Entity
@Table(name = "tb_admin")
@Data
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "admin_no")
    private Long adminNo;

    /** 이메일 */
    @Column(name = "admin_email")
    private String adminEmail;

    /** 비밀번호 */
    @Column(name = "admin_password")
    private String adminPassword;

    /** 이름 */
    @Column(name = "admin_name")
    private String adminName;

    /** 연락처 */
    @Column(name = "admin_phone")
    private String adminPhone;

    /** 상태여부(활성화,비활성화) */
    @Column(name = "admin_status")
    private String adminStatus = "activate";

    /** 삭제여부 */
    @Column(name = "del_at")
    private String delAt = "Y";

    /** 생성일시 */
    @Column(name = "cret_dt")
    private Date cretDt = new Date();

    /** 수정일시 */
    @Column(name = "updt_dt")
    private Date updtDt;
}
