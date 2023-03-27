package com.miportfolio.CAB.service;

import com.miportfolio.CAB.models.Persona;
import com.miportfolio.CAB.repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {

    @Autowired
    IPersonaRepository persoRepo;

    @Override
    public List<Persona> getPersona() {
        List<Persona> ListaPersonas = persoRepo.findAll();
        return ListaPersonas;
    }

    @Override
    public void savePersona(Persona persona) {
        persoRepo.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona perso = persoRepo.findById(id).orElse(null);
        return perso;
    }

}
