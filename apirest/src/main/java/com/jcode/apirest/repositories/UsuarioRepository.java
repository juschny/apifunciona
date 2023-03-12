package com.jcode.apirest.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jcode.apirest.models.UsuarioModel;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel , Long> {
    public abstract ArrayList<UsuarioModel> findByPrioridad(Integer prioridad);
}

// yo puedo usar findByName findByEmail y asi
