package com.portfolio.CAB.security.repository;


import com.portfolio.CAB.security.entity.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IUsuarioRepository extends JpaRepository<Usuario, Integer>{
        
        Optional<Usuario> findByNombreUsuario(String nombreUsuario);
        
        boolean existsByNombreUsuario(String nombreUsuario);
        boolean existsByEmail(String email);        
        
}
