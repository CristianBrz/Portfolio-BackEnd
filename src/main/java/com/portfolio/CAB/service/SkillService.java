package com.portfolio.CAB.service;

import com.portfolio.CAB.models.Skills;
import com.portfolio.CAB.repository.ISkillsRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SkillService {

    @Autowired
    ISkillsRepository iSkillsRepository;

    public List<Skills> list() {
        return iSkillsRepository.findAll();
    }

    public Optional<Skills> getOne(int id) {
        return iSkillsRepository.findById(id);
    }

    public Optional<Skills> getByNombreSkill(String nombreSkill) {
        return iSkillsRepository.findByNombreSkill(nombreSkill);
    }

    public void save(Skills skill) {
        iSkillsRepository.save(skill);
    }

    public void delete(int id) {
        iSkillsRepository.deleteById(id);
    }

    public boolean existsById(int id) {
        return iSkillsRepository.existsById(id);
    }

    public boolean existsByNombreSkill(String nombreSkill) {
        return iSkillsRepository.existsByNombreSkill(nombreSkill);
    }

}
