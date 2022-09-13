package com.datasoft.mintic.sistemacontable.service;

import com.datasoft.mintic.sistemacontable.entity.Rol;
import com.datasoft.mintic.sistemacontable.repository.IRolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RolService implements IRolService {

    @Autowired
    private IRolRepository rolRepository;

    @Override
    public Rol findById(long id) {
        Optional<Rol> rol = rolRepository.findById(id);
        return rol.get();
    }

    @Override
    public List<Rol> findAll() {
<<<<<<< HEAD
        List<Rol> roles = new ArrayList<Rol>();
        Rol rol1 = new Rol(1,"Administrador",true);
        roles.add(rol1);
        Rol rol2 = new Rol(2,"Operador",true);
        roles.add(rol2);
=======
        List<Rol> roles = (List<Rol>) rolRepository.findAll();
>>>>>>> origin
        return roles;
    }

    @Override
    public Rol createRol(Rol rol) {
<<<<<<< HEAD
        Rol nuevoRol = new Rol(rol.getIdRol(),rol.getDescripcionRol(),rol.isEstadoRol());
=======
        Rol nuevoRol = rolRepository.save(rol);
>>>>>>> origin
        return nuevoRol;
    }

    @Override
    public Rol updateRol(long id, Rol rol) {
        Rol putRol = findById(id);
        putRol.setDescripcionRol(rol.getDescripcionRol());
        putRol.setEstadoRol(rol.isEstadoRol());
        return putRol;
    }

    @Override
    public void deleteRol(long id) {

        Rol delRol = findById(id);
    }
}
