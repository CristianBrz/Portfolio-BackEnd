package com.portfolio.CAB.repository;

import com.portfolio.CAB.models.Skills;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ISkillsRepository extends JpaRepository<Skills, Integer>{
    Optional<Skills>findByNombreSkill(String nombreSkill);
    public boolean existsByNombreSkill(String nombreSkill);

}
