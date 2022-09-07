package com.datasoft.mintic.sistemacontable.service;

import com.datasoft.mintic.sistemacontable.entity.Rol;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolService implements IRolService{

    @Override
    public Rol findById(long id) {
        Rol rolOne = new Rol(id,"Administrador",true);
        return rolOne;
    }

    @Override
    public List<Rol> findAll() {
        return null;
    }

    @Override
    public Rol createRol(Rol rol) {
        return null;
    }

    @Override
    public Rol updateRol(long id, Rol rol) {
        return null;
    }

    @Override
    public void deleteRol(long id) {

    }
}
