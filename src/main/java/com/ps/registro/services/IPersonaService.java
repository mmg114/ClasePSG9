package com.ps.registro.services;

import com.ps.registro.modelo.Persona;
import com.ps.registro.modelo.dto.PersonaDTO;

public interface IPersonaService  {

     Persona guardar(Persona persona) throws Exception;

     PersonaDTO consultar(Long id)throws Exception;
}
