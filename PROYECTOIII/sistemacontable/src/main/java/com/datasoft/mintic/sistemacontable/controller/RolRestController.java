package com.datasoft.mintic.sistemacontable.controller;

import com.datasoft.mintic.sistemacontable.entity.Rol;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
//Ruta de nuestro controlador Rol
@RequestMapping("/api")
public class RolRestController {

    //Metodo Get -> busqueda por id, en nuestra ruta debemos agregar el id
    @GetMapping("/rol/{id}")
    public Rol findById (@PathVariable long id){
        Rol rol1 = new Rol(1,"Administrador",true);
        return rol1;
    }

    //Metodo Get -> Busqueda de todos los objetos de mi clase
    @GetMapping("/rol")
    public List<Rol> findAll(){
        List<Rol> roles = new ArrayList<Rol>();
        Rol rol1 = new Rol(1,"Administrador",true);
        roles.add(rol1);
        Rol rol2 = new Rol(2,"Operador",true);
        roles.add(rol2);
        return roles;
    }

    //Crear un rol
    @PostMapping("/rol")
    public Rol createRol(@RequestBody Rol rol ){
        Rol neoRol = new Rol(rol.setIdRol(rol.setIdRol()), rol.setDescripcionRol(rol.getDescripcionRol()),true);
        return  neoRol;

    }


}
