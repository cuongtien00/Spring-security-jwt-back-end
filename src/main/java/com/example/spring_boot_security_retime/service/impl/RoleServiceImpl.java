package com.example.spring_boot_security_retime.service.impl;

import com.example.spring_boot_security_retime.model.Role;
import com.example.spring_boot_security_retime.model.RoleName;
import com.example.spring_boot_security_retime.repository.IRoleRepository;
import com.example.spring_boot_security_retime.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class RoleServiceImpl implements IRoleService {

    @Autowired
    private IRoleRepository roleRepository;

    @Override
    public Optional<Role> findByName(RoleName name) {
        return roleRepository.findByName(name);
    }
}
