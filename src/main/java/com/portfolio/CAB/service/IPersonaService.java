package com.portfolio.CAB.service;

import com.portfolio.CAB.models.Persona;
import java.util.List;

public interface IPersonaService {
    
    //Metodo para traer todas las personas
    public List<Persona> getPersona();
    
    //Metodo para dar de alta una persona
    public void savePersona(Persona persona);
    
    //Metodo para borrar una persona por id
    public void deletePersona(Long id);
    
     //Metodo para encontrar una persona por id
    public Persona findPersona(Long id);
        
}
 