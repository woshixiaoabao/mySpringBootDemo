package com.abao.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abao.model.Permission;

public interface PermissionDao extends JpaRepository<Permission, Integer> {

}
