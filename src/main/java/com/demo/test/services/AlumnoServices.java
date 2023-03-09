package com.demo.test.services;

import com.demo.test.models.Alumno;
import com.demo.test.repositories.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnoServices {

    @Autowired
    private AlumnoRepository alumnoRepository;

    public Alumno guardarAlumno(Alumno alumno){
        Alumno alumnoGuardado = alumnoRepository.save(alumno);
        return alumnoGuardado;
    }

    public List<Alumno> getAllAlumnos() {
        return alumnoRepository.findAll();
    }
}
