package com.portfolio.CAB.controller;

import com.portfolio.CAB.models.Persona;
import com.portfolio.CAB.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaController {
    
    @Autowired
    public IPersonaService persoServ;
    
    @GetMapping ("/usuario/mostrar")
    @ResponseBody
    public List<Persona> getPersona(){
        return persoServ.getPersona();
    }
    
    @PostMapping ("/usuario/crear")
    public String crearPersona(@RequestBody Persona pers){
        persoServ.savePersona(pers);
        return "Usuario creado satisfactoriamente";
    }
    
    @DeleteMapping ("/usuario/eliminar/{id}")
    public String eliminarPersona(@PathVariable Long id){
        persoServ.deletePersona(id);
        return "Usuario eliminado satisfactoriamente";
    }
    
    @PutMapping("/usuario/editar/{id}")
    public Persona editarPersona(@PathVariable Long id,
                                 @RequestParam("nombre") String nuevoNombre,
                                 @RequestParam("apellido") String nuevoApellido,
                                 @RequestParam("titulo") String nuevoTitulo,
                                 @RequestParam("descripcion") String nuevaDescripcion,
                                 @RequestParam("impPerfil") String nuevaImg){
        Persona persona = persoServ.findPersona(id);
        
        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoApellido);
        persona.setTitulo(nuevoTitulo);
        persona.setDescripcion(nuevaDescripcion);
        persona.setImgPerfil(nuevaImg);
        
        persoServ.savePersona(persona);
        return persona; 
    }
    
    @GetMapping ("/usuario/mostrar/perfil")
    public Persona findPersona(){
        return persoServ.findPersona((long)1);
    }
    
}
