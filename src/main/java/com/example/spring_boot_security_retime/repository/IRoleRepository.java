package com.example.spring_boot_security_retime.repository;

import com.example.spring_boot_security_retime.model.Role;
import com.example.spring_boot_security_retime.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IRoleRepository extends JpaRepository<Role,Long> {
    Optional<Role> findByName(RoleName name);
}
