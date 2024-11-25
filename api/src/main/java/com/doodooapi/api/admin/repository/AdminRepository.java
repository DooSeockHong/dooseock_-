package com.doodooapi.api.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doodooapi.api.admin.entity.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Long> {

}
