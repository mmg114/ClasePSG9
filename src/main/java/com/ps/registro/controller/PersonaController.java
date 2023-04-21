package com.ps.registro.controller;

import com.ps.registro.modelo.Persona;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/persona")
public class PersonaController {

    @GetMapping("/{id}")
    public ResponseEntity<Persona> consultar(@PathVariable("id") int id) {
        Persona persona = new Persona();
        persona.setId(id);
        return ResponseEntity.ok(persona);
    }

    @PostMapping("/")
    public ResponseEntity<Persona> guardar(@RequestBody Persona persona) {
        return ResponseEntity.ok(persona);
    }
    @PutMapping("/")
    public ResponseEntity<Persona> actualizar(@RequestBody Persona persona) {
        return ResponseEntity.ok(persona);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Persona> borrar(@PathVariable("id") int id) {
        Persona persona = new Persona();
        persona.setId(id);
        return ResponseEntity.ok(persona);
    }

}
