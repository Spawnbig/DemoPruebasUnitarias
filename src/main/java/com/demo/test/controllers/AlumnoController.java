package com.demo.test.controllers;

import com.demo.test.models.Alumno;
import com.demo.test.services.AlumnoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alumno")
public class AlumnoController {

    @Autowired
    private AlumnoServices alumnoServices;

    @PostMapping
    public ResponseEntity<?> guardarAlumno(@RequestBody Alumno alumno){
        try{
            Alumno a = alumnoServices.guardarAlumno(alumno);
            return ResponseEntity.ok().body(a);
        }catch (Exception e){
            return ResponseEntity.badRequest().body("No se ha podido guardar el alumno");
        }
    }

    @GetMapping
    public ResponseEntity<List<Alumno>> mostrarTodosAlumnos(){
        return ResponseEntity.ok().body(alumnoServices.getAllAlumnos());
    }

}
