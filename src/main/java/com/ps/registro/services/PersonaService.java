package com.ps.registro.services;

import com.ps.registro.modelo.Persona;
import com.ps.registro.modelo.dto.PersonaDTO;
import com.ps.registro.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonaService implements  IPersonaService {

    @Autowired
    PersonaRepository personaRepository;

    @Transactional()
    public Persona guardar(Persona persona) throws Exception {

        if (persona.getId() < 0) {
            throw new Exception("El empleado no puede tener numeros menores o iguales a 0");
        }
        if (persona.getCorreo() == null || persona.getCorreo().equals("")) {
            throw new Exception("El usuario no tiene correo");
        }
        if (persona.getIdentificacion() == null || persona.getIdentificacion().equals("")) {
            throw new Exception("El usuario no tiene identificacion");
        }


        //TODO Terminar las validaciones.

        return  personaRepository.save(persona);
    }

    @Override
    public PersonaDTO consultar(Long id) throws Exception {

        if (id==null || id<1){
            throw new Exception("El id enviado no es valido");
        }

        Persona p = personaRepository.getOne(id);
        PersonaDTO personaDTO = new PersonaDTO();
        personaDTO.setNombre(p.getNombres());

        return personaDTO;
    }
}



