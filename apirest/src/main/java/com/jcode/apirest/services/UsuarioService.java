package com.jcode.apirest.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jcode.apirest.models.UsuarioModel;
import com.jcode.apirest.repositories.UsuarioRepository;

@Service
public class UsuarioService {
    

    @Autowired
    UsuarioRepository usuarioRepository;

    public ArrayList<UsuarioModel> obtenerUsuarios() {
        return (ArrayList<UsuarioModel>)usuarioRepository.findAll();
    }
    //actualiza con save
    public UsuarioModel guardarUsuario(UsuarioModel usuario) {
        return usuarioRepository.save(usuario);
    }

    public Optional<UsuarioModel> obtenerPorId(Long id) {
        return usuarioRepository.findById(id);
    }

    //se llama optional el metodo porque si no hay id no importa

    public ArrayList<UsuarioModel> obtenerPorPrioridad(Integer prioridad) {
        return usuarioRepository.findByPrioridad(prioridad);
    }

    //eliminar un usuario
    public boolean eliminarUsuario(Long id) {
        try {
            usuarioRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }


}

