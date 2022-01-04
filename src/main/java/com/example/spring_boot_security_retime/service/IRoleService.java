package com.example.spring_boot_security_retime.service;

import com.example.spring_boot_security_retime.model.Role;
import com.example.spring_boot_security_retime.model.RoleName;

import java.util.Optional;

public interface IRoleService {
    Optional<Role> findByName(RoleName name);
}
