package com.portfolio.CAB.security.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolio.CAB.security.entity.Rol;
import com.portfolio.CAB.security.enums.RolNombre;


public interface IRolRepository  extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
