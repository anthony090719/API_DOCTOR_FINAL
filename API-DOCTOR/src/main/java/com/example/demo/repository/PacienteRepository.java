package com.example.demo.repository;


import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.Paciente;

public interface PacienteRepository extends CrudRepository<Paciente, Long> {

}
